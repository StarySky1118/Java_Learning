package com.hypergraph.hashsetdetial_;

// HashSet第一次添加时的源码分析
public class FistAddDetails {
    public static void main(String[] args) {
        /*
            1、HashSet实例方法：add()。实际调用HashMap的put()实例方法。
            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
                // PRESENT是HashSet的常量，private static final Object PRESENT = new Object();
                // 用来填充键值对中的VALUE。
            }

            2、HashMap实例方法：put()。
            public V put(K key, V value) {
                 //
                 return putVal(hash(key), key, value, false, true);
            }

            3、HashMap静态方法：hash()。将根据键是否为空利用hashCode()方法生成hash值。
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }

            4、HashMap静态方法putVal()。
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
                Node<K,V>[] tab;
                Node<K,V> p;
                int n, i;

                // 将table赋给tab，将tab长度赋给n，若tab为空，则执行resize()并将结果赋给tab，用n接收新的tab长度
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;

                // i = (n - 1) & hash p = tab[i]，若p==null，即新结点应放置的位置为空，不发生冲突
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null); // 创建新结点，并放在下标为i的位置
                else { // 发生了冲突
                    Node<K,V> e; // 心得体会：需要的变量在代码块的开始定义
                    K k;
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        // 如果p指向结点的哈希值与带插入结点哈希值相等 并且 (待插入位置处的结点与带插入结点的键指向同一对象 或 可以使用equals方法判断相等)
                        // 此时新结点不能加入
                        e = p; // e指向带插入结点位置处的已有结点
                    else if (p instanceof TreeNode) // 判断p是不是一棵红黑树，若是，按下面代码进行添加
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    else { // 此时，p指向结点与与待插入结点不是重复的，应继续前往链表进行判断
                        // 遍历这个链表
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) { // 说明链表中没有和待插入结点相同的结点
                                p.next = newNode(hash, key, value, null); // 将新结点插入链表的最后
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                // 添加新结点后立即判断链表是否应该变为红黑树
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                // 说明链表中找到了与待插入结点相同的结点
                                break;
                            p = e;
                        }
                    }
                    if (e != null) { // existing mapping for key
                        // 若待插入下标处已存在的结点不为空
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue; // 将返回旧值
                    }
                }
                ++modCount; // 修改次数++
                if (++size > threshold) // size++，若size比门槛大，则需进行扩容，调用resize()
                    resize();
                afterNodeInsertion(evict); // 空函数
                return null;
            }

            5、HashMap静态方法resize()。将返回结点数组。
            final Node<K,V>[] resize() {
                Node<K,V>[] oldTab = table; // oldTab指向table
                int oldCap = (oldTab == null) ? 0 : oldTab.length; // 获取oldTab(即table)长度
                int oldThr = threshold; // 旧门槛 = threshold = 0，门槛——数组需要扩容时结点的数量
                int newCap, newThr = 0; // 新容量和新门槛
                if (oldCap > 0) { // 旧容量大于0
                    if (oldCap >= MAXIMUM_CAPACITY) {
                        threshold = Integer.MAX_VALUE;
                        return oldTab;
                    }
                    else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                             oldCap >= DEFAULT_INITIAL_CAPACITY)
                        newThr = oldThr << 1; // double threshold
                }
                else if (oldThr > 0) // 旧门槛大于0
                    newCap = oldThr;
                else {               // zero initial threshold signifies using defaults
                    newCap = DEFAULT_INITIAL_CAPACITY; // 新容量 = DEFAULT_INITIAL_CAPACITY常量，值为16
                    newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY); // 新门槛 = 负载系数 * DEFAULT_INITIAL_CAPACITY 取整
                }
                if (newThr == 0) {
                    float ft = (float)newCap * loadFactor;
                    newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                              (int)ft : Integer.MAX_VALUE);
                }
                threshold = newThr; // 门槛 = 新门槛
                @SuppressWarnings({"rawtypes","unchecked"})
                Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap]; // 新结点数组
                table = newTab; // HashMap对象的table = 新结点数组
                if (oldTab != null) { // 旧表非空
                    for (int j = 0; j < oldCap; ++j) {
                        Node<K,V> e;
                        if ((e = oldTab[j]) != null) {
                            oldTab[j] = null;
                            if (e.next == null)
                                newTab[e.hash & (newCap - 1)] = e;
                            else if (e instanceof TreeNode)
                                ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                            else { // preserve order
                                Node<K,V> loHead = null, loTail = null;
                                Node<K,V> hiHead = null, hiTail = null;
                                Node<K,V> next;
                                do {
                                    next = e.next;
                                    if ((e.hash & oldCap) == 0) {
                                        if (loTail == null)
                                            loHead = e;
                                        else
                                            loTail.next = e;
                                        loTail = e;
                                    }
                                    else {
                                        if (hiTail == null)
                                            hiHead = e;
                                        else
                                            hiTail.next = e;
                                        hiTail = e;
                                    }
                                } while ((e = next) != null);
                                if (loTail != null) {
                                    loTail.next = null;
                                    newTab[j] = loHead;
                                }
                                if (hiTail != null) {
                                    hiTail.next = null;
                                    newTab[j + oldCap] = hiHead;
                                }
                            }
                        }
                    }
                }
                return newTab; // 返回新表
            }
         */
    }
}

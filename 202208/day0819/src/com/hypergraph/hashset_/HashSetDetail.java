package com.hypergraph.hashset_;

public class HashSetDetail {
    /*
        一、底层是HashMap，但Value值为Object空对象
        private transient HashMap<E,Object> map;
        private static final Object PRESENT = new Object();
        二、无参构造器
        1、
        public HashSet() {
            map = new HashMap<>();
        }
       2、
       public HashMap() {
            // 加载因子取DEFAULT_LOAD_FACTOR(0.75)
            this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
       }
       static final float DEFAULT_LOAD_FACTOR = 0.75f;
       三、添加
       1、
       set.add("String");
       2、HashSet中的add()方法
       public boolean add(E e) {
            // 将(e, PRESENT)键值对放入map，其中 private static final Object PRESENT = new Object();
            // PRESENT是空Object对象
            return map.put(e, PRESENT)==null;
       }
       3、HashMap中的put()
       public V put(K key, V value) {
           return putVal(hash(key), key, value, false, true);
       }
       4、HashMap中的hash()
       key = null，哈希值为0；否则利用key.hashCode()^(h >>> 16)计算哈希值
        static final int hash(Object key) {
            int h;
            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        }
        5、HashMap中的putVal()
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
            Node<K,V>[] tab; // 获取map的table
            Node<K,V> p; // 用来存放table[(n-1) & hash]
            int n, i; // 用来记录table容量 和 应该存放结点的下标
            if ((tab = table) == null || (n = tab.length) == 0) // 若table为空 或 容量为0
                n = (tab = resize()).length; // 将table扩容 再将扩容后的容量返回
            if ((p = tab[i = (n - 1) & hash]) == null) // 若下标处无结点
                tab[i] = newNode(hash, key, value, null); // 将新结点填入
            else {
                Node<K,V> e; K k;
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount;
            if (++size > threshold) // 若整个数据结构结点个数大于临界值
                resize(); // 进行扩容
            afterNodeInsertion(evict);
            return null;
        }
        6、HashMap中的resize()
        final Node<K,V>[] resize() {
            Node<K,V>[] oldTab = table; // 获取旧表
            int oldCap = (oldTab == null) ? 0 : oldTab.length; // 获取旧容量
            int oldThr = threshold; // 获取旧临界值，threshold默认为0
            int newCap, newThr = 0; // 新容量，新临界值
            if (oldCap > 0) { // 若旧容量大于0
                if (oldCap >= MAXIMUM_CAPACITY) { // 旧容量大于等于最大容量
                    threshold = Integer.MAX_VALUE;
                    return oldTab;
                }
                else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&  // 新容量是旧容量的两倍，且小于最大容量
                         oldCap >= DEFAULT_INITIAL_CAPACITY) // 旧容量 >= 默认初始容量16
                    newThr = oldThr << 1; // double threshold // 新临界值 = 2 * 旧临界值
            }
            else if (oldThr > 0) // initial capacity was placed in threshold
                newCap = oldThr;
            else {               // zero initial threshold signifies using defaults
                newCap = DEFAULT_INITIAL_CAPACITY; // 新容量 = DEFAULT_INITIAL_CAPACITY(=16)
                newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY); // 新临界值 = 0.75 * 16
            }
            if (newThr == 0) {
                float ft = (float)newCap * loadFactor;
                newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                          (int)ft : Integer.MAX_VALUE);
            }
            threshold = newThr; // 临界值 = 新临界值
            @SuppressWarnings({"rawtypes","unchecked"})
            // 创建容量为 新容量 的Node数组，并让table指向
            Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
            table = newTab;
            if (oldTab != null) { // 扩容之后，重新分布结点
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
            return newTab;
        }

    */
}

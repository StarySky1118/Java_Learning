package com.zzy.treemap_;

public class TreeMapDetail {
    /*
        一、无参构造器
        public TreeMap() {
            comparator = null; // 比较器置为null
        }
        private final Comparator<? super K> comparator;
        private transient int size = 0; // 大小置为空
        private transient int modCount = 0;
        二、put()方法
        1、
        public V put(K key, V value) {
            Entry<K,V> t = root; // 记录根结点
            if (t == null) { // 为空树
                compare(key, key); // type (and possibly null) check

                root = new Entry<>(key, value, null); // 创建新结点确立为根
                size = 1;
                modCount++;
                return null;
            }
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator; // 记录比较器
            if (cpr != null) { // 使用构造器时填入了比较器对象参数
                do {
                    parent = t;
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else
                        return t.setValue(value);
                } while (t != null);
            }
            else { // 未传入比较器对象
                if (key == null) // 键为空
                    throw new NullPointerException();
                @SuppressWarnings("unchecked")
                    Comparable<? super K> k = (Comparable<? super K>) key; // 将key向上转型为Comparable
                do { // 从根结点开始向下依次比较
                    parent = t;
                    cmp = k.compareTo(t.key);
                    if (cmp < 0) // 键值比根小
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else
                        return t.setValue(value);
                } while (t != null);
            }
            // 至此，新插入结点将会是叶子结点
            Entry<K,V> e = new Entry<>(key, value, parent);
            if (cmp < 0)
                parent.left = e;
            else
                parent.right = e;
            fixAfterInsertion(e);
            size++;
            modCount++;
            return null;
        }
    */
}

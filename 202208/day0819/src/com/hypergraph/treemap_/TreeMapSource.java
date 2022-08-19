package com.hypergraph.treemap_;

import java.util.TreeMap;

public class TreeMapSource {
    /*
        一、TreeMap底层有private final Comparator<? super K> comparator;

        二、有参构造器：给一个匿名内部类对象
        1、
        public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
        }
        2、private transient int size = 0; // 树大小为0
        3、private transient int modCount = 0; // 修改次数为0
        三、添加
        1、
        public V put(K key, V value) {
            Entry<K,V> t = root; // 记录根结点
            if (t == null) { // 没根
                // 使用比较器
                compare(key, key); // type (and possibly null) check

                root = new Entry<>(key, value, null); // 新建结点
                size = 1; // 树大小++
                modCount++; // 修改次数++
                return null; //
            }
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator; // 取比较器
            if (cpr != null) { // 比较器不为空
                do {
                    parent = t; // parent指向双亲结点
                    cmp = cpr.compare(key, t.key); // 比较插入数据的key和双亲结点的
                    if (cmp < 0)
                        t = t.left; // 前往左侧
                    else if (cmp > 0)
                        t = t.right; // 前往右侧
                    else
                        return t.setValue(value);
                } while (t != null);
            }
            else {
                if (key == null)
                    throw new NullPointerException();
                @SuppressWarnings("unchecked")
                    Comparable<? super K> k = (Comparable<? super K>) key;
                do {
                    parent = t;
                    cmp = k.compareTo(t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else
                        return t.setValue(value);
                } while (t != null);
            }
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
        2、内部类Entry--树结点
        static final class Entry<K,V> implements Map.Entry<K,V> {
            K key;
            V value;
            Entry<K,V> left; // 左孩子
            Entry<K,V> right; // 右孩子
            Entry<K,V> parent; // 双亲
            boolean color = BLACK;

            Entry(K key, V value, TreeMap.Entry<K,V> parent) {
                this.key = key;
                this.value = value;
                this.parent = parent;
            }
        }
    */
}

package com.hypergraph.hashtable_;

public class HashtableSource {
    /*
        一、无参构造器
        1、
        public Hashtable() {
            this(11, 0.75f);
        }
        2、
        public Hashtable(int initialCapacity, float loadFactor) {
            if (initialCapacity < 0) // 初始容量为0
                throw new IllegalArgumentException("Illegal Capacity: "+
                                                   initialCapacity);
            if (loadFactor <= 0 || Float.isNaN(loadFactor)) // 加载因子小于等于0 或 不是数
                throw new IllegalArgumentException("Illegal Load: "+loadFactor);

            if (initialCapacity==0) // 初始容量为，则改为1
                initialCapacity = 1;
            this.loadFactor = loadFactor;
            table = new Entry<?,?>[initialCapacity];
            // 计算临界值：初始容量和加载因子乘积 和 MAX_ARRAY_SIZE + 1 中较小者取整
            threshold = (int)Math.min(initialCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
        }
        二、扩容机制
        1、
        public synchronized V put(K key, V value) {
            // Make sure the value is not null
            if (value == null) { // 值为空，抛出空指针异常
                throw new NullPointerException();
            }

            // Makes sure the key is not already in the hashtable.
            Entry<?,?> tab[] = table; // 使用tab记录table
            int hash = key.hashCode(); // 计算key的hashCode()
            int index = (hash & 0x7FFFFFFF) % tab.length; // 计算下标
            @SuppressWarnings("unchecked")
            Entry<K,V> entry = (Entry<K,V>)tab[index]; // 将结点转为Entry类型
            for(; entry != null ; entry = entry.next) { // 遍历链表
                if ((entry.hash == hash) && entry.key.equals(key)) { // 若某个结点哈希值与key值和新增结点的均相等
                    V old = entry.value;// 记录旧值
                    entry.value = value; // 改成新值
                    return old; // 返回旧值
                }
            }

            // 运行至此，未找到键相同的结点
            // 将添加新结点
            addEntry(hash, key, value, index);
            return null;
        }
        2、
        private void addEntry(int hash, K key, V value, int index) {
            modCount++; // 新增次数++

            Entry<?,?> tab[] = table; // 记录table
            if (count >= threshold) { // 若table中结点个数 大于等于 临界值
                // Rehash the table if the threshold is exceeded
                rehash(); // 重哈希，重新分布

                tab = table; // 记录重哈希后的table
                hash = key.hashCode(); // 重哈希后新结点hashCode()
                index = (hash & 0x7FFFFFFF) % tab.length; // 重哈希后新结点下标
            }

            // Creates the new entry.
            @SuppressWarnings("unchecked")
            Entry<K,V> e = (Entry<K,V>) tab[index]; // 指向下标处结点
            tab[index] = new Entry<>(hash, key, value, e); // 在下标处新建结点，在其后链接原有结点e
            count++;
        }
        3、
        protected void rehash() {
            int oldCapacity = table.length; // 记录旧容量
            Entry<?,?>[] oldMap = table; // 记录旧table

            // overflow-conscious code
            int newCapacity = (oldCapacity << 1) + 1; // 新容量 = 2 * 旧容量 + 1
            if (newCapacity - MAX_ARRAY_SIZE > 0) { // 若新容量大于 MAX_ARRAY_SIZE
                if (oldCapacity == MAX_ARRAY_SIZE)
                    // Keep running with MAX_ARRAY_SIZE buckets
                    return;
                newCapacity = MAX_ARRAY_SIZE;
            }
            Entry<?,?>[] newMap = new Entry<?,?>[newCapacity]; // 新数组

            modCount++; // 修改次数++
            threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1); // 计算临界值
            table = newMap; // table扩容

            for (int i = oldCapacity ; i-- > 0 ;) { // 旧容量内所有结点
                for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) { // 遍历链表
                    Entry<K,V> e = old; //
                    old = old.next;

                    int index = (e.hash & 0x7FFFFFFF) % newCapacity; // 重新计算下标
                    e.next = (Entry<K,V>)newMap[index]; // 链接
                    newMap[index] = e;
                }
            }
        }

    */
}

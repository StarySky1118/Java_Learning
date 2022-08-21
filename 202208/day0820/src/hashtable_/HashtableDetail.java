package hashtable_;

public class HashtableDetail {
    /*
        一、构造器
        1、无参
        public Hashtable() {
            // table容量为11，加载因子0.75
            this(11, 0.75f);
        }
        2、有参
        public Hashtable(int initialCapacity, float loadFactor) {
            if (initialCapacity < 0) // 初始容量 < 0
                throw new IllegalArgumentException("Illegal Capacity: "+
                                                   initialCapacity);
            if (loadFactor <= 0 || Float.isNaN(loadFactor)) // 加载因子不合法
                throw new IllegalArgumentException("Illegal Load: "+loadFactor);

            if (initialCapacity==0) // 初始容量 = 0
                initialCapacity = 1;
            this.loadFactor = loadFactor;
            table = new Entry<?,?>[initialCapacity];
            threshold = (int)Math.min(initialCapacity * loadFactor, MAX_ARRAY_SIZE + 1); // 临界值
        }
        二、添加
        1、put()
        public synchronized V put(K key, V value) {
            // Make sure the value is not null
            if (value == null) { // 值为null
                throw new NullPointerException();
            }

            // Makes sure the key is not already in the hashtable.
            Entry<?,?> tab[] = table;
            int hash = key.hashCode();
            int index = (hash & 0x7FFFFFFF) % tab.length; // 获取新键值对应存放的下标
            @SuppressWarnings("unchecked")
            Entry<K,V> entry = (Entry<K,V>)tab[index];
            for(; entry != null ; entry = entry.next) { // 遍历下标处的链表
                if ((entry.hash == hash) && entry.key.equals(key)) { // 某个结点的键与新键值对中的键相等
                    V old = entry.value; // 获取旧值
                    entry.value = value; // 新值存放
                    return old;
                }
            }

            addEntry(hash, key, value, index);
            return null;
        }
        2、addEntry：添加结点
        private void addEntry(int hash, K key, V value, int index) {
            modCount++; // 修改次数++

            Entry<?,?> tab[] = table;
            if (count >= threshold) { // 存放键值对数目大于临界值
                // Rehash the table if the threshold is exceeded
                rehash();

                tab = table;
                hash = key.hashCode();
                index = (hash & 0x7FFFFFFF) % tab.length;
            }

            // Creates the new entry.
            @SuppressWarnings("unchecked")
            Entry<K,V> e = (Entry<K,V>) tab[index]; // 记录结点
            tab[index] = new Entry<>(hash, key, value, e); // 直接将新结点放到表头
            count++;
        }
        3、rehash()：扩容
        protected void rehash() {
            int oldCapacity = table.length; // 旧容量
            Entry<?,?>[] oldMap = table; // 旧表

            // overflow-conscious code
            int newCapacity = (oldCapacity << 1) + 1; // 新容量 = 2 * 旧容量 + 1
            if (newCapacity - MAX_ARRAY_SIZE > 0) { // 新容量大于MAX_ARRAY_SIZE
                if (oldCapacity == MAX_ARRAY_SIZE)
                    // Keep running with MAX_ARRAY_SIZE buckets
                    return;
                newCapacity = MAX_ARRAY_SIZE;
            }
            Entry<?,?>[] newMap = new Entry<?,?>[newCapacity]; // 创建新表

            modCount++; // 修改次数++
            threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1); // 计算新的临界值
            table = newMap; // 扩容table

            // table中原有结点需要进行重新分布
            for (int i = oldCapacity ; i-- > 0 ;) { // 旧表中的每个下标
                for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) { // 下标链表中的每个结点
                    Entry<K,V> e = old;
                    old = old.next;

                    int index = (e.hash & 0x7FFFFFFF) % newCapacity; // 新下标
                    e.next = (Entry<K,V>)newMap[index];
                    newMap[index] = e;
                }
            }
        }
    */
}

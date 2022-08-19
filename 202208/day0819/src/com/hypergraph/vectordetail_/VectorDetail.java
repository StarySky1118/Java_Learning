package com.hypergraph.vectordetail_;

public class VectorDetail {
    public static void main(String[] args) {
        /*
            一、底层维护 protected Object[] elementData
            二、无参构造
            public Vector() {
                // 使用无参构造器，数组容量为10
                this(10);
            }
            三、扩容机制
            总结：根据最小容量(size+1)确定是否进行扩容，若未给定扩容增量(capacityIncrement)，则按照原容量2倍
            进行扩容；否则按扩容增量进行扩容。
            1、public synchronized boolean add(E e) {
                modCount++; // 修改次数++
                ensureCapacityHelper(elementCount + 1); // 加入之前应该确保容量足够，所需最小容量为 元素个数+1
                elementData[elementCount++] = e;
                return true;
            }
            2、private void ensureCapacityHelper(int minCapacity) {
                    // 根据最小容量确定是否进行扩容
                    // overflow-conscious code
                    if (minCapacity - elementData.length > 0) // 最小容量比当前容量大
                        grow(minCapacity);
                }
            3、private void grow(int minCapacity) {
                    // 数组扩容机制
                    // overflow-conscious code
                    int oldCapacity = elementData.length; // 获取旧容量
                    // capacityIncrement 容量增量，是使用构造器时可以给定的，默认情况下为0
                    // 若容量增量未给定，新容量 = 2 * 旧容量
                    int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                                     capacityIncrement : oldCapacity);
                    if (newCapacity - minCapacity < 0) // 新容量 < 最小容量
                        newCapacity = minCapacity;
                    if (newCapacity - MAX_ARRAY_SIZE > 0)
                        newCapacity = hugeCapacity(minCapacity);
                    elementData = Arrays.copyOf(elementData, newCapacity); // 数组复制
                }
         */
    }
}

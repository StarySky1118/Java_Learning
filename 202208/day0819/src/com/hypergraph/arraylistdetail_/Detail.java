package com.hypergraph.arraylistdetail_;

public class Detail {
    public static void main(String[] args) {

        /*
            一、ArrayList底层维护 transient Object[] elementData;

            二、无参构造器
                public ArrayList() {
                    this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA(空数组);
                }
                private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

            三、扩容机制
            总结：当所需的最小容量超过当前容量，需要扩容，按1.5倍容量进行扩容。
            1、add方法
                public boolean add(E e) {
                    // 添加之前首先应该确保内部容量足够
                    ensureCapacityInternal(size + 1);  // Increments modCount!!
                    elementData[size++] = e; // 数据填入 size++
                    return true;
                }

            2、ensureCapacityInternal方法
                private void ensureCapacityInternal(int minCapacity) {
                    ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
                }

            3、calculateCapacity方法：根据当前数组情况和最小容量(size+1)确定计算容量
                private static int calculateCapacity(Object[] elementData, int minCapacity) {
                    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) { // 如果数组为空
                        return Math.max(DEFAULT_CAPACITY, minCapacity);  // 计算容量是DEFAULT_CAPACITY(=10)和最小容量中的最大值
                    }
                    // 数组不为空，返回最小容量
                    return minCapacity;
                }

            4、ensureExplicitCapacity方法：根据确定的最小容量，判断是否进行扩容。
                private void ensureExplicitCapacity(int minCapacity) {
                    modCount++; // 修改次数++

                    // overflow-conscious code
                    if (minCapacity - elementData.length > 0) // 如果最小容量比当前数组长度大，就需要扩容
                        grow(minCapacity);
                }

            5、grow方法
                private void grow(int minCapacity) {
                        // overflow-conscious code
                        int oldCapacity = elementData.length; // 获取旧容量
                        int newCapacity = oldCapacity + (oldCapacity >> 1); // 新容量 = 1.5 * 旧容量
                        if (newCapacity - minCapacity < 0) // 新容量比最小容量小
                            newCapacity = minCapacity;
                        if (newCapacity - MAX_ARRAY_SIZE > 0) // 新容量比最大数组大小大
                            newCapacity = hugeCapacity(minCapacity);
                        // minCapacity is usually close to size, so this is a win:
                        elementData = Arrays.copyOf(elementData, newCapacity); // 数组赋值与扩容
                    }
         */
    }
}

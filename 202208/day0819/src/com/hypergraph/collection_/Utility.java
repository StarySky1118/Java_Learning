package com.hypergraph.collection_;

import java.util.Comparator;
import java.util.List;

// 工具类
public class Utility {

    /**
     * 对列表list进行冒泡排序，自定义升序或者降序
     * @param list 待排序的列表
     * @param comparator 自定义比较器
     */
    public static void bubbleSort(List list, Comparator comparator) {
        for (int i = list.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                boolean flag = false; // 是否交换过
                Object o1 = list.get(j);
                Object o2 = list.get(j+1);
                if(comparator.compare(o1, o2) > 0) {

                    list.set(j, o2);
                    list.set(j+1, o1);

                    flag = true;
                }
                if(!flag) {
                    break;
                }
            }
        }
    }


}

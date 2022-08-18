package com.hypergraph.exersice01;

import java.util.Comparator;
import java.util.List;

// 工具类
public class Utility {

    public static void bubbleSort(List list, Comparator comparator) {
        for (int i = list.size() - 1; i > 0 ; i--) {
            boolean flag = false; // 本趟是否进行交换的标志
            for (int j = 0; j < i; j++) {
                Object o1 = list.get(j);
                Object o2 = list.get(j+1);

                if(comparator.compare(o1, o2) > 0) {
                    list.set(j, o2);
                    list.set(j+1, o1);
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }


}

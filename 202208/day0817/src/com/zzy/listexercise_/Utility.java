package com.zzy.listexercise_;

import java.util.Comparator;
import java.util.List;

// 工具类
public class Utility {

    /**
     * 将list按自定义方式排序
     *
     * @param list 待排序列表
     */
    public static void bubbleSort(List list) {
        for (int i = list.size() - 1; i > 0; i--) {
            boolean flag = false; // 本趟是否进行了交换
            for (int j = 0; j < i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);

                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}

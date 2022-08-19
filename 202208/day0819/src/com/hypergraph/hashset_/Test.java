package com.hypergraph.hashset_;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();

        // 面试题
        /*
            看String类 equals() 和 hashCode() 重写情况
            1、hashCode()
            public int hashCode() {
                int h = hash; // h = 0
                if (h == 0 && value.length > 0) { // 哈希为0 且 字符串长度不为0
                    char val[] = value; // 获取字符串到字符数组

                    for (int i = 0; i < value.length; i++) { // 遍历字符数组
                        h = 31 * h + val[i]; // 即：字符串的哈希值只和存储的字符数组每个字符有关。
                    }
                    hash = h;
                }
                return h;
            }
            2、equals()
            public boolean equals(Object anObject) {
                if (this == anObject) {
                    return true;
                }
                if (anObject instanceof String) {
                    String anotherString = (String)anObject;
                    int n = value.length;
                    if (n == anotherString.value.length) {
                        char v1[] = value;
                        char v2[] = anotherString.value;
                        int i = 0;
                        while (n-- != 0) {
                            if (v1[i] != v2[i]) // 即：字符串每个字符都相等equals()返回true
                                return false;
                            i++;
                        }
                        return true;
                    }
                }
                return false;
            }
        */

        set.add("String");
        for (int i = 1; i <= 11; i++) {
            set.add(i);
        }
        set.add("wyq");
        System.out.println(set);
    }
}

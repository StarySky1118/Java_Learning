package com.equalstest;

// 演示==和equals的区别
public class EqualsTest {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str2 = str;
        System.out.println(str.equals(str2));
    }

//    public boolean equals(Object anObject) {
//        if (this == anObject) { // 直接指向同一对象
//            return true;
//        }
//        if (anObject instanceof String) {
//            String anotherString = (String)anObject; // 向下转型
//            int n = value.length;
//            if (n == anotherString.value.length) {
//                char v1[] = value;
//                char v2[] = anotherString.value;
//                int i = 0;
//                while (n-- != 0) {
//                    if (v1[i] != v2[i])
//                        return false;
//                    i++;
//                }
//                return true;
//            }
//        }
//        return false; // 不是String对象
//    }

}

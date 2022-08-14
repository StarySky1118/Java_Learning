package com.zzy.stringbuffer01;

// 演示StringBuffer构造器
public class Test01 {
    public static void main(String[] args) {
        // 缺省构造器
//        StringBuffer stringBuffer = new StringBuffer();

//        StringBuffer stringBuffer = new StringBuffer(16);
        String str = "hello";
        StringBuffer stringBuffer = new StringBuffer(str);
    }
}

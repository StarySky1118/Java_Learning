package com.zzy.stringbuffer01;

public class Test {
    public static void main(String[] args) {
        // 缺省构造器
        // 字符数组默认大小16
        StringBuffer stringBuffer = new StringBuffer();

        // public StringBuffer(int capacity)
        // 指定字符数组默认大小为capacity
        StringBuffer stringBuffer1 = new StringBuffer(18);

        // public StringBuffer(String str)
        // 字符数组大小 = 16 + str.length()
        StringBuffer stringBuffer2 = new StringBuffer("hello");
    }
}

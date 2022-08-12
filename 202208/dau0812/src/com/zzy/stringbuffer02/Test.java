package com.zzy.stringbuffer02;

public class Test {
    public static void main(String[] args) {
        // String --> StringBuffer
        // 方式1：构造器
        // String str = "Hello World!";
        // StringBuffer stringBuffer = new StringBuffer(str);

        // 方式2：使用append()实例方法
        // StringBuffer stringBuffer = new StringBuffer();
        // stringBuffer.append(str);

        // StringBuffer --> String
        StringBuffer stringBuffer = new StringBuffer("Hello World!");

        // 方式1：使用实例方法toString()
        // String str = stringBuffer.toString();

        // 方式2：使用构造器
        String str = new String(stringBuffer);
    }
}

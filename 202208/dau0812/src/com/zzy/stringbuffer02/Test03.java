package com.zzy.stringbuffer02;

public class Test03 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(str);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());

        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1);
    }
}

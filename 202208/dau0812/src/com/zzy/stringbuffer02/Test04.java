package com.zzy.stringbuffer02;


public class Test04 {
    public static void main(String[] args) {
        String name = "手机";
        Double price = 1110110.23;
        String price_str = price.toString(); // 价格转换为字符串

        // 为价格添加逗号
        StringBuffer stringBuffer = new StringBuffer(price_str);
        for (int i = price_str.indexOf('.') - 3; i >= 0; i -= 3) {
            stringBuffer.insert(i, ',');
        }

        System.out.println("商品名称\t商品价格");
        System.out.println("手机\t\t" + stringBuffer);
    }
}

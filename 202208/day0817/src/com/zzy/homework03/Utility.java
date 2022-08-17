package com.zzy.homework03;

public class Utility {

    /*
        实现思路 首先将名字分割为三份，创建StringBuilder对象进行拼接。
     */
    public static String nameTransfer(String name) {
        // 参数校验
        if(name == null) {
            throw new NullPointerException("字符串不能为空！");
        }

        // 分割
        String[] strings = name.split(" ", -1);

        // 创建StringBuilder进行拼接
        StringBuilder stringBuilder = new StringBuilder(strings[2]);
        stringBuilder.append(',').append(strings[0]).append('.').append(Character.toUpperCase(strings[1].charAt(0)));

        return stringBuilder.toString();
    }
}

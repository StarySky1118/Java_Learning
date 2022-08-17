package com.zzy.homework04;

// 工具类
public class Utility {
    /**
     * 对字符串中大写字母、小写字母和数字个数进行计数，将计数情况作为字符串返回。
     * @param str 需进行计数的字符串
     */
    /*
        实现思路 循环，将每位字符取出判断。
     */
    public static String stringCounter(String str) {
        // 参数校验
        if(str == null) {
            throw new RuntimeException("字符串不能为空！");
        }

        int uppercaseCount = 0; // 大写字母计数
        int lowercaseCount = 0; // 小写字母计数
        int digitCount = 0; // 数字计数

        // 循环取字符并进行统计
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) { // 是大写字母
                uppercaseCount++;
                continue;
            }
            if(Character.isLowerCase(c)) { // 是小写字母
                lowercaseCount++;
                continue;
            }
            if (Character.isDigit(c)) { // 是数字
                digitCount++;
                continue;
            }
        }

        // 使用StringBuilder对象进行拼接后返回
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("大写字母个数：").append(uppercaseCount).append(" ").append("小写字母个数：").append(lowercaseCount).append(" ").append("数字个数：").append(digitCount);

        return stringBuilder.toString();
    }
}

package com.zzy.homework04;

public class Utility {
    /**
     * 统计字符串str中的大写字母、小写字母和数字个数并以字符串形式返回。
     * @param str 待统计字符串
     * @return 统计情况字符串
     */
    public static String stringCounter(String str) {
        if(str == null) {
            throw new NullPointerException("字符串不能为空！");
        }

        int upperCaseCounter = 0;
        int lowerCaseCounter = 0;
        int digitCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCounter++;
                continue;
            }
            if(Character.isUpperCase(str.charAt(i))) {
                upperCaseCounter++;
                continue;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                lowerCaseCounter++;
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("大写字母个数：").append(upperCaseCounter).append(" 小写字母个数：").append(lowerCaseCounter).append(" 数字个数：").append(digitCounter);

        return sb.toString();
    }
}

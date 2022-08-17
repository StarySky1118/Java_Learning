package com.zzy.homework02;

// 工具类
public class Utility {
    /**
     * 判断字符串str各个字符是否全为数字
     * @param str 判断的字符串
     * @return 若字符串str各个字符全是数字，返回true;否则返回false
     */
    /*
        基本思路 循环，调用charAt()获取字符串每个字符，调用Character.isDigit()判断字符是否
        为数字。
     */
    public static boolean isAllDigit(String str) {
        // 参数校验
        if(str == null) {
            throw new NullPointerException("字符串不能为空！");
        }

        for (int i = 0; i < str.length(); i++) {
            if(!(Character.isDigit(str.charAt(i)))) { // 字符不是数字
                return false;
            }
        }

        return true;
    }
}

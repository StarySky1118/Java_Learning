package com.zzy.homework01;

// 工具类
public class Utility {

    /**
     * 将字符串str [start,end]范围内字符反转后返回。
     *
     * @param str   带翻转字符串
     * @param start 下界
     * @param end   上界
     * @return 翻转后的字符串
     */
    /*
        实现思路 首先将字符串转换为字符数组，使用双指针进行交换。
     */
    public static String reverse(String str, int start, int end) {
        // 参数校验
        if (str == null) {
            throw new NullPointerException("字符串不能为空！");
        }

        if (!(start >= 0 && start < end && end < str.length())) {
            throw new ArrayIndexOutOfBoundsException("范围参数不正确！");
        }

        // 转换为字符数组并进行交换
        char[] chars = str.toCharArray();
        char temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }

    public static String reverse(String str) {
        return reverse(str, 0, str.length() - 1);
    }
}

package com.zzy.homework01;

public class Utility {
    /**
     * 将字符串str [start,end] 范围内的子串翻转
     * @param str 待翻转字符串
     * @param start 开始下标
     * @param end 结束下标
     * @return 反转后的字符串
     */
    /*
        基本思路 首先将str转换成为字符数组，使用双指针从两个方向遍历数组并进行交换。
     */
    public static String reverse(String str, int start, int end) {
        // 参数校验
        if(str == null) {
            throw new NullPointerException("字符串不能为空...");
        }

        if(!(start >= 0 && start < end && end <= str.length()-1)) {
            throw new ArrayIndexOutOfBoundsException("下标输入有误...");
        }

        // 转换为字符数组
        char[] chars = str.toCharArray();

        char temp;
        // 交换
        for(int i = start, j = end; j > i; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }

    /**
     * 将字符串str [start,end] 范围内的子串翻转
     * @param str 待翻转字符串
     * @param start 开始下标
     * @param end 结束下标
     * @return 反转后的字符串
     */
    /*
        基本思路 首先将str划分为三部分：str1--[0, start-1] str2--[start, end] str3--[end+1, str.length()-1]
        将第二部分转换为StringBuilder类型，将其翻转，将str1插入，将str3添加。
     */
    public static String reverse01(String str, int start, int end) {
        // 参数校验
        if(str == null) {
            throw new NullPointerException("字符串不能为空...");
        }

        if(!(start >= 0 && start < end && end <= str.length()-1)) {
            throw new ArrayIndexOutOfBoundsException("下标输入有误...");
        }

        // 划分
        String str1 = str.substring(0, start);
        String str2 = str.substring(start, end+1);
        String str3 = str.substring(end+1, str.length());

        // 将中间部分转换为StringBuilder，翻转、插入、添加
        StringBuilder sb = new StringBuilder(str2);
        sb.reverse().insert(0, str1).append(str3);

        // 转换为String并返回
        return sb.toString();
    }

    /**
     * 将字符串str翻转
     * @param str 待翻转字符串
     * @return 翻转后的字符串
     */
    public static String reverse01(String str) {
        if(str == null) {
            throw new NullPointerException("字符串不能为空...");
        }
        return reverse01(str, 0, str.length() - 1);
    }

}

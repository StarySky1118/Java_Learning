package com.zzy.homework01;

public class Utility {

    /**
     * 返回反转字符串
     * @param str 要进行反转的字符串
     * @param start 字符串开始下标
     * @param end 字符串结束下标
     * @return
     */
    /*
        实现思路：首先将str进行分割：str1表示str[0, start)的子串，str2表示str[start, end)的子串，
        str3表示str[end, str.length()-1]的子串，以str2为参数创建StringBuilder对象，将str1插入，
        将str2添加。
    */
    public static String reverse(String str, int start, int end) {
        // 参数校验
        if(!(str != null && start >= 0 && start < (end + 1) && end <= str.length()) )
            throw new RuntimeException("参数不正确!");

        // 分割
        String str1 = str.substring(0, start);
        String str2 = str.substring(start, end);
        String str3 = str.substring(end, str.length());

        // 创建StringBuilder对象
        StringBuilder sb = new StringBuilder(str2);
        // 反转
        sb = sb.reverse();

        // 拼接
        String retString = sb.insert(0, str1).append(str3).toString();

        return retString;
    }
}

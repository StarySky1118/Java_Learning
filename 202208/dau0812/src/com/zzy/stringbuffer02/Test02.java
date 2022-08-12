package com.zzy.stringbuffer02;

public class Test02 {
    public static void main(String[] args) {
        // 实例方法 “增加”
        // public synchronized StringBuffer append(String str)
        // 向原有StringBuffer对象添加字符串str
        StringBuffer stringBuffer = new StringBuffer("蔡徐坤，");
//        stringBuffer.append("鸡你太美").append("，");
//        System.out.println(stringBuffer.toString());

        // 实例方法 “删除”
        // public synchronized StringBuffer delete(int start, int end)
        // 删除[start, end)
//        stringBuffer.delete(0, 2);
//        System.out.println(stringBuffer);

        // 实例方法 “替换”
        // public synchronized StringBuffer replace(int start, int end, String str)
        // 使用str替换[start,end)之间的字符串
//        stringBuffer.replace(0, 1, "坤坤");
//        System.out.println(stringBuffer);

        // 实例方法 “查找”
        // public int indexOf(String str)
        // 返回子串str在StringBuffer对象中第一次出现的下标
//        System.out.println(stringBuffer.indexOf("徐坤"));

        // 实例方法 “插入”
        // public synchronized StringBuffer insert(int offset, String str)
        // 在下标offset处插入字符串str
//        stringBuffer.insert(4, "鸡你太美");
//        System.out.println(stringBuffer);

        // 实例方法 “长度”
        // public synchronized int length()
        // 返回StringBuffer对象字符串长度
        System.out.println(stringBuffer.length());
    }
}

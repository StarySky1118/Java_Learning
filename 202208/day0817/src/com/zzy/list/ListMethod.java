package com.zzy.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("能天使");
        list.add("黑");
        list.add("空弦");

        List list1 = new ArrayList();
        list1.add("艾雅法拉");
        list1.add("银灰");
        list1.add("煌");

        // 实例方法 “添加”
        // void add(int index, E element)
        list.add(1, "鸿雪");

        // 实例方法 “添加全部”
        // boolean addAll(int index, Collection<? extends E> c);
        list.addAll(list.indexOf("空弦"), list1);

        // 实例方法 “获取下标”与“获取最后出现下标”
        // int indexOf(Object o)
//        System.out.println(list.indexOf("煌"));
//        System.out.println(list.lastIndexOf("煌"));

        // 实例方法 “移除”
        // 将返回移除的对象
//        list.remove(0);

        // 实例方法 “设置”
        // E set(int index, E element)
        list.set(0, "棘刺");

        // 实例方法 “子列表”
        // List<E> subList(int fromIndex, int toIndex)
        // 返回[fromIndex,toIndex)子列表
        System.out.println(list.subList(1, 4));


        System.out.println(list);
    }
}

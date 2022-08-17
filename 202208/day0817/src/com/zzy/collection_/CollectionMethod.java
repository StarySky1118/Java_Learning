package com.zzy.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {

        List list = new ArrayList();
        // add: 添加单个元素
        list.add("subnautica");
        list.add(79);
        list.add(true);

        // remove: 删除单个对象
        // 参数为下标时，返回删除的对象
//        System.out.println(list.remove(0));
        // 参数为对象时，返回是否删除成功
//        System.out.println(list.remove(Integer.valueOf(79)));;

        // contains: 查询是否包含某个元素
//        System.out.println(list.contains("sub"));
//        System.out.println(list.contains(79));

        // size: 返回元素个数
//        System.out.println(list.size());

        // isEmpty: 判断List是否为空
//        System.out.println(list.isEmpty());

        // clear: 清空List
//        list.clear();
//        System.out.println("list已清空...");

        // addAll: 添加多个元素
        // 复制集合中的元素到一个List
        List list2 = new ArrayList();
        list2.add("罗翔说刑法");
        list2.add(12);
        list2.add(true);
        list.addAll(list2);

        // containsAll: 判断多个元素是否同时存在
        System.out.println(list.containsAll(list2));

        // removeAll: 删除多个元素
        list.removeAll(list2);


        System.out.println("list = " + list);
    }
}

package com.hypergraph.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();

        // put方法
        // V put(K key, V value)
        map.put("凯文·杜兰特", "死神");
        map.put("凯文·杜兰特", "老1.5");
        map.put("勒布朗·詹姆斯", "小皇帝");
        map.put("拉塞尔·维斯布鲁克", "忍者神龟");

        // remove方法
        // V remove(Object key);
//        System.out.println(map.remove("凯文杜兰特"));

        // get方法
        // V get(Object key)
//        System.out.println(map.get("凯文·杜兰特"));

        // size方法
        // int size()
//        System.out.println(map.size());

        // isEmpty()方法
        // boolean isEmpty()
        System.out.println(map.isEmpty());

        // clear()
        // void clear()
//        map.clear();

        // containsKey()
        // boolean containsKey(Object key)
        System.out.println(map.containsKey("ss"));

        System.out.println(map);
    }
}

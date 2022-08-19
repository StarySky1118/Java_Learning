package com.hypergraph.map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("凯文·杜兰特", "老1.5");
        map.put("勒布朗·詹姆斯", "小皇帝");
        map.put("拉塞尔·维斯布鲁克", "忍者神龟");

        // 第一组：通过keySet
        Set keySet = map.keySet();
        // (1) 增强for
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        // (2) 迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 第二组：通过values
        Collection collection = map.values();
        // (1) 增强for
        for (Object value : collection) {
            System.out.println(value);
        }
        // (2) 迭代器
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            System.out.println(key);
        }

        // 第三组：通过entrySet
        System.out.println("---通过entrySet遍历---");
        Set entrySet = map.entrySet();
        // (1) 增强for
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        // (2) 迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object o =  iterator2.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}

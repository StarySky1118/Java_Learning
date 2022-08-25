package com.zzy.mapfor;

import java.util.*;

// 演示Map的三种遍历方式
public class MapForTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("01", "詹姆斯");
        map.put("02", "韦德");
        map.put("03", "诺维斯基");
        map.put("04", "阿德托昆博");

        // ---entrySet遍历---
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        // ---values遍历---
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next);
        }

        // ---keySet遍历---
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }


    }
}

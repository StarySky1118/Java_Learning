package com.zzy.homework02_;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();

        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        map.put("jack", 2600);

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            map.put(key, map.get(key) + 100);
        }

        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            Integer next =  iterator.next();
            System.out.println(next);
        }



        System.out.println(map);
    }
}

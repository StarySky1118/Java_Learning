package com.zzy.hashset_;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.put("01", "詹姆斯");
        map.put("02", "库里");

        System.out.println("---使用keySet---");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("---使用values---");
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("---使用entrySet---");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}

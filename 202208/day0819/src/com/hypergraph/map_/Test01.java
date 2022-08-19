package com.hypergraph.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("勒布朗·詹姆斯", "小皇帝");
        map.put("凯文·杜兰特", "死神");

        Set set = map.entrySet();
        System.out.println(set.getClass());

        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}

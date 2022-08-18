package com.hypergraph.map_;


import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("小皇帝", "勒布朗·詹姆斯");
        map.put("死神", "凯文·杜兰特");

        System.out.println(map.get("死神"));

        System.out.println(map);
    }
}

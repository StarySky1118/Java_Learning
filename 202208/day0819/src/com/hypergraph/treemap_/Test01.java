package com.hypergraph.treemap_;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        Map map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o1);
            }
        });

        map.put("勒布朗·詹姆斯", "小皇帝");
        map.put("达米恩·利拉德", "利指导");
        map.put("蒂姆·邓肯", "石佛");
    }
}

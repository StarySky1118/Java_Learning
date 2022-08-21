package hashmap_;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("01", "傲慢");
        map.put("02", "狂妄");
        map.put("03", "暴食");

//        System.out.println(map.remove("01"));

//        System.out.println(map.get("01"));

//        System.out.println(map.size());

        Collection values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(map.get(next));
        }

        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }


    }
}

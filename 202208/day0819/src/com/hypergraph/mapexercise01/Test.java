package com.hypergraph.mapexercise01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();

        Employee employee1 = new Employee("田所浩二", 18001, "114514");
        Employee employee2 = new Employee("德川", 17000, "1919810");
        Employee employee3 = new Employee("我修院", 1800, "451512");

        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee3.getId(), employee3);

        // keySet遍历
        Set keySet = map.keySet();
        System.out.println("---KeySet增强for---");
        for (Object key : keySet) {
            Employee employee = (Employee) map.get(key);
            if (employee.getSal() > 18000) {
                System.out.println(key + "-" + employee);
            }
        }

        System.out.println("---KeySet迭代器---");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Employee employee = (Employee) map.get(key);
            if (employee.getSal() > 18000) {
                System.out.println(key + "-" + employee);
            }
        }

        // entrySet遍历
        Set entrySet = map.entrySet();
        System.out.println("---entrySet增强for---");
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;

            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000) {
                System.out.println(entry.getKey() + "-" + employee);
            }
        }

        System.out.println("---entrySet迭代器---");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object o =  iterator1.next();
            Map.Entry entry = (Map.Entry) o;

            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000) {
                System.out.println(entry.getKey() + "-" + employee);
            }
        }

    }
}

package com.hypergraph.genericexercise01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("田所浩二", 2400, new MyDate(1999, 12, 12)));
        list.add(new Employee("田所浩二", 2400, new MyDate(1999, 12, 11)));
        list.add(new Employee("德川", 2400, new MyDate(1999, 11, 12)));

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // 使用名字排序
                int nameCmp = e1.getName().compareTo(e2.getName());
                if(nameCmp != 0) {
                    return nameCmp;
                }

                // 使用生日排序
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        });

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee next =  iterator.next();
            System.out.println(next);
        }


    }
}

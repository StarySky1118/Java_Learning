package com.zzy.genericexersice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("田所浩二", 2400, new MyDate(2001, 11, 11));
        Employee employee2 = new Employee("田所浩三", 2400, new MyDate(1999, 12, 12));
        Employee employee3 = new Employee("田所浩二", 2400, new MyDate(2001, 11, 12));

        List<Employee> list = new ArrayList<>();

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                // 进行名字比较
                int nameCmp = e1.getName().compareTo(e2.getName());
                if(nameCmp != 0) { // 已排序完成
                    return nameCmp;
                }

                // 进行生日比较
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        });

        for (Employee e : list) {
            System.out.println(e);
        }

    }
}

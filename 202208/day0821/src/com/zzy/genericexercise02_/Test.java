package com.zzy.genericexercise02_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee("田所浩二", 2400, new MyDate(1981, 2, 3));
        Employee employee2 = new Employee("田所浩二", 2600, new MyDate(1980, 12, 3));
        Employee employee3 = new Employee("田所浩四", 2200, new MyDate(1982, 11, 3));

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int cmp1 = employee1.getName().compareTo(employee2.getName());
                if(cmp1 != 0) { // 若仅靠名字比较成功
                    return cmp1;
                }

                return employee1.getBirthday().compareTo(employee2.getBirthday());

            }
        });

        System.out.println(list);

    }
}

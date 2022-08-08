package com.zzy.template;

import java.text.SimpleDateFormat;
import java.util.Date;

// 员工测试类
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Manager("田所浩二", "114514", 2000, 5000);
        employee.printSalaryBar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}

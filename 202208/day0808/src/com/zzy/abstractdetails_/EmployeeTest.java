package com.zzy.abstractdetails_;

// 员工测试类
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new CommonEmployee("田所浩二", "114514", 19198.10);
        Employee employee2 = new Manager("德川", "1919810", 2000, 1515);
        employee1.work();
        employee2.work();
    }
}

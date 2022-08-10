package com.zzy.exception02;

public class Test03 {
    public static void main(String[] args) {
        try {
            Person person = new Person("田所浩二");
            //person = null;
            System.out.println(person.getName());
            int num1 = 2;
            int num2 = 0;
            int res = num1 / num2;
            System.out.println(res);
        } catch (NullPointerException e) { // 捕获空指针异常
            System.out.println("空指针异常: " + e.getMessage());
        } catch (ArithmeticException e) { // 捕获算术异常
            System.out.println("算术异常: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("捕获异常: " + e.getMessage());
        } finally {
            System.out.println("关闭数据库...");
        }
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

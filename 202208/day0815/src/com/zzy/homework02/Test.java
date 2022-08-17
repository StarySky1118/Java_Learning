package com.zzy.homework02;

public class Test {
    public static void main(String[] args) {
        try {
            User user = User.register();
            System.out.println(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

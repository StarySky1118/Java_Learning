package com.zzy.customgeneric_;

public class CatTest {
    public static void main(String[] args) {
        Cat<String> cat = new Cat<>();
        cat.run(100, "String");
    }
}

package com.zzy.junit;

import org.junit.jupiter.api.Test;

public class Test01 {
    public static void main(String[] args) {

    }

    @Test
    public static void m1() {
        System.out.println("m1执行...");
    }

    @Test
    public void m2() {
        System.out.println("m2执行...");
    }
}

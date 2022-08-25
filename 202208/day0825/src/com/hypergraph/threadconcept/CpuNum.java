package com.hypergraph.threadconcept;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int num = runtime.availableProcessors();
        System.out.println(num);


    }
}

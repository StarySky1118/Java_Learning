package com.hypergraph.hashtable_;

import java.util.Hashtable;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map map = new Hashtable();

        for (int i = 1; i <= 9; i++) {
            map.put(i, i);
        }
    }
}

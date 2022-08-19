package com.hypergraph.properties_;

import java.util.Map;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) {
        Map map = new Properties();

        // 添加
        map.put("username", "jntm");
        map.put("password", "jinitaimei");

        // 使用key获取value
        System.out.println(map.get("username"));

        // 删除
        map.remove("username");

        System.out.println(map);
    }
}

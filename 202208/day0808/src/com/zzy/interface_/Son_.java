package com.zzy.interface_;

import com.zzy.abstract_.Father_;

// 儿子类
public class Son_ extends Father_ {
    public void doSome() {
        System.out.println(super.name);
    }
}

package com.zzy.homework01_;

public class Utility {
    public static String titleProcess(String str) {
        if(str == null || str.length() < 15) {
            return str;
        }
        return str.substring(0, 15) + "...";
    }
}

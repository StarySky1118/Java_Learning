package com.hypergraph.exercise01;

// 工具类
public class Utility {
    /**
     * 若title大于15个字，只显示前15个字后面跟...
     * @param title 新闻标题
     * @return 处理后的标题
     */
    public static String titleProcess(String title) {
        if(title == null || title.length() < 15) { // 无需改变
            return title;
        }

        return title.substring(0, 15) + "...";
    }
}

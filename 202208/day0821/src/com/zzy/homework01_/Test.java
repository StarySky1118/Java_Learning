package com.zzy.homework01_;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        News news1 = new News("高温红色预警连发10天！网友：可以了，再热就不礼貌了");
        News news2 = new News("股价暴跌超81%！全球第二大影院运营商或将申请破产！");

        List<News> list = new ArrayList();

        list.add(news1);
        list.add(news2);

        for (int i = list.size() - 1; i >= 0 ; i--) {
            News news = list.get(i);
            news.setTitle(Utility.titleProcess(news.getTitle()));

            System.out.println(list.get(i));
        }
    }
}

package com.hypergraph.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        News news1 = new News("新冠病例超千万，爱打不打几十块打架了收到了");
        News news2 = new News("男子想起小鱼马上的哈苏飞回阿富汗岁啊");

        List list = new ArrayList();
        list.add(news1);
        list.add(news2);

        for (int i = list.size() - 1; i >= 0; i--) {
            // 新闻标题简化
            News news = (News) list.get(i);
            String title = news.getTitle();
            news.setTitle(Utility.titleProcess(title));

            System.out.println(list.get(i));;
        }
    }
}

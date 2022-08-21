package exersice01_;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，按实际来得及时刻拉动经济克拉斯的距离");
        News news2 = new News("男子突然想起，按实际大凉快圣诞节啦房间辣司法局");

        List list = new ArrayList();

        list.add(news1);
        list.add(news2);

        for (int i = list.size() - 1; i >= 0; i--) {
            News news = (News) list.get(i);
            news.setTitle(Utility.titleProcess(news.getTitle()));
            System.out.println(list.get(i));
        }
    }
}

package collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("詹姆斯");
        list.add("韦德");
        list.add("吉诺比利");

        // 反转
//        Collections.reverse(list);

        // 洗牌
//        Collections.shuffle(list);

        // 排序
//        Collections.sort(list, new Comparator() {
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String) o1).length() - ((String) o2).length();
//            }
//        });

        // 交换
        Collections.swap(list, 0, 1);

        System.out.println(list);
    }
}

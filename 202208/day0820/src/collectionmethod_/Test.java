package collectionmethod_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        // 添加
        list.add("String");
        list.add(79);
        list.add(true);

        // 删除
//        System.out.println(list.remove("String"));
//        System.out.println(list.remove(1));

        // 包含
//        System.out.println(list.contains("String"));

//        System.out.println(list.size());
//
//        System.out.println(list.isEmpty());

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o : list) {
            System.out.println(o);
        }

    }
}

package exersice02_;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map m = new HashMap();

        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        m.put("jack", 2600);

        Set set = m.keySet();
        for (Object o : set) {
            m.put(o, ((Integer) m.get(o)) + 100);
        }

        Collection values = m.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


        System.out.println(m);
    }
}

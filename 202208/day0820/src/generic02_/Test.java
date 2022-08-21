package generic02_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("田所浩二", 24);
        Student student2 = new Student("田所浩三", 25);
        Student student3 = new Student("田所浩四", 26);

        Map<String, Student> map = new HashMap<>();

        map.put("田所浩二", student1);
        map.put("田所浩三", student2);
        map.put("田所浩四", student3);

        Set<Map.Entry<String, Student>> entries = map.entrySet();

        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

package hashsetexercise;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("田所浩二", 2400, new MyDate(1980, 12, 24));
        Employee employee2 = new Employee("田所浩二", 2500, new MyDate(1980, 12, 24));
        Employee employee3 = new Employee("田所浩三", 2400, new MyDate(1980, 12, 24));

        Set set = new HashSet();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);

        System.out.println(set);
    }
}

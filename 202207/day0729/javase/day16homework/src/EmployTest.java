// 员工测试类
public class EmployTest {
    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee("田所浩二", 12, 6000);
        e1.getSalary(11);
        Employee e2 = new HourlyEmployee("田所浩三", 12, 200, 200);
        e2.getSalary(12);
    }
}

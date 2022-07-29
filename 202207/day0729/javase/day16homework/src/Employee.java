// 员工类
public class Employee {
    // 员工姓名
    private String name;

    // 生日月份
    private int birthMonth;

    // 无参构造方法
    public Employee() {
    }

    // 有参构造方法
    public Employee(String name, int birthMonth) {
        this.name = name;
        this.birthMonth = birthMonth;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    // 发工资方法
    public void getSalary(int month){

    }
}

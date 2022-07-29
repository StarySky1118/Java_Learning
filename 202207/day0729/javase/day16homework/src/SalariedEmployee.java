// 固定工资员工类
public class SalariedEmployee extends Employee{
    // 月薪
    private double monthSalary;

    // 无参构造方法
    public SalariedEmployee() {
    }

    // 有参构造方法
    public SalariedEmployee(String name, int birthMonth, double monthSalary) {
        super(name, birthMonth);
        this.monthSalary = monthSalary;
    }

    // setter and getter
    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    // 发工资方法
    public void getSalary(int month){
        // 奖金
        int bonus = month == super.getBirthMonth() ? 100 : 0;

        System.out.println("当月工资为:" + (bonus + monthSalary));

    }
}

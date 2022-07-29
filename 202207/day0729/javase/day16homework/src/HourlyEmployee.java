// 小时工
public class HourlyEmployee extends Employee{
    // 每小时工资数
    private double salaryPerHour;

    // 每月工作小时数
    private int workingHour;

    // 无参构造
    public HourlyEmployee() {
    }

    // 有参构造
    public HourlyEmployee(String name, int birthMonth, double salaryPerHour, int workingHour) {
        super(name, birthMonth);
        this.salaryPerHour = salaryPerHour;
        this.workingHour = workingHour;
    }

    // setter and getter
    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    // 发工资方法
    public void getSalary(int month){
        // 奖金
        int bonus = month == super.getBirthMonth() ? 100 : 0;
        double salary;

        if(workingHour < 160) {
            salary = workingHour * salaryPerHour;
        } else {
            salary = 160 * salaryPerHour + (workingHour - 160) * salaryPerHour;
        }

        System.out.println("当月工资为:" + (salary + bonus));
    }
}

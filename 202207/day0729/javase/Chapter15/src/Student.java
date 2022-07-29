public class Student {
    // 姓名
    private String name;
    // 学号
    private String stuNo;

    // 无参构造方法
    public Student() {
    }

    // 有参构造方法
    public Student(String name, String stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    // setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                '}';
    }
}

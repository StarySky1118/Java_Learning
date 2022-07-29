// 用户类
public class User {
    // 用户ID
    private String uid;

    // 用户密码
    private String pwd;

    // email地址
    private String email;

    // 无参构造方法
    public User() {
    }

    // 有参构造方法
    public User(String uid, String pwd, String email) {
        this.uid = uid;
        this.pwd = pwd;
        this.email = email;
    }

    // setter and getter
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 展示个人信息
    public void showInfo() {
        System.out.println("用户名：" + uid + " 密码：" + pwd + " Email：" + email);
    }
}

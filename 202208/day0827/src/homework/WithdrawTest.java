package homework;

public class WithdrawTest {
    public static void main(String[] args) {

        User user = new User();
        Thread thread1 = new Thread(user);
        thread1.setName("用户1");
        Thread thread2 = new Thread(user);
        thread2.setName("用户2");

        thread1.start();
        thread2.start();
    }
}

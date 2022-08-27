package homework;

// 用户
public class User implements Runnable{
    private int balance = 10000; // 账户余额

    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if(balance <= 0) {
                    System.out.println("账户余额不足，取钱失败！");
                    break;
                }
                balance -= 1000;
                System.out.println(Thread.currentThread().getName() + "取钱，当前余额：" + balance);
            }

            // 休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

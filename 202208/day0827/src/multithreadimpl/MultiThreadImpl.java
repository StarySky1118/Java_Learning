package multithreadimpl;

// 多线程两种实现方式
public class MultiThreadImpl {
    public static void main(String[] args) {
//        A a1 = new A();
//        a1.setName("子线程1");
//        A a2 = new A();
//        a2.setName("子线程2");
//
//        a1.start();
//        a2.start();

        B b = new B();
        Thread thread1 = new Thread(b);
        Thread thread2 = new Thread(b);

        thread1.start();
        thread2.start();
    }
}

class A extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行...第" + i + "次");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行...第" + i + "次");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

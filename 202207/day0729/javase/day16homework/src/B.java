public class B {
    public static void main(String[] args) {
        // 创建扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        // 创建A对象
        A a = new A();
        System.out.print("请输入A的实例变量的值:");
        int i = s.nextInt();
        a.setV(i);

        // 猜数
        while(true){
            System.out.print("请输入猜测值:");
            i = s.nextInt();
            if(i < a.getV()) // 小了
                System.out.println("你的猜测小了");
            else if(i > a.getV())
                System.out.println("你的猜测大了");
            else {
                System.out.println("猜测正确");
                break;
            }
        }
    }
}

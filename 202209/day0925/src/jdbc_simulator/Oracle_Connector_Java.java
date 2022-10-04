package jdbc_simulator;

// Oracle 连接 Java
public class Oracle_Connector_Java implements JDBC_Interface{
    @Override
    public Object connect() {
        System.out.println("Java 连接 Oracle 成功！");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("正在使用 Oracle 数据库进行 crud！");
    }

    @Override
    public boolean disconnected() {
        System.out.println("Oracle 连接断开！");
        return false;
    }
}

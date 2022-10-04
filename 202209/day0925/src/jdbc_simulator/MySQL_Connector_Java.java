package jdbc_simulator;

// MySQL 连接 Java
public class MySQL_Connector_Java implements JDBC_Interface{

    @Override
    public Object connect() {
        System.out.println("Java 连接 MySQL 成功！");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("正在进行 crud 操作！");
    }

    @Override
    public boolean disconnected() {
        System.out.println("MySQL 连接断开！");
        return false;
    }
}

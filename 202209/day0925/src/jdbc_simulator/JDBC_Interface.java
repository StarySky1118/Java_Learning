package jdbc_simulator;

public interface JDBC_Interface {
    // 连接
    Object connect();

    // crud
    void crud();

    // 释放
    boolean disconnected();
}

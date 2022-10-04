package jdbc_simulator;

// 测试 JDBC
public class JDBC_Test {
    public static void main(String[] args) {
        JDBC_Interface connector_mysql = new MySQL_Connector_Java();
        connector_mysql.connect();
        connector_mysql.crud();
        connector_mysql.disconnected();

        JDBC_Interface connector_oracle = new Oracle_Connector_Java();
        connector_oracle.connect();
        connector_oracle.crud();
        connector_oracle.disconnected();
    }
}

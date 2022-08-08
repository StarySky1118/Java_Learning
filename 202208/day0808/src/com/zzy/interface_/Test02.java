package com.zzy.interface_;

// 演示多态数组机制
public class Test02 {
    public static void main(String[] args) {
        DBInterface[] dbInterfaces = new DBInterface[2];
        dbInterfaces[0] = new MySqlDB();
        dbInterfaces[1] = new OracleDB();

        for (int i = 0; i < dbInterfaces.length; i++) {
            dbInterfaces[i].connect();
            if(dbInterfaces[i] instanceof MySqlDB) {
                // 向下转型
                MySqlDB mySqlDB = (MySqlDB) dbInterfaces[i];
                mySqlDB.call();
            }
            dbInterfaces[i].close();
        }
    }
}

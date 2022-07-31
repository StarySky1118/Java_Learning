package com.zzy.houserent;

public class SysTest {
    public static void main(String[] args) {
        HouseInfoTable houseInfoTable = HouseInfoTable.houseInfoTableExample();
        SysMenu.openMenu(houseInfoTable);
    }
}

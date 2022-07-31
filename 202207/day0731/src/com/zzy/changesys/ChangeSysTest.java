package com.zzy.changesys;
// 零钱通测试程序
public class ChangeSysTest {
    public static void main(String[] args) {
        Account account = new Account("田所浩二", "114514", 200);
        SystemMenu.openMenu(account);
    }
}

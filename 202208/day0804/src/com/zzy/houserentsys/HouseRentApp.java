package com.zzy.houserentsys;

import com.zzy.houserentsys.service.HouseService;
import com.zzy.houserentsys.view.SysMenu;

// 启动类
public class HouseRentApp {
    // main方法，启动菜单
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.example();

        SysMenu.mainMenu(houseService);
    }
}

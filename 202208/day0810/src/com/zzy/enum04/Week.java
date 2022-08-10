package com.zzy.enum04;

// 枚举类星期
public enum Week {
    SUNDAY("星期日"), MONDAY("星期一"), TUESDAY("星期二"),
    ;

    private String name; // 星期名称

    // 私有化构造器
    Week(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
}

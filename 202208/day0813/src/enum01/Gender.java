package enum01;

// 性别枚举类
public enum Gender {
    MALE('男'), FEMALE('女');
    private final char name; // 性别名称

    // 构造器私有化
    Gender(char name) {
        this.name = name;
    }

    // getter
    public char getName() {
        return name;
    }
}

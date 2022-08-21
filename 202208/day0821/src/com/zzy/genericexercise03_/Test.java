package com.zzy.genericexercise03_;

public class Test {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();

        userDAO.save("114514", new User(114514, 24, "田所浩二"));


    }
}

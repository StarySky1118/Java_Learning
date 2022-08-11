package com.zzy.exception02;

// 年龄异常
public class AgeException extends RuntimeException{
    // 构造器
    public AgeException(String message) {
        super(message);
    }
}

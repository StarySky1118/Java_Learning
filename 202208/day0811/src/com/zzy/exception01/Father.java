package com.zzy.exception01;

public class Father {
    public void m1() throws NullPointerException{

    }
}

class Son extends Father {
    @Override
    public void m1() throws NullPointerException {
        super.m1();
    }
}

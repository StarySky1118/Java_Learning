package com.hypergraph.threadexit;

public class Dog implements Runnable{
    private boolean loop = true; // 循环标志

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        int count = 0;
        while (loop) {
            System.out.println("汪汪... " + (++count));
        }
    }
}

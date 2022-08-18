package com.hypergraph.hashmapsimulator;

// 结点
public class Node {
    private String name; // 结点内容
    private Node next; // 下一结点指针

    public Node() {
    }

    public Node(String name, Node next) {
        this.name = name;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

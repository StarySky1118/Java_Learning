package com.hypergraph.exercise01;

// 新闻类
public class News {
    private String title; // 标题
    private String content; // 内容

    // 构造器
    public News(String title) {
        this.title = title;
    }

    // getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "新闻标题: " + title;
    }
}

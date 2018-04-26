package com.jojo.demogreetingapp;

public class Greeting {

    private final long id;
    private final String content;
    private final String sexuality;

    public Greeting(long id, String content, String sexuality) {
        this.id = id;
        this.content = content;
        this.sexuality = sexuality;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getSexuality() {
        return sexuality;
    }
}

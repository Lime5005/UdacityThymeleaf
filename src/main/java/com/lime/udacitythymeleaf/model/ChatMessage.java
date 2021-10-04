package com.lime.udacitythymeleaf.model;

public class ChatMessage {
    private String username;
    private String msg;

    public ChatMessage(String username, String msg) {
        this.username = username;
        this.msg = msg;
    }

    public ChatMessage() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

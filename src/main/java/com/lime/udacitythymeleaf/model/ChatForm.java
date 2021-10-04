package com.lime.udacitythymeleaf.model;

public class ChatForm {

    private String username;

    private String messageText;

    private MsgType messageType;

    public MsgType getMessageType() {
        return messageType;
    }

    public void setMessageType(MsgType messageType) {
        this.messageType = messageType;
    }

    //    private String messageType;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

//    public String getMessageType() {
//        return messageType;
//    }
//
//    public void setMessageType(String messageType) {
//        this.messageType = messageType;
//    }

}

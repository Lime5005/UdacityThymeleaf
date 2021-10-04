package com.lime.udacitythymeleaf.service;

import com.lime.udacitythymeleaf.model.ChatForm;
import com.lime.udacitythymeleaf.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class MessageListService {

    private List<String> messages;
    private List<ChatMessage> chatMessages;

    @PostConstruct
    public void PostConstruct() {
        this.messages = new ArrayList<>();
        this.chatMessages = new ArrayList<>();
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public void addChat(ChatForm chatForm) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()) {
            case "Say":
                chatMessage.setMsg(chatForm.getMessageText());
                break;
            case "Shout":
                chatMessage.setMsg(chatForm.getMessageText().toUpperCase(Locale.ROOT));
                break;
            case "Whisper":
                chatMessage.setMsg(chatForm.getMessageText().toLowerCase(Locale.ROOT));
                break;
        }
        this.chatMessages.add(chatMessage);
    }

    public List<ChatMessage> getChats() {
        return chatMessages;
    }
}

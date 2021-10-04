package com.lime.udacitythymeleaf.controller;

import com.lime.udacitythymeleaf.model.ChatForm;
import com.lime.udacitythymeleaf.service.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private MessageListService messageListService;

    public ChatController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }

    @GetMapping
    public String showChats(ChatForm chatForm, Model model) {
        model.addAttribute("chats", messageListService.getChats());
        return "chat";
    }

    @PostMapping
    public String addChats(ChatForm chatForm, Model model) {
        this.messageListService.addChat(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chats", messageListService.getChats());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes () {
        return new String[] { "Say", "Shout", "Whisper" };
    }
}

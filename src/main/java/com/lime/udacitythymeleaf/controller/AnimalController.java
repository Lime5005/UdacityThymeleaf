package com.lime.udacitythymeleaf.controller;

import com.lime.udacitythymeleaf.model.MessageForm;
import com.lime.udacitythymeleaf.service.MessageListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    private MessageListService messageListService;

    public AnimalController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }


    @GetMapping
    public String getAnimals(MessageForm messageForm, Model model) {
        messageListService.addMessage("Animals");
        model.addAttribute("greetings", messageListService.getMessages());
        return "animal";
    }


    @PostMapping
    public String addAnimals(MessageForm messageForm, Model model) {
        messageListService.addMessage("Animal name: " + messageForm.getAnimalName() + " and it's " + messageForm.getAdjective());
        model.addAttribute("greetings", messageListService.getMessages());
        return "animal";
    }
}

package com.bhatti.botwithopenai.controller;

import com.bhatti.botwithopenai.service.BotService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BotController {

    private final BotService botService;

    public BotController(BotService botService) {
        this.botService = botService;
    }

    @GetMapping("/")
    public String index( ){
        return "index.html";
    }
    @PostMapping("/chatbot")
    @ResponseBody
    public String chat(@RequestParam("message") String message) {
        return botService.handleQuery(message.trim()) ;
    }
}


package com.bhatti.botwithopenai.service.impl;

import com.bhatti.botwithopenai.service.BotService;
import com.bhatti.botwithopenai.util.BotEnum;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BotServiceImpl implements BotService {
    @Value("${openai.api-key}")
    private  String apiKey;
    @Value("${mode.gpt-turbo}")
    private String model;
    @Override
    public String handleQuery(String query) {
        OpenAiService service = new OpenAiService(apiKey);
        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest
                .builder()
                .model(model)
                .temperature(0.8)
                .messages(List.of(
                        new ChatMessage(BotEnum.OLYMPIC_BOT_SYSTEM.getRoleName(), BotEnum.OLYMPIC_BOT_SYSTEM.getInstruction()),
                        new ChatMessage(BotEnum.OLYMPIC_BOT_USER.getRoleName(), String.format(BotEnum.OLYMPIC_BOT_USER.getInstruction(),query, BotEnum.OLYMPIC_BOT_USER.getData())))
                ).build();
        return service.createChatCompletion(chatCompletionRequest).getChoices().get(0).getMessage().getContent();

    }
}

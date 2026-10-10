package com.parshu.taskClient.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClientBuilder, ToolCallbackProvider mcpTools) {
        this.chatClient = chatClientBuilder.defaultTools(mcpTools).build();
    }

    public String chat (String message) {
        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}

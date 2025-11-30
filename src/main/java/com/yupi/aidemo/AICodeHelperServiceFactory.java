package com.yupi.aidemo;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AICodeHelperServiceFactory {
  @Resource
  private ChatModel qwenChatModel;
  @Bean
  public AICodeHelperService aiCodeHelperService(){
    MessageWindowChatMemory messageWindowChatMemory = MessageWindowChatMemory.withMaxMessages(10);

    return AiServices
      .builder(AICodeHelperService.class)
      .chatModel(qwenChatModel)
      .chatMemory(messageWindowChatMemory)
      .build();
  }
}

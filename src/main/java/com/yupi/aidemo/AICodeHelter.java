package com.yupi.aidemo;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AICodeHelter {
  @Resource
  private ChatModel qwenchatModel;
  public String chat(String message){
    UserMessage user = UserMessage.from(message);
    ChatResponse chat = qwenchatModel.chat(user);
    AiMessage aiMessage = chat.aiMessage();
    log.info("AI:"+aiMessage);
    return aiMessage.text();
  }
}

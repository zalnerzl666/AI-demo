package com.yupi.aidemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AICodeHelperServiceFactoryTest {
@Resource
private AICodeHelperService aiCodeHelperService;
  @Test
  void aiCodeHelperService() {
    String chat = aiCodeHelperService.chat("你好 我叫zalner");
    System.out.println(chat);
     chat = aiCodeHelperService.chat("你好 我叫什么");
    System.out.println(chat);
  }
}

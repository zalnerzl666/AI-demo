package com.yupi.aidemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AICodeHelterTest {
@Resource
private AICodeHelter aiCodeHelter;
  @Test
  void chat() {
    aiCodeHelter.chat();
  }
}

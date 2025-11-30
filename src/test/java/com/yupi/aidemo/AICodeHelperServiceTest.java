package com.yupi.aidemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AICodeHelperServiceTest {
@Resource
private AICodeHelperService aiCodeHelperService;
  @Test
  void chachaForreport() {
    AICodeHelperService.Report report = aiCodeHelperService.chachaForreport("你好 ，我叫 zalner 23岁 学习编程两年半");
    System.out.println(report);
  }
}

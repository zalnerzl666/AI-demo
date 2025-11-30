package com.yupi.aidemo;

import dev.langchain4j.service.SystemMessage;

import javax.swing.*;
import java.util.List;

public interface AICodeHelperService {
  @SystemMessage(fromResource = "SystemMessage.txt")
  String chat(String message);

  @SystemMessage(fromResource = "SystemMessage.txt")
  Report chachaForreport(String message);

  record Report(String name, List<String>suggestionList){}

}

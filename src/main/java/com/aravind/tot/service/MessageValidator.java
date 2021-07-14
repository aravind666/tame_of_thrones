package com.aravind.tot.service;

import com.aravind.tot.domain.Message;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MessageValidator {

  public static Message validate(Message message) {
    String[] emblem = message.getTo().getEmblem().split("");
    if (getExistingEmblemChars(message, emblem).size() == emblem.length) {
      message.setValid(true);
    }
    return message;
  }

  private static List<String> getExistingEmblemChars(Message message, String[] emblem) {
    List<String> existingChars =
        IntStream.range(0, emblem.length).filter(i -> message.getContent().indexOf(emblem[i]) >= 0)
            .mapToObj(i -> emblem[i]).collect(Collectors.toList());
    return existingChars;
  }
}

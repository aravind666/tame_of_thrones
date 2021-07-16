package com.aravind.tot.service;

import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.Message;
import com.aravind.tot.domain.World;
import java.util.List;
import java.util.stream.Collectors;

public class MessageTransformer {

  public static List<Message> transform(List<String> rawMessages, Kingdom from, World southeros) {
    List<Message> collect = rawMessages
        .stream()
        .map(message -> message.split(" ", 2))
        .map(strings -> new Message(
            strings[1].replaceAll("\\s", ""),
            getRecipientKingdom(strings[0], southeros),
            from, false))
        .map(MessageDecipher::decipher)
        .map(MessageValidator::validate)
        .filter(Message::getAcknowledged)
        .collect(Collectors.toList());
    return collect;
  }

  private static Kingdom getRecipientKingdom(String name, World world) {
    return world.getListOfKingdoms()
        .stream()
        .filter(kingdom -> kingdom.getName().equals(name))
        .findFirst()
        .get();
  }

}

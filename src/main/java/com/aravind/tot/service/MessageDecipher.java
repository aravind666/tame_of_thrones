package com.aravind.tot.service;

import com.aravind.tot.domain.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MessageDecipher {

  private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static Map<Character, Character> decryptionMap = new HashMap<>();

  public static Message decipher(Message encrypted) {
    char[] content = encrypted.getContent().toCharArray();
    Integer cipher = encrypted.getCipher();
    prepareDecryptionMap(cipher);
    decryptMessageContent(content);
    return new Message(String.valueOf(content), encrypted.getTo(),
        encrypted.getFrom(), false);
  }

  private static void prepareDecryptionMap(Integer cipher) {
    IntStream.range(0, ALPHABETS.length()).forEachOrdered(i -> decryptionMap
        .put(ALPHABETS.charAt((i + cipher) % ALPHABETS.length()), ALPHABETS.charAt(i)));
  }

  private static void decryptMessageContent(char[] content) {
    IntStream.range(0, content.length).forEach(i -> content[i] = decryptionMap.get(content[i]));
  }

}

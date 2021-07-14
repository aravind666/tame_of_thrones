package com.aravind.tot;

import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.Message;
import com.aravind.tot.domain.World;
import com.aravind.tot.generator.WorldGenerator;
import com.aravind.tot.service.MessageTransformer;
import com.google.common.io.CharStreams;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class App {
  public static void main(String[] args) {
    try {
      World southeros = WorldGenerator.generate("SOUTHEROS");
      InputStream input = new FileInputStream(args[0]);
      List<String> rawMessages = CharStreams.readLines(
          new InputStreamReader(input, StandardCharsets.UTF_8));
      Kingdom megalomaniac = southeros.getListOfKingdoms()
          .stream().filter(kingdom -> kingdom.getName() == "SPACE").findFirst().get();
      List<Message> listOfMessages =
          MessageTransformer.transform(rawMessages, megalomaniac, southeros);
      String allegiances = listOfMessages.stream()
          .map(message -> message.getTo().getName() + " ")
          .collect(Collectors.joining());
      System.out.println("SPACE " + allegiances);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

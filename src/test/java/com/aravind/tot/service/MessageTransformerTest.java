package com.aravind.tot.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.Message;
import com.aravind.tot.domain.World;
import com.aravind.tot.generator.WorldGenerator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageTransformerTest {

  private World southeros;
  private Kingdom from;
  private List<String> rawMessages;

  @BeforeEach
  void setUp() {
    southeros = WorldGenerator.generate("Southeros");
    from = new Kingdom("SPACE", "GORILLA");
    rawMessages = new ArrayList<String>();
    rawMessages.add("AIR ROZO");

  }

  @Test
  void shouldTransformRawMessageToMessageObject() {
    List<Message> transformedMessages = MessageTransformer.transform(rawMessages, from, southeros);

    assertEquals(transformedMessages.size(), 1);
  }

  @Test
  void shouldDecryptContentOfEachMessage() {
    List<Message> transformedMessages = MessageTransformer.transform(rawMessages, from, southeros);

    assertEquals(transformedMessages.get(0).getContent(), "OLWL");
  }

  @Test
  void shouldValidateEachMessage() {
    List<Message> transformedMessages = MessageTransformer.transform(rawMessages, from, southeros);

    assertTrue(transformedMessages.get(0).getAcknowledged());
  }


}

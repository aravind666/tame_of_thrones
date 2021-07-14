package com.aravind.tot.service;

import static org.junit.jupiter.api.Assertions.*;


import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageValidatorTest {

  private Message badMessage;
  private Message goodMessage;
  private Kingdom to;
  private Kingdom from;

  @BeforeEach
  void setUp() {
    to = new Kingdom("AIR", "OWL");
    from = new Kingdom("SPACE", "GORILLA");
    badMessage = new Message("ABC", to, from, false);
    goodMessage = new Message("OFGWOFRIILSA", to, from, false);
  }

  @Test
  void givenBadMessageShouldSetValidFlagToFalse() {
    MessageValidator.validate(badMessage);

    assertFalse(badMessage.getValid());
  }

  @Test
  void givenGoodMessageShouldSetValidFlagToTrue() {
    MessageValidator.validate(goodMessage);

    assertTrue(goodMessage.getValid());
  }
}

package com.aravind.tot.service;

import static org.junit.jupiter.api.Assertions.*;


import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageDecipherTest {

  private Message message;
  private Kingdom to;
  private Kingdom from;

  @BeforeEach
  void setUp() {
    to = new Kingdom("AIR", "OWL");
    from = new Kingdom("SPACE", "GORILLA");
    message = new Message("ROZO", to, from, false);
  }

  @Test
  void shouldDecryptMessageContentForCipher() {
    MessageDecipher.decipher(message);

    assertEquals(message.getContent(),"OLWL");
  }
}

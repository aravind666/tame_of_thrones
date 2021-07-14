package com.aravind.tot.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessageTest {

  private Kingdom toKingdom;
  private Kingdom fromKingdom;
  private Message message;

  @BeforeEach
  void setUp() {
    this.toKingdom = new Kingdom("LAND", "PANDA");
    this.fromKingdom = new Kingdom("SPACE", "OWL");
    this.message = new Message("testing it", this.toKingdom, this.fromKingdom, false);
  }

  @Test
  void getCipher() {
    assertEquals(this.message.getCipher(), this.toKingdom.getEmblem().length());
  }

  @Test
  void getContent() {
    assertEquals(this.message.getContent(), "testing it");
  }

  @Test
  void getTo() {
    assertEquals(this.message.getTo().getName(), this.toKingdom.getName());
    assertEquals(this.message.getTo().getEmblem(), this.toKingdom.getEmblem());
  }

  @Test
  void getFrom() {
    assertEquals(this.message.getFrom().getName(), this.fromKingdom.getName());
    assertEquals(this.message.getFrom().getEmblem(), this.fromKingdom.getEmblem());
  }
}

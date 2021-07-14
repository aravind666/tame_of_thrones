package com.aravind.tot.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KingdomTest {

  private Kingdom testKingdom;

  @BeforeEach
  void setUp() {
    this.testKingdom = new Kingdom("LAND", "PANDA");
  }

  @Test
  void getName() {
    assertEquals(this.testKingdom.getEmblem(), "PANDA");
  }

  @Test
  void getEmblem() {
    assertEquals(this.testKingdom.getName(), "LAND");
  }
}

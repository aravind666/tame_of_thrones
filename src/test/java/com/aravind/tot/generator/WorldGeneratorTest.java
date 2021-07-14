package com.aravind.tot.generator;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.aravind.tot.domain.World;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorldGeneratorTest {

  private World testWorld;

  @BeforeEach
  void setUp() {
    this.testWorld = WorldGenerator.generate("southeros");
  }

  @Test
  void generateWorldWithSpecifiedName() {
    assertEquals(this.testWorld.getName(), "southeros");
  }

  @Test
  void generateWorldWithPreDefinedSetOfKingdoms() {
    assertEquals(this.testWorld.getListOfKingdoms().size(), 6);
  }

}

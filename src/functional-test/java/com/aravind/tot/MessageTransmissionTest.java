package com.aravind.tot;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MessageTransmissionTest extends BaseFunctionalTest {

  @BeforeEach
  public void beforeAll() {
    super.setUpStreams();
  }

  @AfterEach
  public void afterAll() {
    super.restoreStreams();
  }

  @Test
  public void testSuccessFullAllegianceMessageDelivery() {
    App.main(new String[] {FunctionalTestConstants.POSITIVE_INPUT});
    assertTrue(getModifiedOutputStream().toString()
        .contains("SPACE FIRE AIR WATER"));
  }

  @Test
  public void testAnotherSuccessFullAllegianceMessageDelivery() {
    App.main(new String[] {FunctionalTestConstants.POSITIVE_INPUT_2});
    assertTrue(getModifiedOutputStream().toString()
        .contains("SPACE LAND ICE FIRE"));
  }

  @Test
  public void testAllegianceShouldBeAtleastFromThreeKingdoms() {
    App.main(new String[] {FunctionalTestConstants.POSITIVE_INPUT_4});
    assertTrue(getModifiedOutputStream().toString()
        .contains("NONE"));
  }

  @Test
  public void testFailedAllegianceMessageDelivery() {
    App.main(new String[] {FunctionalTestConstants.NEGATIVE_INPUT});
    assertTrue(getModifiedOutputStream().toString()
        .contains("NONE"));
  }

}

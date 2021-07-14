package com.aravind.tot;

import static org.junit.jupiter.api.Assertions.assertTrue;


import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputValidationTest extends BaseFunctionalTest {

  @BeforeEach
  public void beforeAll() {
    super.setUpStreams();
  }

  @AfterEach
  public void afterAll() {
    super.restoreStreams();
  }

  @Test
  public void shouldDisplayValidationForBadPath() throws IOException {
    App.main(new String[] {FunctionalTestConstants.BAD_INPUT_PATH});
    assertTrue(getModifiedOutputStream().toString()
        .contains("resources/i_dont_exist.txt (No such file or directory)"));
  }

}

package com.aravind.tot;

import java.io.File;
import java.nio.file.Paths;

public class FunctionalTestConstants {
  public static final String RESOURCES = Paths.get("src","functional-test","resources").toFile().getAbsolutePath();
  public static final String PATH_SEPARATOR = File.separator;
  public static final String POSITIVE_INPUT = RESOURCES + PATH_SEPARATOR + "input1.txt";
  public static final String BAD_INPUT = RESOURCES + PATH_SEPARATOR + "input2.txt";
  public static final String BAD_INPUT_MESSAGE = "Input file not found";
  public static final String BAD_INPUT_PATH = RESOURCES + PATH_SEPARATOR + "i_dont_exist.txt";
}

package com.aravind.tot;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FunctionalTestConstants {
  public static final String PATH_SEPARATOR = File.separator;
  public static final Path resources = Paths.get("src", "functional-test", "resources");
  public static final String RESOURCES_PATH = resources.toFile().getAbsolutePath();
  public static final String POSITIVE_INPUT = RESOURCES_PATH + PATH_SEPARATOR + "input1.txt";
  public static final String POSITIVE_INPUT_2 = RESOURCES_PATH + PATH_SEPARATOR + "input2.txt";
  public static final String POSITIVE_INPUT_4 = RESOURCES_PATH + PATH_SEPARATOR + "input4.txt";
  public static final String NEGATIVE_INPUT = RESOURCES_PATH + PATH_SEPARATOR + "input3.txt";
  public static final String BAD_INPUT_MESSAGE = "Input file not found";
  public static final String BAD_INPUT_PATH = RESOURCES_PATH + PATH_SEPARATOR + "i_dont_exist.txt";

}

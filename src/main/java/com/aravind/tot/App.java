package com.aravind.tot;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;

public class App {
  public static void main(String[] args) {
    try {
      File file = new File(args[0]);
      Files.asCharSource(file, Charsets.UTF_8).read();
      System.out.println("SPACE AIR LAND ICE");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

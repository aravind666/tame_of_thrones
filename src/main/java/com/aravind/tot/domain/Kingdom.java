package com.aravind.tot.domain;

public class Kingdom {
  private final String name;
  private final String emblem;

  public Kingdom(String name, String emblem) {
    this.name = name;
    this.emblem = emblem;
  }

  public String getName() {
    return name;
  }

  public String getEmblem() {
    return emblem;
  }
}

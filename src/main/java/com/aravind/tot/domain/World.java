package com.aravind.tot.domain;

import java.util.List;

public class World {
  private final String name;
  private final List<Kingdom> listOfKingdoms;

  public World(String name, List<Kingdom> listOfKingdoms) {
    this.name = name;
    this.listOfKingdoms = listOfKingdoms;
  }

  public String getName() {
    return name;
  }

  public List<Kingdom> getListOfKingdoms() {
    return listOfKingdoms;
  }
}

package com.aravind.tot.generator;

import com.aravind.tot.domain.Kingdom;
import com.aravind.tot.domain.World;
import java.util.ArrayList;
import java.util.List;

public class WorldGenerator {
  public static World generate(String name) {
    List<Kingdom> listOfKingdoms = new ArrayList<>();
    listOfKingdoms.add(new Kingdom("SPACE", "GORILLA"));
    listOfKingdoms.add(new Kingdom("LAND", "PANDA"));
    listOfKingdoms.add(new Kingdom("WATER", "OCTOPUS"));
    listOfKingdoms.add(new Kingdom("ICE", "MAMMOTH"));
    listOfKingdoms.add(new Kingdom("AIR", "OWL"));
    listOfKingdoms.add(new Kingdom("FIRE", "DRAGON"));
    return new World(name, listOfKingdoms);
  }
}

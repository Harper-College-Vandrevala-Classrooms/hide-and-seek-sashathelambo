package com.csc;

// Don't change this file!

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyListGenerator {

  public FuzzyListGenerator() {
  }

  public FuzzyListGenerator(int iterations) {
  }

  public ArrayList<Fuzzy> randomizedRainbowFuzzies() {
    ArrayList<Fuzzy> fuzzies = sortedRainbowFuzzies();
    Collections.shuffle(fuzzies);
    // Ensure "gold" is the last color after shuffling
    fuzzies.removeIf(fuzzy -> "gold".equals(fuzzy.color));
    fuzzies.add(new Fuzzy("gold"));
    return fuzzies;
  };

  public ArrayList<Fuzzy> sortedRainbowFuzzies() {
    ArrayList<Fuzzy> fuzzies = new ArrayList<>();
    fuzzies.add(new Fuzzy("red"));
    fuzzies.add(new Fuzzy("orange"));
    fuzzies.add(new Fuzzy("yellow"));
    fuzzies.add(new Fuzzy("green"));
    fuzzies.add(new Fuzzy("blue"));
    fuzzies.add(new Fuzzy("indigo"));
    fuzzies.add(new Fuzzy("violet"));
    fuzzies.add(new Fuzzy("gold")); // Ensure "gold" is the last color
    return fuzzies;
  };
}

package com.csc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

  FuzzyListGenerator generator = new FuzzyListGenerator();

  @Test
  void exampleTestWithRandomizedFuzzies() {
    ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
    assertNotNull(fuzzies, "Fuzzies list should not be null");
    assertEquals("gold", fuzzies.get(fuzzies.size() - 1).color, "The last color should be gold");
  }

  @Test
  void exampleTestWithSortedFuzzies() {
    ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
    assertNotNull(fuzzies, "Fuzzies list should not be null");
    assertEquals("gold", fuzzies.get(fuzzies.size() - 1).color, "The last color should be gold");
  }
}

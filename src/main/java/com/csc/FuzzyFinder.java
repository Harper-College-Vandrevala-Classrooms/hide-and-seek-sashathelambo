package com.csc;

import java.util.ArrayList;

public class FuzzyFinder {

  public static int linearSearch(ArrayList<Fuzzy> fuzzies, String targetColor) {
    for (int i = 0; i < fuzzies.size(); i++) {
      if (fuzzies.get(i).color.equals(targetColor)) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(ArrayList<Fuzzy> fuzzies, String targetColor) {
    int left = 0;
    int right = fuzzies.size() - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int comparison = fuzzies.get(mid).color.compareTo(targetColor);

      if (comparison == 0) {
        return mid;
      } else if (comparison < 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomizedFuzzies = generator.randomizedRainbowFuzzies();

    int linearSearchSortedIndex = linearSearch(sortedFuzzies, "gold");
    int linearSearchRandomizedIndex = linearSearch(randomizedFuzzies, "gold");
    int binarySearchSortedIndex = binarySearch(sortedFuzzies, "gold");
    int binarySearchRandomizedIndex = binarySearch(randomizedFuzzies, "gold");

    System.out.println("Linear Search on Sorted List: " + linearSearchSortedIndex);
    System.out.println("Linear Search on Randomized List: " + linearSearchRandomizedIndex);
    System.out.println("Binary Search on Sorted List: " + binarySearchSortedIndex);
    System.out.println("Binary Search on Randomized List: " + binarySearchRandomizedIndex);
  }
}

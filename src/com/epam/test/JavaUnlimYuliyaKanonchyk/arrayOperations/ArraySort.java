package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;
import java.util.Arrays;


public class ArraySort implements Operation {

  @Override
  public Number execute(Number [] numbers) {
    Arrays.sort(numbers);
    return null;
  }
}

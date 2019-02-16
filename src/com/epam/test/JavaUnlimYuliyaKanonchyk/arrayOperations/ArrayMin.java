package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;

import java.util.Arrays;

public class ArrayMin implements Operation {
  @Override
  public Number execute(Number[] numbers) {
    Arrays.sort(numbers);
    Number min = numbers[0];
    System.out.println("Min number of Array is: "+min);
    return null;
  }
}

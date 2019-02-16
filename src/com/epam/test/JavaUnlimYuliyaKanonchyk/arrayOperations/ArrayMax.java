package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;

import java.util.Arrays;

public class ArrayMax implements Operation {
  @Override
  public Number execute(Number[] numbers) {
    Arrays.sort(numbers);
    Number max = numbers[numbers.length-1];
    System.out.println("Max number of Array is: "+max);
    return null;
  }
}

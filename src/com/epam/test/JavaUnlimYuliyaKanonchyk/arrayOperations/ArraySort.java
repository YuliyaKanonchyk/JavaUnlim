package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;
import java.util.Arrays;


public class ArraySort implements Operation {

  @Override
  public Number execute(Number [] numbers) {
    Arrays.sort(numbers);
    System.out.println("Sorted Array : "+String.valueOf(Arrays.toString(numbers)));
    return null;
  }
}

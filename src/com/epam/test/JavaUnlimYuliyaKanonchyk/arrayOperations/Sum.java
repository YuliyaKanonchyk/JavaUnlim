package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;

public class Sum implements Operation {

  @Override
  public Number execute(Number[] numbers) {
      double sum = 0;
      for (int i = 0; i < numbers.length; i++) {
          Number number = numbers[i];
          sum += number.doubleValue();
      }
    return sum;
  }
}



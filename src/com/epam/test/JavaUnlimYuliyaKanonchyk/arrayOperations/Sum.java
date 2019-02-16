package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;

public class Sum implements Operation {

  @Override
  public Number execute(Number[] numbers) {
      long sum = 0;
    for (Number number : numbers) {
      sum += number.longValue();
    }
    System.out.println("Summa: " + sum);
    System.out.println("The average number of the Array is: "+(double)sum/numbers.length);
    return sum;
  }
}



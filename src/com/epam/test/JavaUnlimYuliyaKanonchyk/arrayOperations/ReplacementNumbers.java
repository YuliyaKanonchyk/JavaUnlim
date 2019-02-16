package com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations;

import java.util.Arrays;

public class ReplacementNumbers implements Operation {
  @Override
  public Number execute(Number[] numbers) {
    int i;
    Arrays.sort(numbers);
    for (i = 0; i < numbers.length; i++) {
      int c=i%2;
      if (c!=0){
        numbers[i]= 0 ;
      }
    }System.out.println("Array with '0' odd indexes:" + Arrays.toString(numbers));
    return null;
  }
}

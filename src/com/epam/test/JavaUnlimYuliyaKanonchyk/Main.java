package com.epam.test.JavaUnlimYuliyaKanonchyk;

import com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations.ArraySort;
import com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations.Operation;
import com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations.Sum;
import com.epam.test.JavaUnlimYuliyaKanonchyk.reader.ArrayReader;
import com.epam.test.JavaUnlimYuliyaKanonchyk.reader.FileArrayReader;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

      ArrayReader arrayReader = new FileArrayReader();
      Number[] numbers = arrayReader.read("files/array.txt");

      Operation sort = new ArraySort();
      sort.execute(numbers);

      System.out.println("Sorted numbers:");
      System.out.println(String.valueOf(Arrays.toString(numbers)));

      Operation sumOperation = new Sum();
      Number sum = sumOperation.execute(numbers);
      System.out.println("Summa: " + sum);
  }
}

package com.epam.test.JavaUnlimYuliyaKanonchyk;

import com.epam.test.JavaUnlimYuliyaKanonchyk.arrayOperations.*;
import com.epam.test.JavaUnlimYuliyaKanonchyk.reader.ArrayReader;
import com.epam.test.JavaUnlimYuliyaKanonchyk.reader.FileArrayReader;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

      ArrayReader arrayReader = new FileArrayReader();
      Number[] numbers = arrayReader.read("files/array.txt");

      Operation sort = new ArraySort();
      sort.execute(numbers);

      Operation sumOperation = new Sum();
      sumOperation.execute(numbers);

      Operation minNumber = new ArrayMin();
      minNumber.execute(numbers);

      Operation maxNumber = new ArrayMax();
      maxNumber.execute(numbers);

      Operation replaced = new ReplacementNumbers();
      replaced.execute(numbers);

  }
}

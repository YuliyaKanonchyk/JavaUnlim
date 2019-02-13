package com.epam.test.JavaUnlimYuliyaKanonchyk.writer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayWriter implements WriteStart {
  private List<String> arrayLine = new ArrayList<>();
@Override
  public void executeWriting(List<String> arrayLine) {
    try (FileWriter fileWriter =new FileWriter("resultarray.txt")){
        for (String s : this.arrayLine) {
            fileWriter.write(s);
          System.out.println(s);
        }
    } catch (IOException e) {
      System.out.println("Can't write to file");
      e.printStackTrace();
    }
  }
}

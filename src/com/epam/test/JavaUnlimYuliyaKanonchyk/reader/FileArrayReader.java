package com.epam.test.JavaUnlimYuliyaKanonchyk.reader;
import com.epam.test.JavaUnlimYuliyaKanonchyk.validationData.NumberValidator;
import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class FileArrayReader implements ArrayReader {
    private List<Number> numbers = new ArrayList<>();
    @Override
    public Number[] read(String source) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("files/array.txt")))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                List<Number> numbersFromLine = new ArrayList<>();
                String[] partsFromLine = line.split(" ");
                for (String part : partsFromLine) {
                    if (NumberValidator.NumberValidator(part)){
                        Number number = NumberFormat.getInstance().parse(part);
                        numbersFromLine.add(number);
                    } else {
                        numbersFromLine.clear();
                        break;
                    }
                }
                numbers.addAll(numbersFromLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the File");
        } catch (IOException e) {
            System.out.println("Can't read/print the File");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return numbers.toArray(new Number[0]);
    }
}


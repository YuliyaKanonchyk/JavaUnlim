package com.epam.test.JavaUnlimYuliyaKanonchyk.validationData;

public class NumberValidator {

    public static boolean NumberValidator(String line){
        try {
            Integer.parseInt(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

}

}

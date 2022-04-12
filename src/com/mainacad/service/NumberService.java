package com.mainacad.service;

public class NumberService {

    public static int getSumByDivision(int number) {
        int result = 0;

        while (number > 0) {
            result += (number % 10);
            number /= 10;
        }

        return result;
    }

    public static int getSumByTypeManipulation(int number) {
        int result = 0;

        String numberAsString = String.valueOf(number);

        // "12345" -> {'1', '2', '3', '4', '5')
        char[] symbols = numberAsString.toCharArray();

        for (int i = 0; i < symbols.length; i++) {
            result += Character.getNumericValue(symbols[i]);
        }

//        for (char symbol: symbols) {
//            result = result + symbol;
//        }
//
//        int i = 0;
//        while (i < symbols.length) {
//            result = result + symbols[i];
//
//            i++;
//        }
//
//        i = 0;
//        do{
//            result = result + symbols[i];
//
//            i++;
//
//        } while (i < symbols.length);

        return result;
    }
}


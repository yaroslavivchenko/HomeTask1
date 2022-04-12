package com.mainacad;

import com.mainacad.service.NumberService;

public class ApplicationRunner {

    public static void main(String[] args) {
        int result = NumberService.getSumByTypeManipulation(12345);
        System.out.println(result);

        result = NumberService.getSumByDivision(12345);
        System.out.println(result);
    }
}

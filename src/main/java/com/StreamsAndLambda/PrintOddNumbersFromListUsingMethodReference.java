package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;

public class PrintOddNumbersFromListUsingMethodReference {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(4);list.add(5);list.add(24);list.add(14);list.add(54);list.add(8);list.add(48);list.add(64);list.add(19);list.add(21);list.add(32);list.add(74);
        

        printEvenNumber(list);


    }

    private static boolean isOdd(int number){
        return number %2 == 1;
    }

    private static void printEvenNumber(List<Integer> list) {

        list.stream().filter(PrintOddNumbersFromListUsingMethodReference::isOdd).forEach(System.out::println);
    }
}

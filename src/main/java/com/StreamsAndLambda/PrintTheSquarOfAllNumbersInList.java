package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;

public class PrintTheSquarOfAllNumbersInList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(4);
        list.add(5);
        list.add(24);
        list.add(14);
        list.add(54);
        list.add(8);
        list.add(48);
        list.add(64);
        list.add(19);
        list.add(21);
        list.add(32);
        list.add(74);


        printSquarOfAllNumer(list);

    }

    private static void printSquarOfAllNumer(List<Integer> list) {

        list.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}

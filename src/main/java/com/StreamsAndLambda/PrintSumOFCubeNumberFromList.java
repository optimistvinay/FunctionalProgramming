package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;

public class PrintSumOFCubeNumberFromList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
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

        printSunOfSquar(list);
    }

    private static void printSunOfSquar(List<Integer> list) {

        System.out.println(list.stream()
                .map(x -> x*x*x)
                .reduce(0, Integer::sum));
    }
}

package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListConsideringOnlyEvenNumber {


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

        collectOnlyEvenNUmer(list);
    }

    private static void collectOnlyEvenNUmer(List<Integer> list) {
        List list1 = list.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());

        System.out.println(list1);

    }
}

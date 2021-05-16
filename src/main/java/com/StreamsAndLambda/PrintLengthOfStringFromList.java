package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;

public class PrintLengthOfStringFromList {

    public static void main(String[] args) {
        List<String> courses = new ArrayList();
        courses.add("Spring");courses.add("Spring Cloud");courses.add("Spring microservice");courses.add("Spring data");courses.add("API");
        courses.add("Docker");courses.add("Kubernatis");courses.add("Multithreading");

        printLengthOfString(courses);

    }

    private static void printLengthOfString(List<String> courses) {

        courses.stream()
                .map(str -> str.length())
                .forEach(System.out::println);

    }
}

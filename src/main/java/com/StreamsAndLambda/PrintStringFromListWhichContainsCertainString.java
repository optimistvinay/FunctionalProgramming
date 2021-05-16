package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;

public class PrintStringFromListWhichContainsCertainString {


    public static void main(String[] args) {

        List<String> courses = new ArrayList();
        courses.add("Spring");courses.add("Spring Cloud");courses.add("Spring microservice");courses.add("Spring data");courses.add("API");
        courses.add("Docker");courses.add("Kubernatis");courses.add("Multithreading");


        printStringContainingSpringTest(courses);

    }

    private static void printStringContainingSpringTest(List<String> courses) {


        courses.stream()
                .filter(str -> str.contains("Spring"))
                .forEach(System.out::println);
    }
}

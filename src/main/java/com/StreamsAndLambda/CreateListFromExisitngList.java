package com.StreamsAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListFromExisitngList {


    public static void main(String[] args) {
        List<String> courses = new ArrayList();
        courses.add("Spring");courses.add("Spring Cloud");courses.add("Spring microservice");courses.add("Spring data");courses.add("API");
        courses.add("Docker");courses.add("Kubernatis");courses.add("Multithreading");

        List<String> course2 = courses.stream()
                .collect(Collectors.toList());

        System.out.println(course2);

    }


}

package com.StreamsAndLambda;

import com.StreamsAndLambda.entity.CourseContent;

import java.util.ArrayList;
import java.util.List;

public class LimitNumberOfRecordInList {

    public static void main(String[] args) {


        List<CourseContent> courseContents = new ArrayList<>();
        courseContents.add(new CourseContent(1, "Spring", "Spring", 92, 100));
        courseContents.add(new CourseContent(1, "Spring Data", "Spring data", 88, 120));
        courseContents.add(new CourseContent(1, "Spring Cloud", "Spring Cloud", 83, 110));
        courseContents.add(new CourseContent(1, "Spring Boot", "Spring Boot",99, 104));
        courseContents.add(new CourseContent(1, "AWS", "AWS", 94, 108));
        courseContents.add(new CourseContent(1, "Azur", "Azur", 91, 101));
        courseContents.add(new CourseContent(1, "Docker", "Docker", 96, 102));


        LimitNUmberOfStudent(courseContents);

    }

    private static void LimitNUmberOfStudent(List<CourseContent> courseContents) {
        courseContents.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}

package com.StreamsAndLambda;

import com.StreamsAndLambda.entity.CourseContent;

import java.util.ArrayList;
import java.util.List;

public class PrintObjectIfOnePropertyHasCertainValue {


    public static void main(String[] args) {

        List<CourseContent> courseContents = new ArrayList();
        courseContents.add(new CourseContent(1, "Spring", "Spring"));
        courseContents.add(new CourseContent(1, "Spring Data", "Spring data"));
        courseContents.add(new CourseContent(1, "Spring Cloud", "Spring Cloud"));
        courseContents.add(new CourseContent(1, "Spring Boot", "Spring Boot"));
        courseContents.add(new CourseContent(1, "AWS", "AWS"));
        courseContents.add(new CourseContent(1, "Azur", "Azur"));
        courseContents.add(new CourseContent(1, "Docker", "Docker"));



        printCourseWhichHasNameContiansSpring(courseContents);





    }

    private static void printCourseWhichHasNameContiansSpring(List<CourseContent> courseContents) {

        courseContents.stream()
                .filter(course -> course.getName().contains("Spring"))
                .forEach(System.out::println);
    }


}

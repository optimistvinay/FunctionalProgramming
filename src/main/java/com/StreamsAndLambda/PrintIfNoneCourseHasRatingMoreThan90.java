package com.StreamsAndLambda;

import com.StreamsAndLambda.entity.CourseContent;

import java.util.ArrayList;
import java.util.List;

public class PrintIfNoneCourseHasRatingMoreThan90 {

    public static void main(String[] args) {


        List<CourseContent> courseContents = new ArrayList<>();
        courseContents.add(new CourseContent(1, "Spring", "Spring", 92));
        courseContents.add(new CourseContent(1, "Spring Data", "Spring data", 88));
        courseContents.add(new CourseContent(1, "Spring Cloud", "Spring Cloud", 83));
        courseContents.add(new CourseContent(1, "Spring Boot", "Spring Boot",99));
        courseContents.add(new CourseContent(1, "AWS", "AWS", 94));
        courseContents.add(new CourseContent(1, "Azur", "Azur", 91));
        courseContents.add(new CourseContent(1, "Docker", "Docker", 96));


        printifNonePass(courseContents);

    }

    private static void printifNonePass(List<CourseContent> courseContents) {

        System.out.println(courseContents.stream()
                .noneMatch(courseContent -> courseContent.getRating()>90));
    }
}

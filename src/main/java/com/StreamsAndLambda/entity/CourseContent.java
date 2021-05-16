package com.StreamsAndLambda.entity;

public class CourseContent {

    private int id;
    private String name;
    private String description;
    private int rating;
    private int students;



    public CourseContent(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public CourseContent(int id, String name, String description, int rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
    }


    public CourseContent(int id, String name, String description, int rating, int students) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CourseContent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", students=" + students +
                '}';
    }
}

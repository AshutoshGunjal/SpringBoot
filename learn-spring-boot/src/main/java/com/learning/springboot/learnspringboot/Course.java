package com.learning.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;

public class Course {
    private long ID;

    private String courseName;

    private String authorName;

    public Course(long ID, String courseName, String authorName) {
        this.ID = ID;
        this.courseName = courseName;
        this.authorName = authorName;
    }

    public long getID() {
        return ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                ", CourseName='" + courseName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}

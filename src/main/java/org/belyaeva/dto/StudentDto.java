package org.belyaeva.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentDto {

    private Long id;
    private String name;
    private String surname;
    private List<CourseDto> courses = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public StudentDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentDto setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public StudentDto setCourses(List<CourseDto> courses) {
        this.courses = courses;
        return this;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courses=" + courses +
                '}';
    }
}

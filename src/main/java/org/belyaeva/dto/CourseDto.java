package org.belyaeva.dto;

public class CourseDto {

    private Long id;
    private String name;
    private Integer durationInHours;
    private Integer yearOfEducation;

    public Long getId() {
        return id;
    }

    public CourseDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CourseDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getDurationInHours() {
        return durationInHours;
    }

    public CourseDto setDurationInHours(Integer durationInHours) {
        this.durationInHours = durationInHours;
        return this;
    }

    public Integer getYearOfEducation() {
        return yearOfEducation;
    }

    public CourseDto setYearOfEducation(Integer yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
        return this;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", durationInHours=" + durationInHours +
                ", yearOfEducation=" + yearOfEducation +
                '}';
    }
}

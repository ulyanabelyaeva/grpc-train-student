package org.belyaeva.controller;

import org.belyaeva.dto.CourseDto;
import org.belyaeva.dto.StudentDto;
import org.belyaeva.integration.api.CourseClient;
import org.belyaeva.mapper.api.CourseMapper;
import org.belyaeva.proto.CourseProto;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger LOGGER = getLogger(StudentController.class);

    private final CourseClient courseClient;
    private final CourseMapper courseMapper;

    public StudentController(CourseClient courseClient,
                             CourseMapper courseMapper) {
        this.courseClient = courseClient;
        this.courseMapper = courseMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentWithCourses(@PathVariable Long id) {
        LOGGER.info("Requesting student by id {}", id);
        List<CourseProto.Course> courses = courseClient.getCourses(id);
        List<CourseDto> courseDtoList = courseMapper.toDtoList(courses);
        StudentDto dto = new StudentDto()
                .setId(id)
                .setName("Ulyana")
                .setSurname("Belyaeva")
                .setCourses(courseDtoList);
        return ResponseEntity.ok(dto);
    }
}

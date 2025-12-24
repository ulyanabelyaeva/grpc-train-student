package org.belyaeva.mapper;

import org.belyaeva.dto.CourseDto;
import org.belyaeva.mapper.api.CourseMapper;
import org.belyaeva.proto.CourseProto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public List<CourseDto> toDtoList(List<CourseProto.Course> courses) {
        return courses.stream()
                .map(course -> new CourseDto()
                        .setId(course.getId())
                        .setName(course.getName())
                        .setDurationInHours(course.getDurationInHours())
                        .setYearOfEducation(course.getYearOfEducation()))
                .toList();
    }
}

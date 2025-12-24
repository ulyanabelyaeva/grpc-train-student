package org.belyaeva.mapper.api;

import org.belyaeva.dto.CourseDto;
import org.belyaeva.proto.CourseProto;

import java.util.List;

public interface CourseMapper {

    List<CourseDto> toDtoList(List<CourseProto.Course> courses);
}

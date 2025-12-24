package org.belyaeva.integration.api;

import org.belyaeva.proto.CourseProto;

import java.util.List;

public interface CourseClient {

    List<CourseProto.Course> getCourses(Long studentId);
}

package org.belyaeva.integration;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.belyaeva.integration.api.CourseClient;
import org.belyaeva.proto.CourseProto;
import org.belyaeva.proto.CourseServiceGrpc;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class CourseClientImpl implements CourseClient {

    private static final Logger LOGGER = getLogger(CourseClientImpl.class);

    @GrpcClient("grpc-train-course")
    private CourseServiceGrpc.CourseServiceBlockingStub blockingStub;

    @Override
    public List<CourseProto.Course> getCourses(Long studentId) {
        CourseProto.StudentId courseRequest = CourseProto.StudentId.newBuilder()
                .setId(studentId)
                .build();
        LOGGER.debug("Requesting courses for student {} from grpc-train-course", courseRequest);
        CourseProto.Courses courses = blockingStub.getCursesByStudentId(courseRequest);
        LOGGER.debug("Response with courses from grpc-train-course: {}", courses);
        return courses.getCoursesList();
    }
}

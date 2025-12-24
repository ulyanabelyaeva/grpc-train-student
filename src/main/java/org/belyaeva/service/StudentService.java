package org.belyaeva.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.belyaeva.proto.CourseProto;
import org.belyaeva.proto.StudentProto;
import org.belyaeva.proto.StudentServiceGrpc;

@GrpcService
public class StudentService extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getStudent(CourseProto.StudentId request,
                           StreamObserver<StudentProto.Student> responseObserver) {
        super.getStudent(request, responseObserver);
    }
}

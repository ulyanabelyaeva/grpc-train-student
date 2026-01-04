package org.belyaeva.integration;

import io.grpc.*;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

@GrpcGlobalClientInterceptor
public class LoggingInterceptor implements ClientInterceptor {

    private static final Logger LOGGER = getLogger(LoggingInterceptor.class);

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor,
                                                               CallOptions callOptions,
                                                               Channel channel) {
        LOGGER.debug("Call {} will be executed with options {}", methodDescriptor.getFullMethodName(), callOptions);
        return channel.newCall(methodDescriptor, callOptions);
    }
}

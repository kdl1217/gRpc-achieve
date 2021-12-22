package com.kon.service;

import com.kon.hello.GreeterGrpc;
import com.kon.hello.HelloReply;
import com.kon.hello.HelloRequest;
import io.grpc.stub.StreamObserver;

/**
 * note
 *
 * @author kon, created on 2021/12/16T17:45.
 * @version 1.0.0-SNAPSHOT
 */
public class GreeterImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply helloReply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
    }
}

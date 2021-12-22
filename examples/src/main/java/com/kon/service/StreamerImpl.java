package com.kon.service;

import com.kon.hello.StreamReqData;
import com.kon.hello.StreamResData;
import com.kon.hello.StreamerGrpc;
import io.grpc.stub.StreamObserver;

/**
 * note
 *
 * @author kon, created on 2021/12/17T16:33.
 * @version 1.0.0-SNAPSHOT
 */
public class StreamerImpl extends StreamerGrpc.StreamerImplBase {

    @Override
    public void getStream(StreamReqData request, StreamObserver<StreamResData> responseObserver) {
        StreamResData streamResData = StreamResData.newBuilder().setData(request.getData()).build();
        for (int i = 0; i < 10; i++) {
            System.out.println("number :" + i  + "    " + request.getData());
            responseObserver.onNext(streamResData);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StreamReqData> putStream(StreamObserver<StreamResData> responseObserver) {
        return new StreamObserver<StreamReqData>() {

            int count;
            final StringBuilder builder = new StringBuilder();

            @Override
            public void onNext(StreamReqData value) {
                count++;
                System.out.println("Kon: --->" + value.getData());
                StreamResData streamResData = StreamResData.newBuilder().setData("hello" + count).build();
                builder.append(streamResData);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("次数：" + count);
                responseObserver.onNext(StreamResData.newBuilder().setData(builder.toString()).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamReqData> allStream(StreamObserver<StreamResData> responseObserver) {
        return new StreamObserver<StreamReqData>() {
            int count;
            @Override
            public void onNext(StreamReqData value) {
                count++;
                System.out.println("Kon: --->" + value.getData());
                for (int i = 0; i < 10; i++) {
                    StreamResData streamResData = StreamResData.newBuilder().setData("hello" + count + " - " + i).build();
                    responseObserver.onNext(streamResData);
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

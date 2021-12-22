package com.kon;

import com.google.api.client.util.Sleeper;
import com.google.common.util.concurrent.SettableFuture;
import com.kon.hello.StreamReqData;
import com.kon.hello.StreamResData;
import com.kon.hello.StreamerGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/17T17:03.
 * @version 1.0.0-SNAPSHOT
 */
public class StreamerClient {

    public static void main(String[] args) {
        ManagedChannel channel = NettyChannelBuilder.forAddress("127.0.0.1", 3355).negotiationType(NegotiationType.PLAINTEXT).build();

        allStream(channel);
    }

    private static void getStream(ManagedChannel channel) {
        StreamerGrpc.StreamerBlockingStub streamerBlockingStub = StreamerGrpc.newBlockingStub(channel);
        StreamReqData streamReqData = StreamReqData.newBuilder().setData("this is data").build();
        Iterator<StreamResData> stream = streamerBlockingStub.getStream(streamReqData);
        while (stream.hasNext()) {
            System.out.println(stream.next().getData());
        }
    }

    private static void putStream(ManagedChannel channel) {
        StreamerGrpc.StreamerStub noneStreamerStub = StreamerGrpc.newStub(channel);

        StreamObserver<StreamResData> responseObserver = new StreamObserver<StreamResData>() {
            @Override
            public void onNext(StreamResData value) {
                System.out.println("received: " + value.getData());
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
            }
        };

        StreamObserver<StreamReqData> requestStreamObserver = noneStreamerStub.putStream(responseObserver);

        for (int i = 0; i < 10; i++) {
            StreamReqData streamReqData = StreamReqData.newBuilder().setData("send data " + i).build();
            requestStreamObserver.onNext(streamReqData);
        }

        requestStreamObserver.onCompleted();

        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void allStream(ManagedChannel channel) {
        StreamerGrpc.StreamerStub noneStub = StreamerGrpc.newStub(channel);
        StreamObserver<StreamResData> responseObserver = new StreamObserver<StreamResData>() {
            @Override
            public void onNext(StreamResData value) {
                System.out.println("received: " + value.getData());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };

        StreamObserver<StreamReqData> requestObserver = noneStub.allStream(responseObserver);
        for (int i = 0; i < 10; i++) {
            StreamReqData streamReqData = StreamReqData.newBuilder().setData("send data " + i).build();
            requestObserver.onNext(streamReqData);
        }

        requestObserver.onCompleted();

        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

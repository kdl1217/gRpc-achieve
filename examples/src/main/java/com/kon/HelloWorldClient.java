package com.kon;

import com.kon.hello.GreeterGrpc;
import com.kon.hello.HelloReply;
import com.kon.hello.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/17T09:12.
 * @version 1.0.0-SNAPSHOT
 */
@Slf4j
public class HelloWorldClient {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 3344).usePlaintext().build();

        GreeterGrpc.GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);

        HelloRequest helloRequest = HelloRequest.newBuilder().setName("Kon").build();
        HelloReply helloReply = blockingStub.sayHello(helloRequest);
        System.out.println("reply message : " + helloReply.getMessage());

        channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
}

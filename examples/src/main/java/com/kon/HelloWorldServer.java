package com.kon;

import com.kon.service.GreeterImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * note
 *
 * @author kon, created on 2021/12/16T17:41.
 * @version 1.0.0-SNAPSHOT
 */
public class HelloWorldServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(3344).addService(new GreeterImpl()).build().start();
        server.awaitTermination();
    }
}

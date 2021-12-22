package com.kon;

import com.kon.service.StreamerImpl;
import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

import java.io.IOException;

/**
 * note
 *
 * @author kon, created on 2021/12/17T17:03.
 * @version 1.0.0-SNAPSHOT
 */
public class StreamerServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server start = NettyServerBuilder.forPort(3355).addService(new StreamerImpl()).build().start();
        start.awaitTermination();
    }
}

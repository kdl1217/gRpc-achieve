package com.kon.hello;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.0)",
    comments = "Source: helloworld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamerGrpc {

  private StreamerGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Streamer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getGetStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStream",
      requestType = com.kon.hello.StreamReqData.class,
      responseType = com.kon.hello.StreamResData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getGetStreamMethod() {
    io.grpc.MethodDescriptor<com.kon.hello.StreamReqData, com.kon.hello.StreamResData> getGetStreamMethod;
    if ((getGetStreamMethod = StreamerGrpc.getGetStreamMethod) == null) {
      synchronized (StreamerGrpc.class) {
        if ((getGetStreamMethod = StreamerGrpc.getGetStreamMethod) == null) {
          StreamerGrpc.getGetStreamMethod = getGetStreamMethod =
              io.grpc.MethodDescriptor.<com.kon.hello.StreamReqData, com.kon.hello.StreamResData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamReqData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamResData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamerMethodDescriptorSupplier("GetStream"))
              .build();
        }
      }
    }
    return getGetStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getPutStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutStream",
      requestType = com.kon.hello.StreamReqData.class,
      responseType = com.kon.hello.StreamResData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getPutStreamMethod() {
    io.grpc.MethodDescriptor<com.kon.hello.StreamReqData, com.kon.hello.StreamResData> getPutStreamMethod;
    if ((getPutStreamMethod = StreamerGrpc.getPutStreamMethod) == null) {
      synchronized (StreamerGrpc.class) {
        if ((getPutStreamMethod = StreamerGrpc.getPutStreamMethod) == null) {
          StreamerGrpc.getPutStreamMethod = getPutStreamMethod =
              io.grpc.MethodDescriptor.<com.kon.hello.StreamReqData, com.kon.hello.StreamResData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamReqData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamResData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamerMethodDescriptorSupplier("PutStream"))
              .build();
        }
      }
    }
    return getPutStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getAllStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllStream",
      requestType = com.kon.hello.StreamReqData.class,
      responseType = com.kon.hello.StreamResData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.kon.hello.StreamReqData,
      com.kon.hello.StreamResData> getAllStreamMethod() {
    io.grpc.MethodDescriptor<com.kon.hello.StreamReqData, com.kon.hello.StreamResData> getAllStreamMethod;
    if ((getAllStreamMethod = StreamerGrpc.getAllStreamMethod) == null) {
      synchronized (StreamerGrpc.class) {
        if ((getAllStreamMethod = StreamerGrpc.getAllStreamMethod) == null) {
          StreamerGrpc.getAllStreamMethod = getAllStreamMethod =
              io.grpc.MethodDescriptor.<com.kon.hello.StreamReqData, com.kon.hello.StreamResData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamReqData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kon.hello.StreamResData.getDefaultInstance()))
              .setSchemaDescriptor(new StreamerMethodDescriptorSupplier("AllStream"))
              .build();
        }
      }
    }
    return getAllStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamerStub>() {
        @java.lang.Override
        public StreamerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamerStub(channel, callOptions);
        }
      };
    return StreamerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamerBlockingStub>() {
        @java.lang.Override
        public StreamerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamerBlockingStub(channel, callOptions);
        }
      };
    return StreamerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamerFutureStub>() {
        @java.lang.Override
        public StreamerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamerFutureStub(channel, callOptions);
        }
      };
    return StreamerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StreamerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 服务端推送流
     * </pre>
     */
    public void getStream(com.kon.hello.StreamReqData request,
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 客户端推送流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kon.hello.StreamReqData> putStream(
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getPutStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * 双向流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kon.hello.StreamReqData> allStream(
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAllStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.kon.hello.StreamReqData,
                com.kon.hello.StreamResData>(
                  this, METHODID_GET_STREAM)))
          .addMethod(
            getPutStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.kon.hello.StreamReqData,
                com.kon.hello.StreamResData>(
                  this, METHODID_PUT_STREAM)))
          .addMethod(
            getAllStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.kon.hello.StreamReqData,
                com.kon.hello.StreamResData>(
                  this, METHODID_ALL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class StreamerStub extends io.grpc.stub.AbstractAsyncStub<StreamerStub> {
    private StreamerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 服务端推送流
     * </pre>
     */
    public void getStream(com.kon.hello.StreamReqData request,
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端推送流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kon.hello.StreamReqData> putStream(
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getPutStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.kon.hello.StreamReqData> allStream(
        io.grpc.stub.StreamObserver<com.kon.hello.StreamResData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAllStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StreamerBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamerBlockingStub> {
    private StreamerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 服务端推送流
     * </pre>
     */
    public java.util.Iterator<com.kon.hello.StreamResData> getStream(
        com.kon.hello.StreamReqData request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamerFutureStub extends io.grpc.stub.AbstractFutureStub<StreamerFutureStub> {
    private StreamerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_STREAM = 0;
  private static final int METHODID_PUT_STREAM = 1;
  private static final int METHODID_ALL_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STREAM:
          serviceImpl.getStream((com.kon.hello.StreamReqData) request,
              (io.grpc.stub.StreamObserver<com.kon.hello.StreamResData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.putStream(
              (io.grpc.stub.StreamObserver<com.kon.hello.StreamResData>) responseObserver);
        case METHODID_ALL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.allStream(
              (io.grpc.stub.StreamObserver<com.kon.hello.StreamResData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StreamerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kon.hello.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Streamer");
    }
  }

  private static final class StreamerFileDescriptorSupplier
      extends StreamerBaseDescriptorSupplier {
    StreamerFileDescriptorSupplier() {}
  }

  private static final class StreamerMethodDescriptorSupplier
      extends StreamerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StreamerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamerFileDescriptorSupplier())
              .addMethod(getGetStreamMethod())
              .addMethod(getPutStreamMethod())
              .addMethod(getAllStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}

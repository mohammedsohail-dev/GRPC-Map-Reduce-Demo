package com.sohail.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class query3Grpc {

  private query3Grpc() {}

  public static final String SERVICE_NAME = "query3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Details3,
      com.sohail.grpc.User.Query3> getQuerythreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querythree",
      requestType = com.sohail.grpc.User.Details3.class,
      responseType = com.sohail.grpc.User.Query3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Details3,
      com.sohail.grpc.User.Query3> getQuerythreeMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Details3, com.sohail.grpc.User.Query3> getQuerythreeMethod;
    if ((getQuerythreeMethod = query3Grpc.getQuerythreeMethod) == null) {
      synchronized (query3Grpc.class) {
        if ((getQuerythreeMethod = query3Grpc.getQuerythreeMethod) == null) {
          query3Grpc.getQuerythreeMethod = getQuerythreeMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details3, com.sohail.grpc.User.Query3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "query3", "querythree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query3.getDefaultInstance()))
                  .setSchemaDescriptor(new query3MethodDescriptorSupplier("querythree"))
                  .build();
          }
        }
     }
     return getQuerythreeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static query3Stub newStub(io.grpc.Channel channel) {
    return new query3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static query3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new query3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static query3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new query3FutureStub(channel);
  }

  /**
   */
  public static abstract class query3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void querythree(com.sohail.grpc.User.Details3 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerythreeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQuerythreeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details3,
                com.sohail.grpc.User.Query3>(
                  this, METHODID_QUERYTHREE)))
          .build();
    }
  }

  /**
   */
  public static final class query3Stub extends io.grpc.stub.AbstractStub<query3Stub> {
    private query3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private query3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query3Stub(channel, callOptions);
    }

    /**
     */
    public void querythree(com.sohail.grpc.User.Details3 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerythreeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class query3BlockingStub extends io.grpc.stub.AbstractStub<query3BlockingStub> {
    private query3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query3BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.Query3 querythree(com.sohail.grpc.User.Details3 request) {
      return blockingUnaryCall(
          getChannel(), getQuerythreeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class query3FutureStub extends io.grpc.stub.AbstractStub<query3FutureStub> {
    private query3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query3> querythree(
        com.sohail.grpc.User.Details3 request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerythreeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERYTHREE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final query3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(query3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERYTHREE:
          serviceImpl.querythree((com.sohail.grpc.User.Details3) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class query3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    query3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("query3");
    }
  }

  private static final class query3FileDescriptorSupplier
      extends query3BaseDescriptorSupplier {
    query3FileDescriptorSupplier() {}
  }

  private static final class query3MethodDescriptorSupplier
      extends query3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    query3MethodDescriptorSupplier(String methodName) {
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
      synchronized (query3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new query3FileDescriptorSupplier())
              .addMethod(getQuerythreeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

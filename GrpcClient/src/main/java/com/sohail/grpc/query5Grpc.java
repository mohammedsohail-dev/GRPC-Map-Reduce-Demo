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
public final class query5Grpc {

  private query5Grpc() {}

  public static final String SERVICE_NAME = "query5";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Details5,
      com.sohail.grpc.User.Query5> getQueryfiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryfive",
      requestType = com.sohail.grpc.User.Details5.class,
      responseType = com.sohail.grpc.User.Query5.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Details5,
      com.sohail.grpc.User.Query5> getQueryfiveMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Details5, com.sohail.grpc.User.Query5> getQueryfiveMethod;
    if ((getQueryfiveMethod = query5Grpc.getQueryfiveMethod) == null) {
      synchronized (query5Grpc.class) {
        if ((getQueryfiveMethod = query5Grpc.getQueryfiveMethod) == null) {
          query5Grpc.getQueryfiveMethod = getQueryfiveMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details5, com.sohail.grpc.User.Query5>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "query5", "queryfive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details5.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query5.getDefaultInstance()))
                  .setSchemaDescriptor(new query5MethodDescriptorSupplier("queryfive"))
                  .build();
          }
        }
     }
     return getQueryfiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static query5Stub newStub(io.grpc.Channel channel) {
    return new query5Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static query5BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new query5BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static query5FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new query5FutureStub(channel);
  }

  /**
   */
  public static abstract class query5ImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryfive(com.sohail.grpc.User.Details5 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query5> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryfiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryfiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details5,
                com.sohail.grpc.User.Query5>(
                  this, METHODID_QUERYFIVE)))
          .build();
    }
  }

  /**
   */
  public static final class query5Stub extends io.grpc.stub.AbstractStub<query5Stub> {
    private query5Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private query5Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query5Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query5Stub(channel, callOptions);
    }

    /**
     */
    public void queryfive(com.sohail.grpc.User.Details5 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query5> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryfiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class query5BlockingStub extends io.grpc.stub.AbstractStub<query5BlockingStub> {
    private query5BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query5BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query5BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query5BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.Query5 queryfive(com.sohail.grpc.User.Details5 request) {
      return blockingUnaryCall(
          getChannel(), getQueryfiveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class query5FutureStub extends io.grpc.stub.AbstractStub<query5FutureStub> {
    private query5FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query5FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query5FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query5FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query5> queryfive(
        com.sohail.grpc.User.Details5 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryfiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERYFIVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final query5ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(query5ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERYFIVE:
          serviceImpl.queryfive((com.sohail.grpc.User.Details5) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query5>) responseObserver);
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

  private static abstract class query5BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    query5BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("query5");
    }
  }

  private static final class query5FileDescriptorSupplier
      extends query5BaseDescriptorSupplier {
    query5FileDescriptorSupplier() {}
  }

  private static final class query5MethodDescriptorSupplier
      extends query5BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    query5MethodDescriptorSupplier(String methodName) {
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
      synchronized (query5Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new query5FileDescriptorSupplier())
              .addMethod(getQueryfiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}

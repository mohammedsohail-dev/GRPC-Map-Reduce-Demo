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
public final class query1Grpc {

  private query1Grpc() {}

  public static final String SERVICE_NAME = "query1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Details1,
      com.sohail.grpc.User.Query1> getQueryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryone",
      requestType = com.sohail.grpc.User.Details1.class,
      responseType = com.sohail.grpc.User.Query1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Details1,
      com.sohail.grpc.User.Query1> getQueryoneMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Details1, com.sohail.grpc.User.Query1> getQueryoneMethod;
    if ((getQueryoneMethod = query1Grpc.getQueryoneMethod) == null) {
      synchronized (query1Grpc.class) {
        if ((getQueryoneMethod = query1Grpc.getQueryoneMethod) == null) {
          query1Grpc.getQueryoneMethod = getQueryoneMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details1, com.sohail.grpc.User.Query1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "query1", "queryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query1.getDefaultInstance()))
                  .setSchemaDescriptor(new query1MethodDescriptorSupplier("queryone"))
                  .build();
          }
        }
     }
     return getQueryoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static query1Stub newStub(io.grpc.Channel channel) {
    return new query1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static query1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new query1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static query1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new query1FutureStub(channel);
  }

  /**
   */
  public static abstract class query1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryone(com.sohail.grpc.User.Details1 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details1,
                com.sohail.grpc.User.Query1>(
                  this, METHODID_QUERYONE)))
          .build();
    }
  }

  /**
   */
  public static final class query1Stub extends io.grpc.stub.AbstractStub<query1Stub> {
    private query1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private query1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query1Stub(channel, callOptions);
    }

    /**
     */
    public void queryone(com.sohail.grpc.User.Details1 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryoneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class query1BlockingStub extends io.grpc.stub.AbstractStub<query1BlockingStub> {
    private query1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query1BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.Query1 queryone(com.sohail.grpc.User.Details1 request) {
      return blockingUnaryCall(
          getChannel(), getQueryoneMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class query1FutureStub extends io.grpc.stub.AbstractStub<query1FutureStub> {
    private query1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query1> queryone(
        com.sohail.grpc.User.Details1 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryoneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERYONE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final query1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(query1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERYONE:
          serviceImpl.queryone((com.sohail.grpc.User.Details1) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1>) responseObserver);
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

  private static abstract class query1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    query1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("query1");
    }
  }

  private static final class query1FileDescriptorSupplier
      extends query1BaseDescriptorSupplier {
    query1FileDescriptorSupplier() {}
  }

  private static final class query1MethodDescriptorSupplier
      extends query1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    query1MethodDescriptorSupplier(String methodName) {
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
      synchronized (query1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new query1FileDescriptorSupplier())
              .addMethod(getQueryoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}

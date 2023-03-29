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
public final class query2Grpc {

  private query2Grpc() {}

  public static final String SERVICE_NAME = "query2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Details2,
      com.sohail.grpc.User.Query2> getQuerytwoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "querytwo",
      requestType = com.sohail.grpc.User.Details2.class,
      responseType = com.sohail.grpc.User.Query2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Details2,
      com.sohail.grpc.User.Query2> getQuerytwoMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Details2, com.sohail.grpc.User.Query2> getQuerytwoMethod;
    if ((getQuerytwoMethod = query2Grpc.getQuerytwoMethod) == null) {
      synchronized (query2Grpc.class) {
        if ((getQuerytwoMethod = query2Grpc.getQuerytwoMethod) == null) {
          query2Grpc.getQuerytwoMethod = getQuerytwoMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details2, com.sohail.grpc.User.Query2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "query2", "querytwo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query2.getDefaultInstance()))
                  .setSchemaDescriptor(new query2MethodDescriptorSupplier("querytwo"))
                  .build();
          }
        }
     }
     return getQuerytwoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static query2Stub newStub(io.grpc.Channel channel) {
    return new query2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static query2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new query2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static query2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new query2FutureStub(channel);
  }

  /**
   */
  public static abstract class query2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void querytwo(com.sohail.grpc.User.Details2 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerytwoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQuerytwoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details2,
                com.sohail.grpc.User.Query2>(
                  this, METHODID_QUERYTWO)))
          .build();
    }
  }

  /**
   */
  public static final class query2Stub extends io.grpc.stub.AbstractStub<query2Stub> {
    private query2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private query2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query2Stub(channel, callOptions);
    }

    /**
     */
    public void querytwo(com.sohail.grpc.User.Details2 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerytwoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class query2BlockingStub extends io.grpc.stub.AbstractStub<query2BlockingStub> {
    private query2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query2BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.Query2 querytwo(com.sohail.grpc.User.Details2 request) {
      return blockingUnaryCall(
          getChannel(), getQuerytwoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class query2FutureStub extends io.grpc.stub.AbstractStub<query2FutureStub> {
    private query2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query2> querytwo(
        com.sohail.grpc.User.Details2 request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerytwoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERYTWO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final query2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(query2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERYTWO:
          serviceImpl.querytwo((com.sohail.grpc.User.Details2) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2>) responseObserver);
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

  private static abstract class query2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    query2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("query2");
    }
  }

  private static final class query2FileDescriptorSupplier
      extends query2BaseDescriptorSupplier {
    query2FileDescriptorSupplier() {}
  }

  private static final class query2MethodDescriptorSupplier
      extends query2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    query2MethodDescriptorSupplier(String methodName) {
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
      synchronized (query2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new query2FileDescriptorSupplier())
              .addMethod(getQuerytwoMethod())
              .build();
        }
      }
    }
    return result;
  }
}

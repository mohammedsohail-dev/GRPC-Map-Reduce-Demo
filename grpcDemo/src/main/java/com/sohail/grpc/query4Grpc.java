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
public final class query4Grpc {

  private query4Grpc() {}

  public static final String SERVICE_NAME = "query4";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Details4,
      com.sohail.grpc.User.Query4> getQueryfourMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryfour",
      requestType = com.sohail.grpc.User.Details4.class,
      responseType = com.sohail.grpc.User.Query4.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Details4,
      com.sohail.grpc.User.Query4> getQueryfourMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Details4, com.sohail.grpc.User.Query4> getQueryfourMethod;
    if ((getQueryfourMethod = query4Grpc.getQueryfourMethod) == null) {
      synchronized (query4Grpc.class) {
        if ((getQueryfourMethod = query4Grpc.getQueryfourMethod) == null) {
          query4Grpc.getQueryfourMethod = getQueryfourMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details4, com.sohail.grpc.User.Query4>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "query4", "queryfour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details4.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query4.getDefaultInstance()))
                  .setSchemaDescriptor(new query4MethodDescriptorSupplier("queryfour"))
                  .build();
          }
        }
     }
     return getQueryfourMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static query4Stub newStub(io.grpc.Channel channel) {
    return new query4Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static query4BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new query4BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static query4FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new query4FutureStub(channel);
  }

  /**
   */
  public static abstract class query4ImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryfour(com.sohail.grpc.User.Details4 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryfourMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryfourMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details4,
                com.sohail.grpc.User.Query4>(
                  this, METHODID_QUERYFOUR)))
          .build();
    }
  }

  /**
   */
  public static final class query4Stub extends io.grpc.stub.AbstractStub<query4Stub> {
    private query4Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private query4Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query4Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query4Stub(channel, callOptions);
    }

    /**
     */
    public void queryfour(com.sohail.grpc.User.Details4 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryfourMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class query4BlockingStub extends io.grpc.stub.AbstractStub<query4BlockingStub> {
    private query4BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query4BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query4BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query4BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.Query4 queryfour(com.sohail.grpc.User.Details4 request) {
      return blockingUnaryCall(
          getChannel(), getQueryfourMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class query4FutureStub extends io.grpc.stub.AbstractStub<query4FutureStub> {
    private query4FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private query4FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected query4FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new query4FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query4> queryfour(
        com.sohail.grpc.User.Details4 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryfourMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERYFOUR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final query4ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(query4ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERYFOUR:
          serviceImpl.queryfour((com.sohail.grpc.User.Details4) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4>) responseObserver);
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

  private static abstract class query4BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    query4BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("query4");
    }
  }

  private static final class query4FileDescriptorSupplier
      extends query4BaseDescriptorSupplier {
    query4FileDescriptorSupplier() {}
  }

  private static final class query4MethodDescriptorSupplier
      extends query4BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    query4MethodDescriptorSupplier(String methodName) {
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
      synchronized (query4Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new query4FileDescriptorSupplier())
              .addMethod(getQueryfourMethod())
              .build();
        }
      }
    }
    return result;
  }
}

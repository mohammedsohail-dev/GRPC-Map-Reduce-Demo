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
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.LoginRequest,
      com.sohail.grpc.User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.sohail.grpc.User.LoginRequest.class,
      responseType = com.sohail.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.LoginRequest,
      com.sohail.grpc.User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.LoginRequest, com.sohail.grpc.User.APIResponse> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.LoginRequest, com.sohail.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sohail.grpc.User.Empty,
      com.sohail.grpc.User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.sohail.grpc.User.Empty.class,
      responseType = com.sohail.grpc.User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sohail.grpc.User.Empty,
      com.sohail.grpc.User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.sohail.grpc.User.Empty, com.sohail.grpc.User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Empty, com.sohail.grpc.User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

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
    if ((getQueryoneMethod = userGrpc.getQueryoneMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getQueryoneMethod = userGrpc.getQueryoneMethod) == null) {
          userGrpc.getQueryoneMethod = getQueryoneMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details1, com.sohail.grpc.User.Query1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "queryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query1.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("queryone"))
                  .build();
          }
        }
     }
     return getQueryoneMethod;
  }

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
    if ((getQuerytwoMethod = userGrpc.getQuerytwoMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getQuerytwoMethod = userGrpc.getQuerytwoMethod) == null) {
          userGrpc.getQuerytwoMethod = getQuerytwoMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details2, com.sohail.grpc.User.Query2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "querytwo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query2.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("querytwo"))
                  .build();
          }
        }
     }
     return getQuerytwoMethod;
  }

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
    if ((getQuerythreeMethod = userGrpc.getQuerythreeMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getQuerythreeMethod = userGrpc.getQuerythreeMethod) == null) {
          userGrpc.getQuerythreeMethod = getQuerythreeMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details3, com.sohail.grpc.User.Query3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "querythree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query3.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("querythree"))
                  .build();
          }
        }
     }
     return getQuerythreeMethod;
  }

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
    if ((getQueryfourMethod = userGrpc.getQueryfourMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getQueryfourMethod = userGrpc.getQueryfourMethod) == null) {
          userGrpc.getQueryfourMethod = getQueryfourMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details4, com.sohail.grpc.User.Query4>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "queryfour"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details4.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query4.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("queryfour"))
                  .build();
          }
        }
     }
     return getQueryfourMethod;
  }

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
    if ((getQueryfiveMethod = userGrpc.getQueryfiveMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getQueryfiveMethod = userGrpc.getQueryfiveMethod) == null) {
          userGrpc.getQueryfiveMethod = getQueryfiveMethod = 
              io.grpc.MethodDescriptor.<com.sohail.grpc.User.Details5, com.sohail.grpc.User.Query5>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "queryfive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Details5.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sohail.grpc.User.Query5.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("queryfive"))
                  .build();
          }
        }
     }
     return getQueryfiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.sohail.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.sohail.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void queryone(com.sohail.grpc.User.Details1 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryoneMethod(), responseObserver);
    }

    /**
     */
    public void querytwo(com.sohail.grpc.User.Details2 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerytwoMethod(), responseObserver);
    }

    /**
     */
    public void querythree(com.sohail.grpc.User.Details3 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3> responseObserver) {
      asyncUnimplementedUnaryCall(getQuerythreeMethod(), responseObserver);
    }

    /**
     */
    public void queryfour(com.sohail.grpc.User.Details4 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryfourMethod(), responseObserver);
    }

    /**
     */
    public void queryfive(com.sohail.grpc.User.Details5 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query5> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryfiveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.LoginRequest,
                com.sohail.grpc.User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Empty,
                com.sohail.grpc.User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getQueryoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details1,
                com.sohail.grpc.User.Query1>(
                  this, METHODID_QUERYONE)))
          .addMethod(
            getQuerytwoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details2,
                com.sohail.grpc.User.Query2>(
                  this, METHODID_QUERYTWO)))
          .addMethod(
            getQuerythreeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details3,
                com.sohail.grpc.User.Query3>(
                  this, METHODID_QUERYTHREE)))
          .addMethod(
            getQueryfourMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sohail.grpc.User.Details4,
                com.sohail.grpc.User.Query4>(
                  this, METHODID_QUERYFOUR)))
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
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void login(com.sohail.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.sohail.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryone(com.sohail.grpc.User.Details1 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querytwo(com.sohail.grpc.User.Details2 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerytwoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void querythree(com.sohail.grpc.User.Details3 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuerythreeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryfour(com.sohail.grpc.User.Details4 request,
        io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryfourMethod(), getCallOptions()), request, responseObserver);
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
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sohail.grpc.User.APIResponse login(com.sohail.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sohail.grpc.User.APIResponse logout(com.sohail.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sohail.grpc.User.Query1 queryone(com.sohail.grpc.User.Details1 request) {
      return blockingUnaryCall(
          getChannel(), getQueryoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sohail.grpc.User.Query2 querytwo(com.sohail.grpc.User.Details2 request) {
      return blockingUnaryCall(
          getChannel(), getQuerytwoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sohail.grpc.User.Query3 querythree(com.sohail.grpc.User.Details3 request) {
      return blockingUnaryCall(
          getChannel(), getQuerythreeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sohail.grpc.User.Query4 queryfour(com.sohail.grpc.User.Details4 request) {
      return blockingUnaryCall(
          getChannel(), getQueryfourMethod(), getCallOptions(), request);
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
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.APIResponse> login(
        com.sohail.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.APIResponse> logout(
        com.sohail.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query1> queryone(
        com.sohail.grpc.User.Details1 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query2> querytwo(
        com.sohail.grpc.User.Details2 request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerytwoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query3> querythree(
        com.sohail.grpc.User.Details3 request) {
      return futureUnaryCall(
          getChannel().newCall(getQuerythreeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query4> queryfour(
        com.sohail.grpc.User.Details4 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryfourMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sohail.grpc.User.Query5> queryfive(
        com.sohail.grpc.User.Details5 request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryfiveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_QUERYONE = 2;
  private static final int METHODID_QUERYTWO = 3;
  private static final int METHODID_QUERYTHREE = 4;
  private static final int METHODID_QUERYFOUR = 5;
  private static final int METHODID_QUERYFIVE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.sohail.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.sohail.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.APIResponse>) responseObserver);
          break;
        case METHODID_QUERYONE:
          serviceImpl.queryone((com.sohail.grpc.User.Details1) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query1>) responseObserver);
          break;
        case METHODID_QUERYTWO:
          serviceImpl.querytwo((com.sohail.grpc.User.Details2) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query2>) responseObserver);
          break;
        case METHODID_QUERYTHREE:
          serviceImpl.querythree((com.sohail.grpc.User.Details3) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query3>) responseObserver);
          break;
        case METHODID_QUERYFOUR:
          serviceImpl.queryfour((com.sohail.grpc.User.Details4) request,
              (io.grpc.stub.StreamObserver<com.sohail.grpc.User.Query4>) responseObserver);
          break;
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

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sohail.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getQueryoneMethod())
              .addMethod(getQuerytwoMethod())
              .addMethod(getQuerythreeMethod())
              .addMethod(getQueryfourMethod())
              .addMethod(getQueryfiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}

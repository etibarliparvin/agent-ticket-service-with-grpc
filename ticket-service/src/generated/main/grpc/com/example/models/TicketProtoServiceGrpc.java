package com.example.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: grpc/ticket.proto")
public final class TicketProtoServiceGrpc {

  private TicketProtoServiceGrpc() {}

  public static final String SERVICE_NAME = "TicketProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.models.TicketCreateRequest,
      com.example.models.TicketProtoResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = com.example.models.TicketCreateRequest.class,
      responseType = com.example.models.TicketProtoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.models.TicketCreateRequest,
      com.example.models.TicketProtoResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.example.models.TicketCreateRequest, com.example.models.TicketProtoResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketProtoServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketProtoServiceGrpc.class) {
        if ((getCreateTicketMethod = TicketProtoServiceGrpc.getCreateTicketMethod) == null) {
          TicketProtoServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<com.example.models.TicketCreateRequest, com.example.models.TicketProtoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketProtoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketProtoServiceMethodDescriptorSupplier("createTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.models.TicketFindByIdRequest,
      com.example.models.TicketProtoResponse> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = com.example.models.TicketFindByIdRequest.class,
      responseType = com.example.models.TicketProtoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.models.TicketFindByIdRequest,
      com.example.models.TicketProtoResponse> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.example.models.TicketFindByIdRequest, com.example.models.TicketProtoResponse> getFindByIdMethod;
    if ((getFindByIdMethod = TicketProtoServiceGrpc.getFindByIdMethod) == null) {
      synchronized (TicketProtoServiceGrpc.class) {
        if ((getFindByIdMethod = TicketProtoServiceGrpc.getFindByIdMethod) == null) {
          TicketProtoServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.example.models.TicketFindByIdRequest, com.example.models.TicketProtoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketFindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketProtoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketProtoServiceMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.models.TicketResponses> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.models.TicketResponses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.models.TicketResponses> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.models.TicketResponses> getFindAllMethod;
    if ((getFindAllMethod = TicketProtoServiceGrpc.getFindAllMethod) == null) {
      synchronized (TicketProtoServiceGrpc.class) {
        if ((getFindAllMethod = TicketProtoServiceGrpc.getFindAllMethod) == null) {
          TicketProtoServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.models.TicketResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketResponses.getDefaultInstance()))
              .setSchemaDescriptor(new TicketProtoServiceMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.models.TicketUpdateRequest,
      com.example.models.TicketProtoResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.example.models.TicketUpdateRequest.class,
      responseType = com.example.models.TicketProtoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.models.TicketUpdateRequest,
      com.example.models.TicketProtoResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.models.TicketUpdateRequest, com.example.models.TicketProtoResponse> getUpdateMethod;
    if ((getUpdateMethod = TicketProtoServiceGrpc.getUpdateMethod) == null) {
      synchronized (TicketProtoServiceGrpc.class) {
        if ((getUpdateMethod = TicketProtoServiceGrpc.getUpdateMethod) == null) {
          TicketProtoServiceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.example.models.TicketUpdateRequest, com.example.models.TicketProtoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.models.TicketProtoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketProtoServiceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceStub>() {
        @java.lang.Override
        public TicketProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketProtoServiceStub(channel, callOptions);
        }
      };
    return TicketProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceBlockingStub>() {
        @java.lang.Override
        public TicketProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return TicketProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketProtoServiceFutureStub>() {
        @java.lang.Override
        public TicketProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketProtoServiceFutureStub(channel, callOptions);
        }
      };
    return TicketProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TicketProtoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTicket(com.example.models.TicketCreateRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void findById(com.example.models.TicketFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.models.TicketResponses> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void update(com.example.models.TicketUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.models.TicketCreateRequest,
                com.example.models.TicketProtoResponse>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.models.TicketFindByIdRequest,
                com.example.models.TicketProtoResponse>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.models.TicketResponses>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.models.TicketUpdateRequest,
                com.example.models.TicketProtoResponse>(
                  this, METHODID_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class TicketProtoServiceStub extends io.grpc.stub.AbstractAsyncStub<TicketProtoServiceStub> {
    private TicketProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTicket(com.example.models.TicketCreateRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(com.example.models.TicketFindByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.models.TicketResponses> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.example.models.TicketUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketProtoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TicketProtoServiceBlockingStub> {
    private TicketProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.models.TicketProtoResponse createTicket(com.example.models.TicketCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.models.TicketProtoResponse findById(com.example.models.TicketFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.models.TicketResponses findAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.models.TicketProtoResponse update(com.example.models.TicketUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketProtoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TicketProtoServiceFutureStub> {
    private TicketProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.models.TicketProtoResponse> createTicket(
        com.example.models.TicketCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.models.TicketProtoResponse> findById(
        com.example.models.TicketFindByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.models.TicketResponses> findAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.models.TicketProtoResponse> update(
        com.example.models.TicketUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_FIND_ALL = 2;
  private static final int METHODID_UPDATE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketProtoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketProtoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.example.models.TicketCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.example.models.TicketFindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.models.TicketResponses>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.example.models.TicketUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.models.TicketProtoResponse>) responseObserver);
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

  private static abstract class TicketProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.models.Ticket.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketProtoService");
    }
  }

  private static final class TicketProtoServiceFileDescriptorSupplier
      extends TicketProtoServiceBaseDescriptorSupplier {
    TicketProtoServiceFileDescriptorSupplier() {}
  }

  private static final class TicketProtoServiceMethodDescriptorSupplier
      extends TicketProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketProtoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TicketProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketProtoServiceFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

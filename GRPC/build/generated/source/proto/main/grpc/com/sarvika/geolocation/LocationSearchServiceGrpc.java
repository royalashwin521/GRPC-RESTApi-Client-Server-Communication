package com.sarvika.geolocation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: geolocation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LocationSearchServiceGrpc {

  private LocationSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "com.sarvika.geolocation.LocationSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sarvika.geolocation.GeolocationService.SearchRequest,
      com.sarvika.geolocation.GeolocationService.Coordinates> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.sarvika.geolocation.GeolocationService.SearchRequest.class,
      responseType = com.sarvika.geolocation.GeolocationService.Coordinates.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sarvika.geolocation.GeolocationService.SearchRequest,
      com.sarvika.geolocation.GeolocationService.Coordinates> getSearchMethod() {
    io.grpc.MethodDescriptor<com.sarvika.geolocation.GeolocationService.SearchRequest, com.sarvika.geolocation.GeolocationService.Coordinates> getSearchMethod;
    if ((getSearchMethod = LocationSearchServiceGrpc.getSearchMethod) == null) {
      synchronized (LocationSearchServiceGrpc.class) {
        if ((getSearchMethod = LocationSearchServiceGrpc.getSearchMethod) == null) {
          LocationSearchServiceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.sarvika.geolocation.GeolocationService.SearchRequest, com.sarvika.geolocation.GeolocationService.Coordinates>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sarvika.geolocation.GeolocationService.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sarvika.geolocation.GeolocationService.Coordinates.getDefaultInstance()))
              .setSchemaDescriptor(new LocationSearchServiceMethodDescriptorSupplier("search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceStub>() {
        @java.lang.Override
        public LocationSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationSearchServiceStub(channel, callOptions);
        }
      };
    return LocationSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceBlockingStub>() {
        @java.lang.Override
        public LocationSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationSearchServiceFutureStub>() {
        @java.lang.Override
        public LocationSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationSearchServiceFutureStub(channel, callOptions);
        }
      };
    return LocationSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LocationSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(com.sarvika.geolocation.GeolocationService.SearchRequest request,
        io.grpc.stub.StreamObserver<com.sarvika.geolocation.GeolocationService.Coordinates> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sarvika.geolocation.GeolocationService.SearchRequest,
                com.sarvika.geolocation.GeolocationService.Coordinates>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class LocationSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<LocationSearchServiceStub> {
    private LocationSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void search(com.sarvika.geolocation.GeolocationService.SearchRequest request,
        io.grpc.stub.StreamObserver<com.sarvika.geolocation.GeolocationService.Coordinates> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationSearchServiceBlockingStub> {
    private LocationSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sarvika.geolocation.GeolocationService.Coordinates search(com.sarvika.geolocation.GeolocationService.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LocationSearchServiceFutureStub> {
    private LocationSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationSearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sarvika.geolocation.GeolocationService.Coordinates> search(
        com.sarvika.geolocation.GeolocationService.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          serviceImpl.search((com.sarvika.geolocation.GeolocationService.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.sarvika.geolocation.GeolocationService.Coordinates>) responseObserver);
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

  private static abstract class LocationSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocationSearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sarvika.geolocation.GeolocationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LocationSearchService");
    }
  }

  private static final class LocationSearchServiceFileDescriptorSupplier
      extends LocationSearchServiceBaseDescriptorSupplier {
    LocationSearchServiceFileDescriptorSupplier() {}
  }

  private static final class LocationSearchServiceMethodDescriptorSupplier
      extends LocationSearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocationSearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocationSearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocationSearchServiceFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}

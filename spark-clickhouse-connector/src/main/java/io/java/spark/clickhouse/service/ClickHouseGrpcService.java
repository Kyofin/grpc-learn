package io.java.spark.clickhouse.service;

import io.java.spark.clickhouse.code.ClickhouseGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: clickhouse_grpc.proto")
public final class ClickHouseGrpcService {

  private ClickHouseGrpcService() {}

  public static final String SERVICE_NAME = "clickhouse.grpc.ClickHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQuery",
      requestType = ClickhouseGrpc.QueryInfo.class,
      responseType = ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryMethod() {
    io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result> getExecuteQueryMethod;
    if ((getExecuteQueryMethod = ClickHouseGrpcService.getExecuteQueryMethod) == null) {
      synchronized (ClickHouseGrpcService.class) {
        if ((getExecuteQueryMethod = ClickHouseGrpcService.getExecuteQueryMethod) == null) {
          ClickHouseGrpcService.getExecuteQueryMethod = getExecuteQueryMethod =
              io.grpc.MethodDescriptor.<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQuery"))
                  .build();
          }
        }
     }
     return getExecuteQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamInput",
      requestType = ClickhouseGrpc.QueryInfo.class,
      responseType = ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod() {
    io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod;
    if ((getExecuteQueryWithStreamInputMethod = ClickHouseGrpcService.getExecuteQueryWithStreamInputMethod) == null) {
      synchronized (ClickHouseGrpcService.class) {
        if ((getExecuteQueryWithStreamInputMethod = ClickHouseGrpcService.getExecuteQueryWithStreamInputMethod) == null) {
          ClickHouseGrpcService.getExecuteQueryWithStreamInputMethod = getExecuteQueryWithStreamInputMethod =
              io.grpc.MethodDescriptor.<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQueryWithStreamInput"))
                  .build();
          }
        }
     }
     return getExecuteQueryWithStreamInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamOutput",
      requestType = ClickhouseGrpc.QueryInfo.class,
      responseType = ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod() {
    io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod;
    if ((getExecuteQueryWithStreamOutputMethod = ClickHouseGrpcService.getExecuteQueryWithStreamOutputMethod) == null) {
      synchronized (ClickHouseGrpcService.class) {
        if ((getExecuteQueryWithStreamOutputMethod = ClickHouseGrpcService.getExecuteQueryWithStreamOutputMethod) == null) {
          ClickHouseGrpcService.getExecuteQueryWithStreamOutputMethod = getExecuteQueryWithStreamOutputMethod =
              io.grpc.MethodDescriptor.<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamOutput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQueryWithStreamOutput"))
                  .build();
          }
        }
     }
     return getExecuteQueryWithStreamOutputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamIO",
      requestType = ClickhouseGrpc.QueryInfo.class,
      responseType = ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo,
          ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod() {
    io.grpc.MethodDescriptor<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod;
    if ((getExecuteQueryWithStreamIOMethod = ClickHouseGrpcService.getExecuteQueryWithStreamIOMethod) == null) {
      synchronized (ClickHouseGrpcService.class) {
        if ((getExecuteQueryWithStreamIOMethod = ClickHouseGrpcService.getExecuteQueryWithStreamIOMethod) == null) {
          ClickHouseGrpcService.getExecuteQueryWithStreamIOMethod = getExecuteQueryWithStreamIOMethod =
              io.grpc.MethodDescriptor.<ClickhouseGrpc.QueryInfo, ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamIO"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQueryWithStreamIO"))
                  .build();
          }
        }
     }
     return getExecuteQueryWithStreamIOMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClickHouseStub newStub(io.grpc.Channel channel) {
    return new ClickHouseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClickHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClickHouseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClickHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClickHouseFutureStub(channel);
  }

  /**
   */
  public static abstract class ClickHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void executeQuery(ClickhouseGrpc.QueryInfo request,
                             io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteQueryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ClickhouseGrpc.QueryInfo> executeQueryWithStreamInput(
        io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteQueryWithStreamInputMethod(), responseObserver);
    }

    /**
     */
    public void executeQueryWithStreamOutput(ClickhouseGrpc.QueryInfo request,
                                             io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteQueryWithStreamOutputMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ClickhouseGrpc.QueryInfo> executeQueryWithStreamIO(
        io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteQueryWithStreamIOMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ClickhouseGrpc.QueryInfo,
                      ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY)))
          .addMethod(
            getExecuteQueryWithStreamInputMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                      ClickhouseGrpc.QueryInfo,
                      ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY_WITH_STREAM_INPUT)))
          .addMethod(
            getExecuteQueryWithStreamOutputMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                      ClickhouseGrpc.QueryInfo,
                      ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY_WITH_STREAM_OUTPUT)))
          .addMethod(
            getExecuteQueryWithStreamIOMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                      ClickhouseGrpc.QueryInfo,
                      ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY_WITH_STREAM_IO)))
          .build();
    }
  }

  /**
   */
  public static final class ClickHouseStub extends io.grpc.stub.AbstractStub<ClickHouseStub> {
    private ClickHouseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClickHouseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ClickHouseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseStub(channel, callOptions);
    }

    /**
     */
    public void executeQuery(ClickhouseGrpc.QueryInfo request,
                             io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ClickhouseGrpc.QueryInfo> executeQueryWithStreamInput(
        io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getExecuteQueryWithStreamInputMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void executeQueryWithStreamOutput(ClickhouseGrpc.QueryInfo request,
                                             io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getExecuteQueryWithStreamOutputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ClickhouseGrpc.QueryInfo> executeQueryWithStreamIO(
        io.grpc.stub.StreamObserver<ClickhouseGrpc.Result> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteQueryWithStreamIOMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ClickHouseBlockingStub extends io.grpc.stub.AbstractStub<ClickHouseBlockingStub> {
    private ClickHouseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClickHouseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ClickHouseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public ClickhouseGrpc.Result executeQuery(ClickhouseGrpc.QueryInfo request) {
      return blockingUnaryCall(
          getChannel(), getExecuteQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ClickhouseGrpc.Result> executeQueryWithStreamOutput(
        ClickhouseGrpc.QueryInfo request) {
      return blockingServerStreamingCall(
          getChannel(), getExecuteQueryWithStreamOutputMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClickHouseFutureStub extends io.grpc.stub.AbstractStub<ClickHouseFutureStub> {
    private ClickHouseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClickHouseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ClickHouseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ClickhouseGrpc.Result> executeQuery(
        ClickhouseGrpc.QueryInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteQueryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_QUERY = 0;
  private static final int METHODID_EXECUTE_QUERY_WITH_STREAM_OUTPUT = 1;
  private static final int METHODID_EXECUTE_QUERY_WITH_STREAM_INPUT = 2;
  private static final int METHODID_EXECUTE_QUERY_WITH_STREAM_IO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClickHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClickHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_QUERY:
          serviceImpl.executeQuery((ClickhouseGrpc.QueryInfo) request,
              (io.grpc.stub.StreamObserver<ClickhouseGrpc.Result>) responseObserver);
          break;
        case METHODID_EXECUTE_QUERY_WITH_STREAM_OUTPUT:
          serviceImpl.executeQueryWithStreamOutput((ClickhouseGrpc.QueryInfo) request,
              (io.grpc.stub.StreamObserver<ClickhouseGrpc.Result>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_QUERY_WITH_STREAM_INPUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeQueryWithStreamInput(
              (io.grpc.stub.StreamObserver<ClickhouseGrpc.Result>) responseObserver);
        case METHODID_EXECUTE_QUERY_WITH_STREAM_IO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeQueryWithStreamIO(
              (io.grpc.stub.StreamObserver<ClickhouseGrpc.Result>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClickHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClickHouseBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ClickhouseGrpc.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClickHouse");
    }
  }

  private static final class ClickHouseFileDescriptorSupplier
      extends ClickHouseBaseDescriptorSupplier {
    ClickHouseFileDescriptorSupplier() {}
  }

  private static final class ClickHouseMethodDescriptorSupplier
      extends ClickHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClickHouseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClickHouseGrpcService.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClickHouseFileDescriptorSupplier())
              .addMethod(getExecuteQueryMethod())
              .addMethod(getExecuteQueryWithStreamInputMethod())
              .addMethod(getExecuteQueryWithStreamOutputMethod())
              .addMethod(getExecuteQueryWithStreamIOMethod())
              .build();
        }
      }
    }
    return result;
  }
}

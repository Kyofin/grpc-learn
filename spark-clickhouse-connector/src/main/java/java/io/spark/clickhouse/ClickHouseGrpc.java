package java.io.spark.clickhouse;

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
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: clickhouse_grpc.proto")
public final class ClickHouseGrpc {

  private ClickHouseGrpc() {}

  public static final String SERVICE_NAME = "clickhouse.grpc.ClickHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQuery",
      requestType = clickhouse.grpc.ClickhouseGrpc.QueryInfo.class,
      responseType = clickhouse.grpc.ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryMethod() {
    io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryMethod;
    if ((getExecuteQueryMethod = ClickHouseGrpc.getExecuteQueryMethod) == null) {
      synchronized (ClickHouseGrpc.class) {
        if ((getExecuteQueryMethod = ClickHouseGrpc.getExecuteQueryMethod) == null) {
          ClickHouseGrpc.getExecuteQueryMethod = getExecuteQueryMethod =
              io.grpc.MethodDescriptor.<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQuery"))
                  .build();
          }
        }
     }
     return getExecuteQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamInput",
      requestType = clickhouse.grpc.ClickhouseGrpc.QueryInfo.class,
      responseType = clickhouse.grpc.ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod() {
    io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamInputMethod;
    if ((getExecuteQueryWithStreamInputMethod = ClickHouseGrpc.getExecuteQueryWithStreamInputMethod) == null) {
      synchronized (ClickHouseGrpc.class) {
        if ((getExecuteQueryWithStreamInputMethod = ClickHouseGrpc.getExecuteQueryWithStreamInputMethod) == null) {
          ClickHouseGrpc.getExecuteQueryWithStreamInputMethod = getExecuteQueryWithStreamInputMethod =
              io.grpc.MethodDescriptor.<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQueryWithStreamInput"))
                  .build();
          }
        }
     }
     return getExecuteQueryWithStreamInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamOutput",
      requestType = clickhouse.grpc.ClickhouseGrpc.QueryInfo.class,
      responseType = clickhouse.grpc.ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod() {
    io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamOutputMethod;
    if ((getExecuteQueryWithStreamOutputMethod = ClickHouseGrpc.getExecuteQueryWithStreamOutputMethod) == null) {
      synchronized (ClickHouseGrpc.class) {
        if ((getExecuteQueryWithStreamOutputMethod = ClickHouseGrpc.getExecuteQueryWithStreamOutputMethod) == null) {
          ClickHouseGrpc.getExecuteQueryWithStreamOutputMethod = getExecuteQueryWithStreamOutputMethod =
              io.grpc.MethodDescriptor.<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamOutput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new ClickHouseMethodDescriptorSupplier("ExecuteQueryWithStreamOutput"))
                  .build();
          }
        }
     }
     return getExecuteQueryWithStreamOutputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteQueryWithStreamIO",
      requestType = clickhouse.grpc.ClickhouseGrpc.QueryInfo.class,
      responseType = clickhouse.grpc.ClickhouseGrpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo,
      clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod() {
    io.grpc.MethodDescriptor<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result> getExecuteQueryWithStreamIOMethod;
    if ((getExecuteQueryWithStreamIOMethod = ClickHouseGrpc.getExecuteQueryWithStreamIOMethod) == null) {
      synchronized (ClickHouseGrpc.class) {
        if ((getExecuteQueryWithStreamIOMethod = ClickHouseGrpc.getExecuteQueryWithStreamIOMethod) == null) {
          ClickHouseGrpc.getExecuteQueryWithStreamIOMethod = getExecuteQueryWithStreamIOMethod =
              io.grpc.MethodDescriptor.<clickhouse.grpc.ClickhouseGrpc.QueryInfo, clickhouse.grpc.ClickhouseGrpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "clickhouse.grpc.ClickHouse", "ExecuteQueryWithStreamIO"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.QueryInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  clickhouse.grpc.ClickhouseGrpc.Result.getDefaultInstance()))
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
    public void executeQuery(clickhouse.grpc.ClickhouseGrpc.QueryInfo request,
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteQueryMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.QueryInfo> executeQueryWithStreamInput(
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteQueryWithStreamInputMethod(), responseObserver);
    }

    /**
     */
    public void executeQueryWithStreamOutput(clickhouse.grpc.ClickhouseGrpc.QueryInfo request,
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteQueryWithStreamOutputMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.QueryInfo> executeQueryWithStreamIO(
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteQueryWithStreamIOMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                clickhouse.grpc.ClickhouseGrpc.QueryInfo,
                clickhouse.grpc.ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY)))
          .addMethod(
            getExecuteQueryWithStreamInputMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                clickhouse.grpc.ClickhouseGrpc.QueryInfo,
                clickhouse.grpc.ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY_WITH_STREAM_INPUT)))
          .addMethod(
            getExecuteQueryWithStreamOutputMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                clickhouse.grpc.ClickhouseGrpc.QueryInfo,
                clickhouse.grpc.ClickhouseGrpc.Result>(
                  this, METHODID_EXECUTE_QUERY_WITH_STREAM_OUTPUT)))
          .addMethod(
            getExecuteQueryWithStreamIOMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                clickhouse.grpc.ClickhouseGrpc.QueryInfo,
                clickhouse.grpc.ClickhouseGrpc.Result>(
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

    @java.lang.Override
    protected ClickHouseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseStub(channel, callOptions);
    }

    /**
     */
    public void executeQuery(clickhouse.grpc.ClickhouseGrpc.QueryInfo request,
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.QueryInfo> executeQueryWithStreamInput(
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getExecuteQueryWithStreamInputMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void executeQueryWithStreamOutput(clickhouse.grpc.ClickhouseGrpc.QueryInfo request,
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getExecuteQueryWithStreamOutputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.QueryInfo> executeQueryWithStreamIO(
        io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result> responseObserver) {
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

    @java.lang.Override
    protected ClickHouseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public clickhouse.grpc.ClickhouseGrpc.Result executeQuery(clickhouse.grpc.ClickhouseGrpc.QueryInfo request) {
      return blockingUnaryCall(
          getChannel(), getExecuteQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<clickhouse.grpc.ClickhouseGrpc.Result> executeQueryWithStreamOutput(
        clickhouse.grpc.ClickhouseGrpc.QueryInfo request) {
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

    @java.lang.Override
    protected ClickHouseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClickHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<clickhouse.grpc.ClickhouseGrpc.Result> executeQuery(
        clickhouse.grpc.ClickhouseGrpc.QueryInfo request) {
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_QUERY:
          serviceImpl.executeQuery((clickhouse.grpc.ClickhouseGrpc.QueryInfo) request,
              (io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result>) responseObserver);
          break;
        case METHODID_EXECUTE_QUERY_WITH_STREAM_OUTPUT:
          serviceImpl.executeQueryWithStreamOutput((clickhouse.grpc.ClickhouseGrpc.QueryInfo) request,
              (io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result>) responseObserver);
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
        case METHODID_EXECUTE_QUERY_WITH_STREAM_INPUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeQueryWithStreamInput(
              (io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result>) responseObserver);
        case METHODID_EXECUTE_QUERY_WITH_STREAM_IO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeQueryWithStreamIO(
              (io.grpc.stub.StreamObserver<clickhouse.grpc.ClickhouseGrpc.Result>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClickHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClickHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return clickhouse.grpc.ClickhouseGrpc.getDescriptor();
    }

    @java.lang.Override
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

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClickHouseGrpc.class) {
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

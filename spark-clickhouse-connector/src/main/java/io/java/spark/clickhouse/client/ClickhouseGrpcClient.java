/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.java.spark.clickhouse.client;

import io.java.spark.clickhouse.code.ClickhouseGrpc;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import io.java.spark.clickhouse.service.ClickHouseGrpcService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClickhouseGrpcClient {
  private static final Logger logger = Logger.getLogger(ClickhouseGrpcClient.class.getName());

  private final ClickHouseGrpcService.ClickHouseBlockingStub blockingStub;

  /** Construct client for accessing  server using the existing channel. */
  public ClickhouseGrpcClient(Channel channel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
    blockingStub = ClickHouseGrpcService.newBlockingStub(channel);
  }

  public ClickhouseGrpc.Result execute(String body) {
    logger.info("Will try to greet " + body + " ...");
    try {
    final ClickhouseGrpc.QueryInfo queryInfo = ClickhouseGrpc.QueryInfo.newBuilder().setQuery(body).build();
      return blockingStub.executeQuery(queryInfo);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    }
    return null;
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting. The second argument is the target server.
   */
  public static void main(String[] args) throws Exception {
    String createTbSql = "CREATE TABLE grpc_example_table (id UInt32, text String) ENGINE = MergeTree() ORDER BY id;";
    String insertTbSql = "INSERT INTO grpc_example_table values(0,'Input data for'),(1,'gRPC protocol example');";
    String selectSql = "SELECT * FROM grpc_example_table;";
    // Access a service running on the local machine on port 50051
    String target = "localhost:9100";


    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
    // and reusable. It is common to create channels at the beginning of your application and reuse
    // them until the application shuts down.
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build();
    try {
      ClickhouseGrpcClient client = new ClickhouseGrpcClient(channel);
      client.execute(createTbSql);
      client.execute(insertTbSql);
      final ClickhouseGrpc.Result result = client.execute(selectSql);
      System.out.println(result.getOutput().toStringUtf8());
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
      // resources the channel should be shut down when it will no longer be used. If it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}

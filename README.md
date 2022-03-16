# 生成grpc文件
点击idea中的maven插件命令，可以根据proto文件里的文件生成java文件。
![](http://image-picgo.test.upcdn.net/img/20220316144520.png)
也可以用命令`mvn  protobuf:compile`生成。
生成后的文件如下：
![](http://image-picgo.test.upcdn.net/img/20220316142133.png)

# 使用grpc读写ck
## ck开启grpc设置
修改config.xml文件
```xml
 <!-- gRPC protocol (see src/Server/grpc_protos/clickhouse_grpc.proto for the API) -->
    <grpc_port>9100</grpc_port>
    <grpc>
        <enable_ssl>false</enable_ssl>

        <!-- The following two files are used only if enable_ssl=1 -->
        <ssl_cert_file>/path/to/ssl_cert_file</ssl_cert_file>
        <ssl_key_file>/path/to/ssl_key_file</ssl_key_file>

        <!-- Whether server will request client for a certificate -->
        <ssl_require_client_auth>false</ssl_require_client_auth>

        <!-- The following file is used only if ssl_require_client_auth=1 -->
        <ssl_ca_cert_file>/path/to/ssl_ca_cert_file</ssl_ca_cert_file>

        <!-- Default compression algorithm (applied if client doesn't specify another algorithm, see result_compression in QueryInfo).
             Supported algorithms: none, deflate, gzip, stream_gzip -->
        <compression>deflate</compression>

        <!-- Default compression level (applied if client doesn't specify another level, see result_compression in QueryInfo).
             Supported levels: none, low, medium, high -->
        <compression_level>medium</compression_level>

        <!-- Send/receive message size limits in bytes. -1 means unlimited -->
        <max_send_message_size>-1</max_send_message_size>
        <max_receive_message_size>-1</max_receive_message_size>

        <!-- Enable if you want very detailed logs -->
        <verbose_logs>false</verbose_logs>
    </grpc>
```
## 用ck proto生成客户端需要方法

## 实现客户端

## 实现读写ck

package com.example.files;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: file-metadata.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileUploadServiceGrpc {

  private FileUploadServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.files.FileUploadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.files.FileMetaDataRequest,
      com.example.files.FileMetaDataResponse> getGetFileMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileMetadata",
      requestType = com.example.files.FileMetaDataRequest.class,
      responseType = com.example.files.FileMetaDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.FileMetaDataRequest,
      com.example.files.FileMetaDataResponse> getGetFileMetadataMethod() {
    io.grpc.MethodDescriptor<com.example.files.FileMetaDataRequest, com.example.files.FileMetaDataResponse> getGetFileMetadataMethod;
    if ((getGetFileMetadataMethod = FileUploadServiceGrpc.getGetFileMetadataMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getGetFileMetadataMethod = FileUploadServiceGrpc.getGetFileMetadataMethod) == null) {
          FileUploadServiceGrpc.getGetFileMetadataMethod = getGetFileMetadataMethod =
              io.grpc.MethodDescriptor.<com.example.files.FileMetaDataRequest, com.example.files.FileMetaDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFileMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.FileMetaDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.FileMetaDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("GetFileMetadata"))
              .build();
        }
      }
    }
    return getGetFileMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.UploadFileRequest,
      com.example.files.UploadFileResponse> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = com.example.files.UploadFileRequest.class,
      responseType = com.example.files.UploadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.UploadFileRequest,
      com.example.files.UploadFileResponse> getUploadFileMethod() {
    io.grpc.MethodDescriptor<com.example.files.UploadFileRequest, com.example.files.UploadFileResponse> getUploadFileMethod;
    if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getUploadFileMethod = FileUploadServiceGrpc.getUploadFileMethod) == null) {
          FileUploadServiceGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<com.example.files.UploadFileRequest, com.example.files.UploadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.UploadFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("UploadFile"))
              .build();
        }
      }
    }
    return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.DownloadFileRequest,
      com.example.files.DownloadFileResponse> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFile",
      requestType = com.example.files.DownloadFileRequest.class,
      responseType = com.example.files.DownloadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.DownloadFileRequest,
      com.example.files.DownloadFileResponse> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.example.files.DownloadFileRequest, com.example.files.DownloadFileResponse> getDownloadFileMethod;
    if ((getDownloadFileMethod = FileUploadServiceGrpc.getDownloadFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getDownloadFileMethod = FileUploadServiceGrpc.getDownloadFileMethod) == null) {
          FileUploadServiceGrpc.getDownloadFileMethod = getDownloadFileMethod =
              io.grpc.MethodDescriptor.<com.example.files.DownloadFileRequest, com.example.files.DownloadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.DownloadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.DownloadFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("DownloadFile"))
              .build();
        }
      }
    }
    return getDownloadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.DeleteFileRequest,
      com.example.files.DeleteFileResponse> getDeleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFile",
      requestType = com.example.files.DeleteFileRequest.class,
      responseType = com.example.files.DeleteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.DeleteFileRequest,
      com.example.files.DeleteFileResponse> getDeleteFileMethod() {
    io.grpc.MethodDescriptor<com.example.files.DeleteFileRequest, com.example.files.DeleteFileResponse> getDeleteFileMethod;
    if ((getDeleteFileMethod = FileUploadServiceGrpc.getDeleteFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getDeleteFileMethod = FileUploadServiceGrpc.getDeleteFileMethod) == null) {
          FileUploadServiceGrpc.getDeleteFileMethod = getDeleteFileMethod =
              io.grpc.MethodDescriptor.<com.example.files.DeleteFileRequest, com.example.files.DeleteFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.DeleteFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.DeleteFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("DeleteFile"))
              .build();
        }
      }
    }
    return getDeleteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.RenameFileRequest,
      com.example.files.RenameFileResponse> getRenameFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameFile",
      requestType = com.example.files.RenameFileRequest.class,
      responseType = com.example.files.RenameFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.RenameFileRequest,
      com.example.files.RenameFileResponse> getRenameFileMethod() {
    io.grpc.MethodDescriptor<com.example.files.RenameFileRequest, com.example.files.RenameFileResponse> getRenameFileMethod;
    if ((getRenameFileMethod = FileUploadServiceGrpc.getRenameFileMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getRenameFileMethod = FileUploadServiceGrpc.getRenameFileMethod) == null) {
          FileUploadServiceGrpc.getRenameFileMethod = getRenameFileMethod =
              io.grpc.MethodDescriptor.<com.example.files.RenameFileRequest, com.example.files.RenameFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.RenameFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.RenameFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("RenameFile"))
              .build();
        }
      }
    }
    return getRenameFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.AddInputRequest,
      com.example.files.AddInputRespose> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = com.example.files.AddInputRequest.class,
      responseType = com.example.files.AddInputRespose.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.AddInputRequest,
      com.example.files.AddInputRespose> getAddMethod() {
    io.grpc.MethodDescriptor<com.example.files.AddInputRequest, com.example.files.AddInputRespose> getAddMethod;
    if ((getAddMethod = FileUploadServiceGrpc.getAddMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getAddMethod = FileUploadServiceGrpc.getAddMethod) == null) {
          FileUploadServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.example.files.AddInputRequest, com.example.files.AddInputRespose>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.AddInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.AddInputRespose.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.files.SortInputRequest,
      com.example.files.SortInputResponse> getSortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sort",
      requestType = com.example.files.SortInputRequest.class,
      responseType = com.example.files.SortInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.files.SortInputRequest,
      com.example.files.SortInputResponse> getSortMethod() {
    io.grpc.MethodDescriptor<com.example.files.SortInputRequest, com.example.files.SortInputResponse> getSortMethod;
    if ((getSortMethod = FileUploadServiceGrpc.getSortMethod) == null) {
      synchronized (FileUploadServiceGrpc.class) {
        if ((getSortMethod = FileUploadServiceGrpc.getSortMethod) == null) {
          FileUploadServiceGrpc.getSortMethod = getSortMethod =
              io.grpc.MethodDescriptor.<com.example.files.SortInputRequest, com.example.files.SortInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.SortInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.files.SortInputResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FileUploadServiceMethodDescriptorSupplier("Sort"))
              .build();
        }
      }
    }
    return getSortMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileUploadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceStub>() {
        @java.lang.Override
        public FileUploadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceStub(channel, callOptions);
        }
      };
    return FileUploadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileUploadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceBlockingStub>() {
        @java.lang.Override
        public FileUploadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceBlockingStub(channel, callOptions);
        }
      };
    return FileUploadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileUploadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileUploadServiceFutureStub>() {
        @java.lang.Override
        public FileUploadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileUploadServiceFutureStub(channel, callOptions);
        }
      };
    return FileUploadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FileUploadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple  RPC.
     * returns Product for a given id
     * </pre>
     */
    public void getFileMetadata(com.example.files.FileMetaDataRequest request,
        io.grpc.stub.StreamObserver<com.example.files.FileMetaDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFileMetadataMethod(), responseObserver);
    }

    /**
     */
    public void uploadFile(com.example.files.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.UploadFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadFileMethod(), responseObserver);
    }

    /**
     */
    public void downloadFile(com.example.files.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.DownloadFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    /**
     */
    public void deleteFile(com.example.files.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileMethod(), responseObserver);
    }

    /**
     */
    public void renameFile(com.example.files.RenameFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.RenameFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameFileMethod(), responseObserver);
    }

    /**
     */
    public void add(com.example.files.AddInputRequest request,
        io.grpc.stub.StreamObserver<com.example.files.AddInputRespose> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void sort(com.example.files.SortInputRequest request,
        io.grpc.stub.StreamObserver<com.example.files.SortInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSortMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFileMetadataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.FileMetaDataRequest,
                com.example.files.FileMetaDataResponse>(
                  this, METHODID_GET_FILE_METADATA)))
          .addMethod(
            getUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.UploadFileRequest,
                com.example.files.UploadFileResponse>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getDownloadFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.DownloadFileRequest,
                com.example.files.DownloadFileResponse>(
                  this, METHODID_DOWNLOAD_FILE)))
          .addMethod(
            getDeleteFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.DeleteFileRequest,
                com.example.files.DeleteFileResponse>(
                  this, METHODID_DELETE_FILE)))
          .addMethod(
            getRenameFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.RenameFileRequest,
                com.example.files.RenameFileResponse>(
                  this, METHODID_RENAME_FILE)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.AddInputRequest,
                com.example.files.AddInputRespose>(
                  this, METHODID_ADD)))
          .addMethod(
            getSortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.files.SortInputRequest,
                com.example.files.SortInputResponse>(
                  this, METHODID_SORT)))
          .build();
    }
  }

  /**
   */
  public static final class FileUploadServiceStub extends io.grpc.stub.AbstractAsyncStub<FileUploadServiceStub> {
    private FileUploadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple  RPC.
     * returns Product for a given id
     * </pre>
     */
    public void getFileMetadata(com.example.files.FileMetaDataRequest request,
        io.grpc.stub.StreamObserver<com.example.files.FileMetaDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFileMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadFile(com.example.files.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.UploadFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadFile(com.example.files.DownloadFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.DownloadFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFile(com.example.files.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameFile(com.example.files.RenameFileRequest request,
        io.grpc.stub.StreamObserver<com.example.files.RenameFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(com.example.files.AddInputRequest request,
        io.grpc.stub.StreamObserver<com.example.files.AddInputRespose> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sort(com.example.files.SortInputRequest request,
        io.grpc.stub.StreamObserver<com.example.files.SortInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSortMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileUploadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileUploadServiceBlockingStub> {
    private FileUploadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple  RPC.
     * returns Product for a given id
     * </pre>
     */
    public com.example.files.FileMetaDataResponse getFileMetadata(com.example.files.FileMetaDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFileMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.UploadFileResponse uploadFile(com.example.files.UploadFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.DownloadFileResponse downloadFile(com.example.files.DownloadFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.DeleteFileResponse deleteFile(com.example.files.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.RenameFileResponse renameFile(com.example.files.RenameFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.AddInputRespose add(com.example.files.AddInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.files.SortInputResponse sort(com.example.files.SortInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSortMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileUploadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FileUploadServiceFutureStub> {
    private FileUploadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileUploadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileUploadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple  RPC.
     * returns Product for a given id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.FileMetaDataResponse> getFileMetadata(
        com.example.files.FileMetaDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFileMetadataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.UploadFileResponse> uploadFile(
        com.example.files.UploadFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.DownloadFileResponse> downloadFile(
        com.example.files.DownloadFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.DeleteFileResponse> deleteFile(
        com.example.files.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.RenameFileResponse> renameFile(
        com.example.files.RenameFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.AddInputRespose> add(
        com.example.files.AddInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.files.SortInputResponse> sort(
        com.example.files.SortInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSortMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FILE_METADATA = 0;
  private static final int METHODID_UPLOAD_FILE = 1;
  private static final int METHODID_DOWNLOAD_FILE = 2;
  private static final int METHODID_DELETE_FILE = 3;
  private static final int METHODID_RENAME_FILE = 4;
  private static final int METHODID_ADD = 5;
  private static final int METHODID_SORT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileUploadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileUploadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FILE_METADATA:
          serviceImpl.getFileMetadata((com.example.files.FileMetaDataRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.FileMetaDataResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FILE:
          serviceImpl.uploadFile((com.example.files.UploadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.UploadFileResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.example.files.DownloadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.DownloadFileResponse>) responseObserver);
          break;
        case METHODID_DELETE_FILE:
          serviceImpl.deleteFile((com.example.files.DeleteFileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.DeleteFileResponse>) responseObserver);
          break;
        case METHODID_RENAME_FILE:
          serviceImpl.renameFile((com.example.files.RenameFileRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.RenameFileResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((com.example.files.AddInputRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.AddInputRespose>) responseObserver);
          break;
        case METHODID_SORT:
          serviceImpl.sort((com.example.files.SortInputRequest) request,
              (io.grpc.stub.StreamObserver<com.example.files.SortInputResponse>) responseObserver);
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

  private static abstract class FileUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileUploadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.files.FileMetadata.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileUploadService");
    }
  }

  private static final class FileUploadServiceFileDescriptorSupplier
      extends FileUploadServiceBaseDescriptorSupplier {
    FileUploadServiceFileDescriptorSupplier() {}
  }

  private static final class FileUploadServiceMethodDescriptorSupplier
      extends FileUploadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileUploadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileUploadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileUploadServiceFileDescriptorSupplier())
              .addMethod(getGetFileMetadataMethod())
              .addMethod(getUploadFileMethod())
              .addMethod(getDownloadFileMethod())
              .addMethod(getDeleteFileMethod())
              .addMethod(getRenameFileMethod())
              .addMethod(getAddMethod())
              .addMethod(getSortMethod())
              .build();
        }
      }
    }
    return result;
  }
}

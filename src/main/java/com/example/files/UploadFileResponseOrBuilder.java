// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file-metadata.proto

package com.example.files;

public interface UploadFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.files.UploadFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string file_name = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string directory = 2;</code>
   * @return The directory.
   */
  java.lang.String getDirectory();
  /**
   * <code>string directory = 2;</code>
   * @return The bytes for directory.
   */
  com.google.protobuf.ByteString
      getDirectoryBytes();

  /**
   * <code>bool upload_result = 3;</code>
   * @return The uploadResult.
   */
  boolean getUploadResult();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file-metadata.proto

package com.example.files;

public final class FileMetadata {
  private FileMetadata() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_FileMetaDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_FileMetaDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_FileMetaDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_FileMetaDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_UploadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_UploadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_UploadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_UploadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_DownloadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_DownloadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_DownloadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_DownloadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_DeleteFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_DeleteFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_DeleteFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_DeleteFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_RenameFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_RenameFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_RenameFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_RenameFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_AddInputRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_AddInputRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_AddInputRespose_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_AddInputRespose_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_SortInputRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_SortInputRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_files_SortInputResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_files_SortInputResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023file-metadata.proto\022\021com.example.files" +
      "\032\037google/protobuf/timestamp.proto\";\n\023Fil" +
      "eMetaDataRequest\022\021\n\tfile_name\030\001 \001(\t\022\021\n\td" +
      "irectory\030\002 \001(\t\"j\n\024FileMetaDataResponse\022\014" +
      "\n\004name\030\001 \001(\t\022\022\n\nfilelength\030\002 \001(\001\0220\n\014date" +
      "Modified\030\003 \001(\0132\032.google.protobuf.Timesta" +
      "mp\"J\n\021UploadFileRequest\022\021\n\tfile_name\030\001 \001" +
      "(\t\022\021\n\tdirectory\030\002 \001(\t\022\017\n\007payload\030\003 \001(\014\"Q" +
      "\n\022UploadFileResponse\022\021\n\tfile_name\030\001 \001(\t\022" +
      "\021\n\tdirectory\030\002 \001(\t\022\025\n\rupload_result\030\003 \001(" +
      "\010\";\n\023DownloadFileRequest\022\021\n\tfile_name\030\001 " +
      "\001(\t\022\021\n\tdirectory\030\002 \001(\t\":\n\024DownloadFileRe" +
      "sponse\022\021\n\tfile_name\030\001 \001(\t\022\017\n\007content\030\002 \001" +
      "(\014\"9\n\021DeleteFileRequest\022\021\n\tfile_name\030\001 \001" +
      "(\t\022\021\n\tdirectory\030\002 \001(\t\"Q\n\022DeleteFileRespo" +
      "nse\022\021\n\tfile_name\030\001 \001(\t\022\021\n\tdirectory\030\002 \001(" +
      "\t\022\025\n\rdelete_result\030\003 \001(\010\"T\n\021RenameFileRe" +
      "quest\022\026\n\016from_file_name\030\001 \001(\t\022\021\n\tdirecto" +
      "ry\030\002 \001(\t\022\024\n\014to_file_name\030\003 \001(\t\"l\n\022Rename" +
      "FileResponse\022\026\n\016from_file_name\030\001 \001(\t\022\021\n\t" +
      "directory\030\002 \001(\t\022\024\n\014to_file_name\030\003 \001(\t\022\025\n" +
      "\rrename_result\030\004 \001(\010\"\'\n\017AddInputRequest\022" +
      "\t\n\001i\030\001 \001(\003\022\t\n\001j\030\002 \001(\003\"!\n\017AddInputRespose" +
      "\022\016\n\006result\030\001 \001(\003\"!\n\020SortInputRequest\022\r\n\005" +
      "input\030\001 \003(\005\"#\n\021SortInputResponse\022\016\n\006outp" +
      "ut\030\001 \003(\0052\213\005\n\021FileUploadService\022b\n\017GetFil" +
      "eMetadata\022&.com.example.files.FileMetaDa" +
      "taRequest\032\'.com.example.files.FileMetaDa" +
      "taResponse\022Y\n\nUploadFile\022$.com.example.f" +
      "iles.UploadFileRequest\032%.com.example.fil" +
      "es.UploadFileResponse\022_\n\014DownloadFile\022&." +
      "com.example.files.DownloadFileRequest\032\'." +
      "com.example.files.DownloadFileResponse\022Y" +
      "\n\nDeleteFile\022$.com.example.files.DeleteF" +
      "ileRequest\032%.com.example.files.DeleteFil" +
      "eResponse\022Y\n\nRenameFile\022$.com.example.fi" +
      "les.RenameFileRequest\032%.com.example.file" +
      "s.RenameFileResponse\022M\n\003add\022\".com.exampl" +
      "e.files.AddInputRequest\032\".com.example.fi" +
      "les.AddInputRespose\022Q\n\004Sort\022#.com.exampl" +
      "e.files.SortInputRequest\032$.com.example.f" +
      "iles.SortInputResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_example_files_FileMetaDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_files_FileMetaDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_FileMetaDataRequest_descriptor,
        new java.lang.String[] { "FileName", "Directory", });
    internal_static_com_example_files_FileMetaDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_files_FileMetaDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_FileMetaDataResponse_descriptor,
        new java.lang.String[] { "Name", "Filelength", "DateModified", });
    internal_static_com_example_files_UploadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_files_UploadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_UploadFileRequest_descriptor,
        new java.lang.String[] { "FileName", "Directory", "Payload", });
    internal_static_com_example_files_UploadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_files_UploadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_UploadFileResponse_descriptor,
        new java.lang.String[] { "FileName", "Directory", "UploadResult", });
    internal_static_com_example_files_DownloadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_files_DownloadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_DownloadFileRequest_descriptor,
        new java.lang.String[] { "FileName", "Directory", });
    internal_static_com_example_files_DownloadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_files_DownloadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_DownloadFileResponse_descriptor,
        new java.lang.String[] { "FileName", "Content", });
    internal_static_com_example_files_DeleteFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_files_DeleteFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_DeleteFileRequest_descriptor,
        new java.lang.String[] { "FileName", "Directory", });
    internal_static_com_example_files_DeleteFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_example_files_DeleteFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_DeleteFileResponse_descriptor,
        new java.lang.String[] { "FileName", "Directory", "DeleteResult", });
    internal_static_com_example_files_RenameFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_example_files_RenameFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_RenameFileRequest_descriptor,
        new java.lang.String[] { "FromFileName", "Directory", "ToFileName", });
    internal_static_com_example_files_RenameFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_example_files_RenameFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_RenameFileResponse_descriptor,
        new java.lang.String[] { "FromFileName", "Directory", "ToFileName", "RenameResult", });
    internal_static_com_example_files_AddInputRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_example_files_AddInputRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_AddInputRequest_descriptor,
        new java.lang.String[] { "I", "J", });
    internal_static_com_example_files_AddInputRespose_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_example_files_AddInputRespose_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_AddInputRespose_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_com_example_files_SortInputRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_example_files_SortInputRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_SortInputRequest_descriptor,
        new java.lang.String[] { "Input", });
    internal_static_com_example_files_SortInputResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_example_files_SortInputResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_files_SortInputResponse_descriptor,
        new java.lang.String[] { "Output", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
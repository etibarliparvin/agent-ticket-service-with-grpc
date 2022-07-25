// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/ticket.proto

package com.example.models;

public final class Ticket {
  private Ticket() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketFindByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketFindByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketProtoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketProtoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketResponses_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketResponses_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021grpc/ticket.proto\032\033google/protobuf/emp" +
      "ty.proto\"H\n\023TicketCreateRequest\022\014\n\004code\030" +
      "\001 \001(\t\022\016\n\006status\030\002 \001(\003\022\023\n\013issuerAgent\030\003 \001" +
      "(\003\"T\n\023TicketUpdateRequest\022\n\n\002id\030\001 \001(\003\022\014\n" +
      "\004code\030\002 \001(\t\022\016\n\006status\030\003 \001(\003\022\023\n\013issuerAge" +
      "nt\030\004 \001(\003\"#\n\025TicketFindByIdRequest\022\n\n\002id\030" +
      "\001 \001(\003\"j\n\023TicketProtoResponse\022\n\n\002id\030\001 \001(\003" +
      "\022\014\n\004code\030\002 \001(\t\022\016\n\006status\030\003 \001(\003\022\023\n\013issuer" +
      "Agent\030\004 \001(\003\022\024\n\014creationTime\030\005 \001(\003\"5\n\017Tic" +
      "ketResponses\022\"\n\004data\030\001 \003(\0132\024.TicketProto" +
      "Response2\365\001\n\022TicketProtoService\022:\n\014creat" +
      "eTicket\022\024.TicketCreateRequest\032\024.TicketPr" +
      "otoResponse\0228\n\010findById\022\026.TicketFindById" +
      "Request\032\024.TicketProtoResponse\0223\n\007findAll" +
      "\022\026.google.protobuf.Empty\032\020.TicketRespons" +
      "es\0224\n\006update\022\024.TicketUpdateRequest\032\024.Tic" +
      "ketProtoResponseB\026\n\022com.example.modelsP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_TicketCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TicketCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketCreateRequest_descriptor,
        new java.lang.String[] { "Code", "Status", "IssuerAgent", });
    internal_static_TicketUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TicketUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketUpdateRequest_descriptor,
        new java.lang.String[] { "Id", "Code", "Status", "IssuerAgent", });
    internal_static_TicketFindByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TicketFindByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketFindByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_TicketProtoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_TicketProtoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketProtoResponse_descriptor,
        new java.lang.String[] { "Id", "Code", "Status", "IssuerAgent", "CreationTime", });
    internal_static_TicketResponses_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_TicketResponses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketResponses_descriptor,
        new java.lang.String[] { "Data", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

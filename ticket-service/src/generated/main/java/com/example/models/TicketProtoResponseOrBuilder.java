// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/ticket.proto

package com.example.models;

public interface TicketProtoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TicketProtoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string code = 2;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 2;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>int64 status = 3;</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <code>int64 issuerAgent = 4;</code>
   * @return The issuerAgent.
   */
  long getIssuerAgent();

  /**
   * <code>int64 creationTime = 5;</code>
   * @return The creationTime.
   */
  long getCreationTime();
}

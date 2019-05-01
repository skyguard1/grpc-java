// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/instrumentation/v1alpha/monitoring.proto

package io.grpc.instrumentation.v1alpha;

public interface CanonicalRpcStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.instrumentation.v1alpha.CanonicalRpcStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_errors = 1;</code>
   */
  boolean hasRpcClientErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_errors = 1;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_errors = 1;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientErrorsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_completed_rpcs = 2;</code>
   */
  boolean hasRpcClientCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_completed_rpcs = 2;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_completed_rpcs = 2;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientCompletedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_started_rpcs = 3;</code>
   */
  boolean hasRpcClientStartedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_started_rpcs = 3;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientStartedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_started_rpcs = 3;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientStartedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_elapsed_time = 4;</code>
   */
  boolean hasRpcClientElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_elapsed_time = 4;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_elapsed_time = 4;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_server_elapsed_time = 5;</code>
   */
  boolean hasRpcClientServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_server_elapsed_time = 5;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_server_elapsed_time = 5;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientServerElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_bytes = 6;</code>
   */
  boolean hasRpcClientRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_bytes = 6;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_bytes = 6;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientRequestBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_bytes = 7;</code>
   */
  boolean hasRpcClientResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_bytes = 7;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_bytes = 7;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientResponseBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_count = 8;</code>
   */
  boolean hasRpcClientRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_count = 8;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_request_count = 8;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientRequestCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_count = 9;</code>
   */
  boolean hasRpcClientResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_count = 9;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcClientResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_client_response_count = 9;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcClientResponseCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_errors = 10;</code>
   */
  boolean hasRpcServerErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_errors = 10;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerErrors();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_errors = 10;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerErrorsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_completed_rpcs = 11;</code>
   */
  boolean hasRpcServerCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_completed_rpcs = 11;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerCompletedRpcs();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_completed_rpcs = 11;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerCompletedRpcsOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_server_elapsed_time = 12;</code>
   */
  boolean hasRpcServerServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_server_elapsed_time = 12;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerServerElapsedTime();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_server_elapsed_time = 12;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerServerElapsedTimeOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_bytes = 13;</code>
   */
  boolean hasRpcServerRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_bytes = 13;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerRequestBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_bytes = 13;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerRequestBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_bytes = 14;</code>
   */
  boolean hasRpcServerResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_bytes = 14;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerResponseBytes();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_bytes = 14;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerResponseBytesOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_count = 15;</code>
   */
  boolean hasRpcServerRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_count = 15;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerRequestCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_request_count = 15;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerRequestCountOrBuilder();

  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_count = 16;</code>
   */
  boolean hasRpcServerResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_count = 16;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerResponseCount();
  /**
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_response_count = 16;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerResponseCountOrBuilder();

  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_elapsed_time = 17;</code>
   */
  boolean hasRpcServerElapsedTime();
  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_elapsed_time = 17;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.View getRpcServerElapsedTime();
  /**
   * <pre>
   *TODO(ericgribkoff) Add minute-hour interval stats.
   * </pre>
   *
   * <code>.grpc.instrumentation.v1alpha.CanonicalRpcStats.View rpc_server_elapsed_time = 17;</code>
   */
  io.grpc.instrumentation.v1alpha.CanonicalRpcStats.ViewOrBuilder getRpcServerElapsedTimeOrBuilder();
}
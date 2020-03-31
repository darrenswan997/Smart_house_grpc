// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Fan.proto

package com.proto.Fan;

public final class Fan {
  private Fan() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Fan_FanInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Fan_FanInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Fan_GetDeviceByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Fan_GetDeviceByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Fan_GetSpeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Fan_GetSpeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Fan_FanInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Fan_FanInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tFan.proto\022\003Fan\"M\n\007FanInfo\022\021\n\tdevice_id" +
      "\030\001 \001(\005\022\020\n\010location\030\002 \001(\t\022\016\n\006status\030\003 \001(\t" +
      "\022\r\n\005speed\030\004 \001(\005\")\n\024GetDeviceByIdRequest\022" +
      "\021\n\tdevice_id\030\001 \001(\005\"3\n\017GetSpeedRequest\022\021\n" +
      "\tdevice_id\030\001 \001(\005\022\r\n\005speed\030\002 \001(\005\"0\n\017FanIn" +
      "foResponse\022\035\n\007faninfo\030\001 \001(\0132\014.Fan.FanInf" +
      "o2\320\001\n\nFanService\022E\n\020ShowDeviceStatus\022\031.F" +
      "an.GetDeviceByIdRequest\032\024.Fan.FanInfoRes" +
      "ponse\"\000\022:\n\nSetNewTemp\022\024.Fan.GetSpeedRequ" +
      "est\032\024.Fan.FanInfoResponse\"\000\022?\n\nTurnOffFa" +
      "n\022\031.Fan.GetDeviceByIdRequest\032\024.Fan.FanIn" +
      "foResponse\"\000B\021\n\rcom.proto.FanP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Fan_FanInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Fan_FanInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Fan_FanInfo_descriptor,
        new java.lang.String[] { "DeviceId", "Location", "Status", "Speed", });
    internal_static_Fan_GetDeviceByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Fan_GetDeviceByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Fan_GetDeviceByIdRequest_descriptor,
        new java.lang.String[] { "DeviceId", });
    internal_static_Fan_GetSpeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Fan_GetSpeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Fan_GetSpeedRequest_descriptor,
        new java.lang.String[] { "DeviceId", "Speed", });
    internal_static_Fan_FanInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Fan_FanInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Fan_FanInfoResponse_descriptor,
        new java.lang.String[] { "Faninfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

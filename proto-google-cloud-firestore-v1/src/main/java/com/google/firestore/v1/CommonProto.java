/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/common.proto

package com.google.firestore.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_DocumentMask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_Precondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_Precondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_ReadWrite_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1_TransactionOptions_ReadOnly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/firestore/v1/common.proto\022\023goog"
          + "le.firestore.v1\032\037google/protobuf/timesta"
          + "mp.proto\032\034google/api/annotations.proto\"#"
          + "\n\014DocumentMask\022\023\n\013field_paths\030\001 \003(\t\"e\n\014P"
          + "recondition\022\020\n\006exists\030\001 \001(\010H\000\0221\n\013update_"
          + "time\030\002 \001(\0132\032.google.protobuf.TimestampH\000"
          + "B\020\n\016condition_type\"\251\002\n\022TransactionOption"
          + "s\022E\n\tread_only\030\002 \001(\01320.google.firestore."
          + "v1.TransactionOptions.ReadOnlyH\000\022G\n\nread"
          + "_write\030\003 \001(\01321.google.firestore.v1.Trans"
          + "actionOptions.ReadWriteH\000\032&\n\tReadWrite\022\031"
          + "\n\021retry_transaction\030\001 \001(\014\032S\n\010ReadOnly\022/\n"
          + "\tread_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampH\000B\026\n\024consistency_selectorB\006\n\004modeB\304"
          + "\001\n\027com.google.firestore.v1B\013CommonProtoP"
          + "\001Z<google.golang.org/genproto/googleapis"
          + "/firestore/v1;firestore\242\002\004GCFS\252\002\031Google."
          + "Cloud.Firestore.V1\312\002\031Google\\Cloud\\Firest"
          + "ore\\V1\352\002\034Google::Cloud::Firestore::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_firestore_v1_DocumentMask_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1_DocumentMask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_DocumentMask_descriptor,
            new java.lang.String[] {
              "FieldPaths",
            });
    internal_static_google_firestore_v1_Precondition_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1_Precondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_Precondition_descriptor,
            new java.lang.String[] {
              "Exists", "UpdateTime", "ConditionType",
            });
    internal_static_google_firestore_v1_TransactionOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1_TransactionOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_descriptor,
            new java.lang.String[] {
              "ReadOnly", "ReadWrite", "Mode",
            });
    internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor =
        internal_static_google_firestore_v1_TransactionOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_firestore_v1_TransactionOptions_ReadWrite_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_ReadWrite_descriptor,
            new java.lang.String[] {
              "RetryTransaction",
            });
    internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor =
        internal_static_google_firestore_v1_TransactionOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_firestore_v1_TransactionOptions_ReadOnly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1_TransactionOptions_ReadOnly_descriptor,
            new java.lang.String[] {
              "ReadTime", "ConsistencySelector",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

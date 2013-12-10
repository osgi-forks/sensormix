//CHECKSTYLE:OFF
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/sample.proto

package com.google.developers.gdgfirenze.protobuf;

public final class SensormixProtos {
  private SensormixProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SampleMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string device_id = 1;
    /**
     * <code>required string device_id = 1;</code>
     */
    boolean hasDeviceId();
    /**
     * <code>required string device_id = 1;</code>
     */
    java.lang.String getDeviceId();
    /**
     * <code>required string device_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    // required int64 time = 2;
    /**
     * <code>required int64 time = 2;</code>
     */
    boolean hasTime();
    /**
     * <code>required int64 time = 2;</code>
     */
    long getTime();

    // optional int64 faces = 3;
    /**
     * <code>optional int64 faces = 3;</code>
     */
    boolean hasFaces();
    /**
     * <code>optional int64 faces = 3;</code>
     */
    long getFaces();
  }
  /**
   * Protobuf type {@code sensormix.SampleMessage}
   */
  public static final class SampleMessage extends
      com.google.protobuf.GeneratedMessage
      implements SampleMessageOrBuilder {
    // Use SampleMessage.newBuilder() to construct.
    private SampleMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SampleMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SampleMessage defaultInstance;
    public static SampleMessage getDefaultInstance() {
      return defaultInstance;
    }

    public SampleMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SampleMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              deviceId_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              time_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              faces_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.developers.gdgfirenze.protobuf.SensormixProtos.internal_static_sensormix_SampleMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.developers.gdgfirenze.protobuf.SensormixProtos.internal_static_sensormix_SampleMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.class, com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<SampleMessage> PARSER =
        new com.google.protobuf.AbstractParser<SampleMessage>() {
      public SampleMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SampleMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SampleMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string device_id = 1;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private java.lang.Object deviceId_;
    /**
     * <code>required string device_id = 1;</code>
     */
    public boolean hasDeviceId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string device_id = 1;</code>
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string device_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int64 time = 2;
    public static final int TIME_FIELD_NUMBER = 2;
    private long time_;
    /**
     * <code>required int64 time = 2;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 time = 2;</code>
     */
    public long getTime() {
      return time_;
    }

    // optional int64 faces = 3;
    public static final int FACES_FIELD_NUMBER = 3;
    private long faces_;
    /**
     * <code>optional int64 faces = 3;</code>
     */
    public boolean hasFaces() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 faces = 3;</code>
     */
    public long getFaces() {
      return faces_;
    }

    private void initFields() {
      deviceId_ = "";
      time_ = 0L;
      faces_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasDeviceId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDeviceIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, time_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, faces_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDeviceIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, time_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, faces_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code sensormix.SampleMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.developers.gdgfirenze.protobuf.SensormixProtos.internal_static_sensormix_SampleMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.developers.gdgfirenze.protobuf.SensormixProtos.internal_static_sensormix_SampleMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.class, com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.Builder.class);
      }

      // Construct using com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        deviceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        faces_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.developers.gdgfirenze.protobuf.SensormixProtos.internal_static_sensormix_SampleMessage_descriptor;
      }

      public com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage getDefaultInstanceForType() {
        return com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.getDefaultInstance();
      }

      public com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage build() {
        com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage buildPartial() {
        com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage result = new com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.deviceId_ = deviceId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.time_ = time_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.faces_ = faces_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage) {
          return mergeFrom((com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage other) {
        if (other == com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage.getDefaultInstance()) return this;
        if (other.hasDeviceId()) {
          bitField0_ |= 0x00000001;
          deviceId_ = other.deviceId_;
          onChanged();
        }
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        if (other.hasFaces()) {
          setFaces(other.getFaces());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDeviceId()) {
          
          return false;
        }
        if (!hasTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.google.developers.gdgfirenze.protobuf.SensormixProtos.SampleMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string device_id = 1;
      private java.lang.Object deviceId_ = "";
      /**
       * <code>required string device_id = 1;</code>
       */
      public boolean hasDeviceId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string device_id = 1;</code>
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          deviceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string device_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string device_id = 1;</code>
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string device_id = 1;</code>
       */
      public Builder clearDeviceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>required string device_id = 1;</code>
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        deviceId_ = value;
        onChanged();
        return this;
      }

      // required int64 time = 2;
      private long time_ ;
      /**
       * <code>required int64 time = 2;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 time = 2;</code>
       */
      public long getTime() {
        return time_;
      }
      /**
       * <code>required int64 time = 2;</code>
       */
      public Builder setTime(long value) {
        bitField0_ |= 0x00000002;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 time = 2;</code>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        time_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 faces = 3;
      private long faces_ ;
      /**
       * <code>optional int64 faces = 3;</code>
       */
      public boolean hasFaces() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 faces = 3;</code>
       */
      public long getFaces() {
        return faces_;
      }
      /**
       * <code>optional int64 faces = 3;</code>
       */
      public Builder setFaces(long value) {
        bitField0_ |= 0x00000004;
        faces_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 faces = 3;</code>
       */
      public Builder clearFaces() {
        bitField0_ = (bitField0_ & ~0x00000004);
        faces_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:sensormix.SampleMessage)
    }

    static {
      defaultInstance = new SampleMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:sensormix.SampleMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_sensormix_SampleMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_sensormix_SampleMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037src/main/resources/sample.proto\022\tsenso" +
      "rmix\"?\n\rSampleMessage\022\021\n\tdevice_id\030\001 \002(\t" +
      "\022\014\n\004time\030\002 \002(\003\022\r\n\005faces\030\003 \001(\003B<\n)com.goo" +
      "gle.developers.gdgfirenze.protobufB\017Sens" +
      "ormixProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_sensormix_SampleMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_sensormix_SampleMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_sensormix_SampleMessage_descriptor,
              new java.lang.String[] { "DeviceId", "Time", "Faces", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
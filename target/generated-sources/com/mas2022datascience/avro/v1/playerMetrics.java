/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mas2022datascience.avro.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class playerMetrics extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1775301016647658128L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"playerMetrics\",\"namespace\":\"com.mas2022datascience.avro.v1\",\"fields\":[{\"name\":\"x\",\"type\":\"int\"},{\"name\":\"y\",\"type\":\"int\"},{\"name\":\"velocity\",\"type\":\"long\"},{\"name\":\"velocityVector\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"acceleration\",\"type\":\"float\"},{\"name\":\"accelerationVector\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"pressingIndex\",\"type\":\"float\"},{\"name\":\"controlIndex\",\"type\":\"float\"},{\"name\":\"zone\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<playerMetrics> ENCODER =
      new BinaryMessageEncoder<playerMetrics>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<playerMetrics> DECODER =
      new BinaryMessageDecoder<playerMetrics>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<playerMetrics> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<playerMetrics> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<playerMetrics> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<playerMetrics>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this playerMetrics to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a playerMetrics from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a playerMetrics instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static playerMetrics fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int x;
  private int y;
  private long velocity;
  private java.util.List<java.lang.Long> velocityVector;
  private float acceleration;
  private java.util.List<java.lang.Long> accelerationVector;
  private float pressingIndex;
  private float controlIndex;
  private int zone;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public playerMetrics() {}

  /**
   * All-args constructor.
   * @param x The new value for x
   * @param y The new value for y
   * @param velocity The new value for velocity
   * @param velocityVector The new value for velocityVector
   * @param acceleration The new value for acceleration
   * @param accelerationVector The new value for accelerationVector
   * @param pressingIndex The new value for pressingIndex
   * @param controlIndex The new value for controlIndex
   * @param zone The new value for zone
   */
  public playerMetrics(java.lang.Integer x, java.lang.Integer y, java.lang.Long velocity, java.util.List<java.lang.Long> velocityVector, java.lang.Float acceleration, java.util.List<java.lang.Long> accelerationVector, java.lang.Float pressingIndex, java.lang.Float controlIndex, java.lang.Integer zone) {
    this.x = x;
    this.y = y;
    this.velocity = velocity;
    this.velocityVector = velocityVector;
    this.acceleration = acceleration;
    this.accelerationVector = accelerationVector;
    this.pressingIndex = pressingIndex;
    this.controlIndex = controlIndex;
    this.zone = zone;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return x;
    case 1: return y;
    case 2: return velocity;
    case 3: return velocityVector;
    case 4: return acceleration;
    case 5: return accelerationVector;
    case 6: return pressingIndex;
    case 7: return controlIndex;
    case 8: return zone;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: x = (java.lang.Integer)value$; break;
    case 1: y = (java.lang.Integer)value$; break;
    case 2: velocity = (java.lang.Long)value$; break;
    case 3: velocityVector = (java.util.List<java.lang.Long>)value$; break;
    case 4: acceleration = (java.lang.Float)value$; break;
    case 5: accelerationVector = (java.util.List<java.lang.Long>)value$; break;
    case 6: pressingIndex = (java.lang.Float)value$; break;
    case 7: controlIndex = (java.lang.Float)value$; break;
    case 8: zone = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'x' field.
   * @return The value of the 'x' field.
   */
  public int getX() {
    return x;
  }


  /**
   * Sets the value of the 'x' field.
   * @param value the value to set.
   */
  public void setX(int value) {
    this.x = value;
  }

  /**
   * Gets the value of the 'y' field.
   * @return The value of the 'y' field.
   */
  public int getY() {
    return y;
  }


  /**
   * Sets the value of the 'y' field.
   * @param value the value to set.
   */
  public void setY(int value) {
    this.y = value;
  }

  /**
   * Gets the value of the 'velocity' field.
   * @return The value of the 'velocity' field.
   */
  public long getVelocity() {
    return velocity;
  }


  /**
   * Sets the value of the 'velocity' field.
   * @param value the value to set.
   */
  public void setVelocity(long value) {
    this.velocity = value;
  }

  /**
   * Gets the value of the 'velocityVector' field.
   * @return The value of the 'velocityVector' field.
   */
  public java.util.List<java.lang.Long> getVelocityVector() {
    return velocityVector;
  }


  /**
   * Sets the value of the 'velocityVector' field.
   * @param value the value to set.
   */
  public void setVelocityVector(java.util.List<java.lang.Long> value) {
    this.velocityVector = value;
  }

  /**
   * Gets the value of the 'acceleration' field.
   * @return The value of the 'acceleration' field.
   */
  public float getAcceleration() {
    return acceleration;
  }


  /**
   * Sets the value of the 'acceleration' field.
   * @param value the value to set.
   */
  public void setAcceleration(float value) {
    this.acceleration = value;
  }

  /**
   * Gets the value of the 'accelerationVector' field.
   * @return The value of the 'accelerationVector' field.
   */
  public java.util.List<java.lang.Long> getAccelerationVector() {
    return accelerationVector;
  }


  /**
   * Sets the value of the 'accelerationVector' field.
   * @param value the value to set.
   */
  public void setAccelerationVector(java.util.List<java.lang.Long> value) {
    this.accelerationVector = value;
  }

  /**
   * Gets the value of the 'pressingIndex' field.
   * @return The value of the 'pressingIndex' field.
   */
  public float getPressingIndex() {
    return pressingIndex;
  }


  /**
   * Sets the value of the 'pressingIndex' field.
   * @param value the value to set.
   */
  public void setPressingIndex(float value) {
    this.pressingIndex = value;
  }

  /**
   * Gets the value of the 'controlIndex' field.
   * @return The value of the 'controlIndex' field.
   */
  public float getControlIndex() {
    return controlIndex;
  }


  /**
   * Sets the value of the 'controlIndex' field.
   * @param value the value to set.
   */
  public void setControlIndex(float value) {
    this.controlIndex = value;
  }

  /**
   * Gets the value of the 'zone' field.
   * @return The value of the 'zone' field.
   */
  public int getZone() {
    return zone;
  }


  /**
   * Sets the value of the 'zone' field.
   * @param value the value to set.
   */
  public void setZone(int value) {
    this.zone = value;
  }

  /**
   * Creates a new playerMetrics RecordBuilder.
   * @return A new playerMetrics RecordBuilder
   */
  public static com.mas2022datascience.avro.v1.playerMetrics.Builder newBuilder() {
    return new com.mas2022datascience.avro.v1.playerMetrics.Builder();
  }

  /**
   * Creates a new playerMetrics RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new playerMetrics RecordBuilder
   */
  public static com.mas2022datascience.avro.v1.playerMetrics.Builder newBuilder(com.mas2022datascience.avro.v1.playerMetrics.Builder other) {
    if (other == null) {
      return new com.mas2022datascience.avro.v1.playerMetrics.Builder();
    } else {
      return new com.mas2022datascience.avro.v1.playerMetrics.Builder(other);
    }
  }

  /**
   * Creates a new playerMetrics RecordBuilder by copying an existing playerMetrics instance.
   * @param other The existing instance to copy.
   * @return A new playerMetrics RecordBuilder
   */
  public static com.mas2022datascience.avro.v1.playerMetrics.Builder newBuilder(com.mas2022datascience.avro.v1.playerMetrics other) {
    if (other == null) {
      return new com.mas2022datascience.avro.v1.playerMetrics.Builder();
    } else {
      return new com.mas2022datascience.avro.v1.playerMetrics.Builder(other);
    }
  }

  /**
   * RecordBuilder for playerMetrics instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<playerMetrics>
    implements org.apache.avro.data.RecordBuilder<playerMetrics> {

    private int x;
    private int y;
    private long velocity;
    private java.util.List<java.lang.Long> velocityVector;
    private float acceleration;
    private java.util.List<java.lang.Long> accelerationVector;
    private float pressingIndex;
    private float controlIndex;
    private int zone;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mas2022datascience.avro.v1.playerMetrics.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.velocity)) {
        this.velocity = data().deepCopy(fields()[2].schema(), other.velocity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.velocityVector)) {
        this.velocityVector = data().deepCopy(fields()[3].schema(), other.velocityVector);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.acceleration)) {
        this.acceleration = data().deepCopy(fields()[4].schema(), other.acceleration);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.accelerationVector)) {
        this.accelerationVector = data().deepCopy(fields()[5].schema(), other.accelerationVector);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.pressingIndex)) {
        this.pressingIndex = data().deepCopy(fields()[6].schema(), other.pressingIndex);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.controlIndex)) {
        this.controlIndex = data().deepCopy(fields()[7].schema(), other.controlIndex);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.zone)) {
        this.zone = data().deepCopy(fields()[8].schema(), other.zone);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing playerMetrics instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mas2022datascience.avro.v1.playerMetrics other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.velocity)) {
        this.velocity = data().deepCopy(fields()[2].schema(), other.velocity);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.velocityVector)) {
        this.velocityVector = data().deepCopy(fields()[3].schema(), other.velocityVector);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.acceleration)) {
        this.acceleration = data().deepCopy(fields()[4].schema(), other.acceleration);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.accelerationVector)) {
        this.accelerationVector = data().deepCopy(fields()[5].schema(), other.accelerationVector);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.pressingIndex)) {
        this.pressingIndex = data().deepCopy(fields()[6].schema(), other.pressingIndex);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.controlIndex)) {
        this.controlIndex = data().deepCopy(fields()[7].schema(), other.controlIndex);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.zone)) {
        this.zone = data().deepCopy(fields()[8].schema(), other.zone);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'x' field.
      * @return The value.
      */
    public int getX() {
      return x;
    }


    /**
      * Sets the value of the 'x' field.
      * @param value The value of 'x'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setX(int value) {
      validate(fields()[0], value);
      this.x = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'x' field has been set.
      * @return True if the 'x' field has been set, false otherwise.
      */
    public boolean hasX() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'x' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearX() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'y' field.
      * @return The value.
      */
    public int getY() {
      return y;
    }


    /**
      * Sets the value of the 'y' field.
      * @param value The value of 'y'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setY(int value) {
      validate(fields()[1], value);
      this.y = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'y' field has been set.
      * @return True if the 'y' field has been set, false otherwise.
      */
    public boolean hasY() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'y' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearY() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'velocity' field.
      * @return The value.
      */
    public long getVelocity() {
      return velocity;
    }


    /**
      * Sets the value of the 'velocity' field.
      * @param value The value of 'velocity'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setVelocity(long value) {
      validate(fields()[2], value);
      this.velocity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'velocity' field has been set.
      * @return True if the 'velocity' field has been set, false otherwise.
      */
    public boolean hasVelocity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'velocity' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearVelocity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'velocityVector' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getVelocityVector() {
      return velocityVector;
    }


    /**
      * Sets the value of the 'velocityVector' field.
      * @param value The value of 'velocityVector'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setVelocityVector(java.util.List<java.lang.Long> value) {
      validate(fields()[3], value);
      this.velocityVector = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'velocityVector' field has been set.
      * @return True if the 'velocityVector' field has been set, false otherwise.
      */
    public boolean hasVelocityVector() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'velocityVector' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearVelocityVector() {
      velocityVector = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'acceleration' field.
      * @return The value.
      */
    public float getAcceleration() {
      return acceleration;
    }


    /**
      * Sets the value of the 'acceleration' field.
      * @param value The value of 'acceleration'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setAcceleration(float value) {
      validate(fields()[4], value);
      this.acceleration = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'acceleration' field has been set.
      * @return True if the 'acceleration' field has been set, false otherwise.
      */
    public boolean hasAcceleration() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'acceleration' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearAcceleration() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'accelerationVector' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getAccelerationVector() {
      return accelerationVector;
    }


    /**
      * Sets the value of the 'accelerationVector' field.
      * @param value The value of 'accelerationVector'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setAccelerationVector(java.util.List<java.lang.Long> value) {
      validate(fields()[5], value);
      this.accelerationVector = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'accelerationVector' field has been set.
      * @return True if the 'accelerationVector' field has been set, false otherwise.
      */
    public boolean hasAccelerationVector() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'accelerationVector' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearAccelerationVector() {
      accelerationVector = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'pressingIndex' field.
      * @return The value.
      */
    public float getPressingIndex() {
      return pressingIndex;
    }


    /**
      * Sets the value of the 'pressingIndex' field.
      * @param value The value of 'pressingIndex'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setPressingIndex(float value) {
      validate(fields()[6], value);
      this.pressingIndex = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'pressingIndex' field has been set.
      * @return True if the 'pressingIndex' field has been set, false otherwise.
      */
    public boolean hasPressingIndex() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'pressingIndex' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearPressingIndex() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'controlIndex' field.
      * @return The value.
      */
    public float getControlIndex() {
      return controlIndex;
    }


    /**
      * Sets the value of the 'controlIndex' field.
      * @param value The value of 'controlIndex'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setControlIndex(float value) {
      validate(fields()[7], value);
      this.controlIndex = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'controlIndex' field has been set.
      * @return True if the 'controlIndex' field has been set, false otherwise.
      */
    public boolean hasControlIndex() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'controlIndex' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearControlIndex() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'zone' field.
      * @return The value.
      */
    public int getZone() {
      return zone;
    }


    /**
      * Sets the value of the 'zone' field.
      * @param value The value of 'zone'.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder setZone(int value) {
      validate(fields()[8], value);
      this.zone = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'zone' field has been set.
      * @return True if the 'zone' field has been set, false otherwise.
      */
    public boolean hasZone() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'zone' field.
      * @return This builder.
      */
    public com.mas2022datascience.avro.v1.playerMetrics.Builder clearZone() {
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public playerMetrics build() {
      try {
        playerMetrics record = new playerMetrics();
        record.x = fieldSetFlags()[0] ? this.x : (java.lang.Integer) defaultValue(fields()[0]);
        record.y = fieldSetFlags()[1] ? this.y : (java.lang.Integer) defaultValue(fields()[1]);
        record.velocity = fieldSetFlags()[2] ? this.velocity : (java.lang.Long) defaultValue(fields()[2]);
        record.velocityVector = fieldSetFlags()[3] ? this.velocityVector : (java.util.List<java.lang.Long>) defaultValue(fields()[3]);
        record.acceleration = fieldSetFlags()[4] ? this.acceleration : (java.lang.Float) defaultValue(fields()[4]);
        record.accelerationVector = fieldSetFlags()[5] ? this.accelerationVector : (java.util.List<java.lang.Long>) defaultValue(fields()[5]);
        record.pressingIndex = fieldSetFlags()[6] ? this.pressingIndex : (java.lang.Float) defaultValue(fields()[6]);
        record.controlIndex = fieldSetFlags()[7] ? this.controlIndex : (java.lang.Float) defaultValue(fields()[7]);
        record.zone = fieldSetFlags()[8] ? this.zone : (java.lang.Integer) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<playerMetrics>
    WRITER$ = (org.apache.avro.io.DatumWriter<playerMetrics>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<playerMetrics>
    READER$ = (org.apache.avro.io.DatumReader<playerMetrics>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.x);

    out.writeInt(this.y);

    out.writeLong(this.velocity);

    long size0 = this.velocityVector.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.Long e0: this.velocityVector) {
      actualSize0++;
      out.startItem();
      out.writeLong(e0);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeFloat(this.acceleration);

    long size1 = this.accelerationVector.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (java.lang.Long e1: this.accelerationVector) {
      actualSize1++;
      out.startItem();
      out.writeLong(e1);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

    out.writeFloat(this.pressingIndex);

    out.writeFloat(this.controlIndex);

    out.writeInt(this.zone);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.x = in.readInt();

      this.y = in.readInt();

      this.velocity = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<java.lang.Long> a0 = this.velocityVector;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.Long>((int)size0, SCHEMA$.getField("velocityVector").schema());
        this.velocityVector = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.Long> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.Long e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readLong();
          a0.add(e0);
        }
      }

      this.acceleration = in.readFloat();

      long size1 = in.readArrayStart();
      java.util.List<java.lang.Long> a1 = this.accelerationVector;
      if (a1 == null) {
        a1 = new SpecificData.Array<java.lang.Long>((int)size1, SCHEMA$.getField("accelerationVector").schema());
        this.accelerationVector = a1;
      } else a1.clear();
      SpecificData.Array<java.lang.Long> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          java.lang.Long e1 = (ga1 != null ? ga1.peek() : null);
          e1 = in.readLong();
          a1.add(e1);
        }
      }

      this.pressingIndex = in.readFloat();

      this.controlIndex = in.readFloat();

      this.zone = in.readInt();

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.x = in.readInt();
          break;

        case 1:
          this.y = in.readInt();
          break;

        case 2:
          this.velocity = in.readLong();
          break;

        case 3:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.Long> a0 = this.velocityVector;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.Long>((int)size0, SCHEMA$.getField("velocityVector").schema());
            this.velocityVector = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.Long> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.Long e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readLong();
              a0.add(e0);
            }
          }
          break;

        case 4:
          this.acceleration = in.readFloat();
          break;

        case 5:
          long size1 = in.readArrayStart();
          java.util.List<java.lang.Long> a1 = this.accelerationVector;
          if (a1 == null) {
            a1 = new SpecificData.Array<java.lang.Long>((int)size1, SCHEMA$.getField("accelerationVector").schema());
            this.accelerationVector = a1;
          } else a1.clear();
          SpecificData.Array<java.lang.Long> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.Long e1 = (ga1 != null ? ga1.peek() : null);
              e1 = in.readLong();
              a1.add(e1);
            }
          }
          break;

        case 6:
          this.pressingIndex = in.readFloat();
          break;

        case 7:
          this.controlIndex = in.readFloat();
          break;

        case 8:
          this.zone = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










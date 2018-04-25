// ORM class for table 'topten'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Mar 26 15:06:14 IST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class topten extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer customer_id;
  public Integer get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(Integer customer_id) {
    this.customer_id = customer_id;
  }
  public topten with_customer_id(Integer customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String fname;
  public String get_fname() {
    return fname;
  }
  public void set_fname(String fname) {
    this.fname = fname;
  }
  public topten with_fname(String fname) {
    this.fname = fname;
    return this;
  }
  private String lname;
  public String get_lname() {
    return lname;
  }
  public void set_lname(String lname) {
    this.lname = lname;
  }
  public topten with_lname(String lname) {
    this.lname = lname;
    return this;
  }
  private Integer age;
  public Integer get_age() {
    return age;
  }
  public void set_age(Integer age) {
    this.age = age;
  }
  public topten with_age(Integer age) {
    this.age = age;
    return this;
  }
  private String profession;
  public String get_profession() {
    return profession;
  }
  public void set_profession(String profession) {
    this.profession = profession;
  }
  public topten with_profession(String profession) {
    this.profession = profession;
    return this;
  }
  private Double amount;
  public Double get_amount() {
    return amount;
  }
  public void set_amount(Double amount) {
    this.amount = amount;
  }
  public topten with_amount(Double amount) {
    this.amount = amount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof topten)) {
      return false;
    }
    topten that = (topten) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.fname == null ? that.fname == null : this.fname.equals(that.fname));
    equal = equal && (this.lname == null ? that.lname == null : this.lname.equals(that.lname));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.profession == null ? that.profession == null : this.profession.equals(that.profession));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof topten)) {
      return false;
    }
    topten that = (topten) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.fname == null ? that.fname == null : this.fname.equals(that.fname));
    equal = equal && (this.lname == null ? that.lname == null : this.lname.equals(that.lname));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.profession == null ? that.profession == null : this.profession.equals(that.profession));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.customer_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fname = JdbcWritableBridge.readString(2, __dbResults);
    this.lname = JdbcWritableBridge.readString(3, __dbResults);
    this.age = JdbcWritableBridge.readInteger(4, __dbResults);
    this.profession = JdbcWritableBridge.readString(5, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.customer_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.fname = JdbcWritableBridge.readString(2, __dbResults);
    this.lname = JdbcWritableBridge.readString(3, __dbResults);
    this.age = JdbcWritableBridge.readInteger(4, __dbResults);
    this.profession = JdbcWritableBridge.readString(5, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(customer_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(profession, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 6 + __off, 8, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(customer_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(profession, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 6 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fname = null;
    } else {
    this.fname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lname = null;
    } else {
    this.lname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age = null;
    } else {
    this.age = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.profession = null;
    } else {
    this.profession = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_id);
    }
    if (null == this.fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fname);
    }
    if (null == this.lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lname);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.profession) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, profession);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_id);
    }
    if (null == this.fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fname);
    }
    if (null == this.lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lname);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.profession) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, profession);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":"" + customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fname==null?"null":fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lname==null?"null":lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profession==null?"null":profession, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":"" + customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fname==null?"null":fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lname==null?"null":lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(profession==null?"null":profession, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_id = null; } else {
      this.customer_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fname = null; } else {
      this.fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lname = null; } else {
      this.lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.profession = null; } else {
      this.profession = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_id = null; } else {
      this.customer_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fname = null; } else {
      this.fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lname = null; } else {
      this.lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.profession = null; } else {
      this.profession = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    topten o = (topten) super.clone();
    return o;
  }

  public void clone0(topten o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("fname", this.fname);
    __sqoop$field_map.put("lname", this.lname);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("profession", this.profession);
    __sqoop$field_map.put("amount", this.amount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("fname", this.fname);
    __sqoop$field_map.put("lname", this.lname);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("profession", this.profession);
    __sqoop$field_map.put("amount", this.amount);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("customer_id".equals(__fieldName)) {
      this.customer_id = (Integer) __fieldVal;
    }
    else    if ("fname".equals(__fieldName)) {
      this.fname = (String) __fieldVal;
    }
    else    if ("lname".equals(__fieldName)) {
      this.lname = (String) __fieldVal;
    }
    else    if ("age".equals(__fieldName)) {
      this.age = (Integer) __fieldVal;
    }
    else    if ("profession".equals(__fieldName)) {
      this.profession = (String) __fieldVal;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("customer_id".equals(__fieldName)) {
      this.customer_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("fname".equals(__fieldName)) {
      this.fname = (String) __fieldVal;
      return true;
    }
    else    if ("lname".equals(__fieldName)) {
      this.lname = (String) __fieldVal;
      return true;
    }
    else    if ("age".equals(__fieldName)) {
      this.age = (Integer) __fieldVal;
      return true;
    }
    else    if ("profession".equals(__fieldName)) {
      this.profession = (String) __fieldVal;
      return true;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

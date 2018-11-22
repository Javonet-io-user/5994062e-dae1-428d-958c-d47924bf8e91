package RDPCrystalEDILibrary;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.*;
import RDPCrystalEDILibrary.*;
import jio.System.Text.*;

public class EDISpecification {
  protected NObject javonetHandle;
  /** GetProperty */
  public FileType getEDIFileType() {
    try {
      return FileType.valueOf(((NEnum) javonetHandle.<NEnum>get("EDIFileType")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getX12VersionCode() {
    try {
      return (java.lang.String) javonetHandle.get("X12VersionCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getX12Version() {
    try {
      return (java.lang.String) javonetHandle.get("X12Version");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getX12TransactionSetCode() {
    try {
      return (java.lang.String) javonetHandle.get("X12TransactionSetCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTMessageType() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFACTMessageType");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTMessageVersion() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFACTMessageVersion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTReleaseVersion() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFACTReleaseVersion");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFACTControllingAgency() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFACTControllingAgency");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeSenderIDQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("InterchangeSenderIDQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeSenderID() {
    try {
      return (java.lang.String) javonetHandle.get("InterchangeSenderID");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeReceiverIDQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("InterchangeReceiverIDQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getInterchangeReceiverID() {
    try {
      return (java.lang.String) javonetHandle.get("InterchangeReceiverID");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Delimiters getDelimiters() {
    try {
      return new Delimiters((NObject) javonetHandle.<NObject>get("Delimiters"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public static java.lang.String getTrimString() {
    try {
      return (java.lang.String) Javonet.getType("EDISpecification").get("TrimString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setTrimString(java.lang.String param) {
    try {
      Javonet.getType("EDISpecification").set("TrimString", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDISpecification() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDISpecification");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDISpecification(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static EDISpecification FindSpecificationFromFile(java.lang.String path) {
    try {
      return new EDISpecification(
          (NObject) Javonet.getType("EDISpecification").invoke("FindSpecificationFromFile", path));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static EDISpecification FindSpecificationFromFile(
      java.lang.String path, Encoding encoding) {
    try {
      return new EDISpecification(
          (NObject)
              Javonet.getType("EDISpecification")
                  .invoke("FindSpecificationFromFile", path, encoding));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FileType FindFileTypeFromFile(java.lang.String path, Encoding encoding) {
    try {
      return FileType.valueOf(
          ((NEnum)
                  Javonet.getType("EDISpecification")
                      .invoke("FindFileTypeFromFile", path, encoding))
              .getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static FileType FindFileTypeFromString(java.lang.String fileData) {
    try {
      return FileType.valueOf(
          ((NEnum) Javonet.getType("EDISpecification").invoke("FindFileTypeFromString", fileData))
              .getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static EDISpecification FindSpecificationFromString(java.lang.String fileData) {
    try {
      return new EDISpecification(
          (NObject)
              Javonet.getType("EDISpecification").invoke("FindSpecificationFromString", fileData));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

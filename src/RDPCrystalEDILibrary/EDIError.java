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

public class EDIError {
  protected NObject javonetHandle;
  /** GetProperty */
  public SnipTestLevel getSnipLevel() {
    try {
      return SnipTestLevel.valueOf(((NEnum) javonetHandle.<NEnum>get("SnipLevel")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DataSegment getSegmentSchema() {
    try {
      return new DataSegment((NObject) javonetHandle.<NObject>get("SegmentSchema"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getValidatingSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("ValidatingSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Long getSegmentPositionInTransaction() {
    try {
      return javonetHandle.get("SegmentPositionInTransaction");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getSTSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("STSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getGSSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("GSSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public EDIValidationMessage getMessage() {
    try {
      return EDIValidationMessage.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("Message")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getSegment() {
    try {
      return (java.lang.String) javonetHandle.get("Segment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getSegmentOrdinal() {
    try {
      return javonetHandle.get("SegmentOrdinal");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementOrdinal() {
    try {
      return javonetHandle.get("ElementOrdinal");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCompositeElementOrdinal() {
    try {
      return javonetHandle.get("CompositeElementOrdinal");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      return (java.lang.String) javonetHandle.get("Description");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getLoop() {
    try {
      return (java.lang.String) javonetHandle.get("Loop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getLineNumber() {
    try {
      return javonetHandle.get("LineNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getStackTrace() {
    try {
      return (java.lang.String) javonetHandle.get("StackTrace");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public EDIError() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIError");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIError(
      java.lang.Integer lineNumber,
      java.lang.String loop,
      java.lang.String segment,
      java.lang.Integer elementOrdinal,
      java.lang.Integer compositeElementOrd,
      EDIValidationMessage message,
      java.lang.String description,
      LightWeightSegment currentSTSegment,
      LightWeightSegment currentGSSegment,
      java.lang.String position,
      java.lang.Long segmentPosition,
      DataSegment schemaSeg) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.EDIError",
              lineNumber,
              loop,
              segment,
              elementOrdinal,
              compositeElementOrd,
              NEnum.fromJavaEnum(message),
              description,
              currentSTSegment,
              currentGSSegment,
              position,
              segmentPosition,
              schemaSeg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIError(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

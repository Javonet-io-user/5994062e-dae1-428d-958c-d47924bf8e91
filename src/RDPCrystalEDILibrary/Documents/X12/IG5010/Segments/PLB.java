package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;

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
import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;

public class PLB extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setReferenceIdentification(java.lang.String value) {
    try {
      javonetHandle.set("ReferenceIdentification", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getReferenceIdentification() {
    try {
      return (java.lang.String) javonetHandle.get("ReferenceIdentification");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDate(java.lang.String value) {
    try {
      javonetHandle.set("Date", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate() {
    try {
      return (java.lang.String) javonetHandle.get("Date");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier1(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier1() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier1"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount1(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount1() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier2(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier2() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier2"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount2(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount2() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier3(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier3() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier3"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount3(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount3() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier4(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier4() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier4"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount4(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount4() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier5(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier5() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier5"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount5(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount5() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount5");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAdjustmentIdentifier6(AdjustmentIdentifier value) {
    try {
      javonetHandle.set("AdjustmentIdentifier6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public AdjustmentIdentifier getAdjustmentIdentifier6() {
    try {
      return new AdjustmentIdentifier(
          (NObject) javonetHandle.<NObject>get("AdjustmentIdentifier6"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMonetaryAmount6(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount6() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount6");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PLB() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.PLB");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PLB(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Write(WriteArguments w) {
    try {
      javonetHandle.invoke("Write", w);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Load(LightWeightSegment segment) {
    try {
      javonetHandle.invoke("Load", segment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

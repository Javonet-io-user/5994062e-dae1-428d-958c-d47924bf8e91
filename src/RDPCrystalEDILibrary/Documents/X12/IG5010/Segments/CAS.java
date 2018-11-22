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

public class CAS extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setClaimAdjustmentGroupCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentGroupCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentGroupCode() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentGroupCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode1(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode1() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setQuantity1(java.lang.String value) {
    try {
      javonetHandle.set("Quantity1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity1() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode2(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode2() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setQuantity2(java.lang.String value) {
    try {
      javonetHandle.set("Quantity2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity2() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode3(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode3() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setQuantity3(java.lang.String value) {
    try {
      javonetHandle.set("Quantity3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity3() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode4(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode4() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setQuantity4(java.lang.String value) {
    try {
      javonetHandle.set("Quantity4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity4() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode5(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode5() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode5");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setQuantity5(java.lang.String value) {
    try {
      javonetHandle.set("Quantity5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity5() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity5");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimAdjustmentReasonCode6(java.lang.String value) {
    try {
      javonetHandle.set("ClaimAdjustmentReasonCode6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimAdjustmentReasonCode6() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimAdjustmentReasonCode6");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** SetProperty */

  public void setQuantity6(java.lang.String value) {
    try {
      javonetHandle.set("Quantity6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity6() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity6");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CAS() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CAS");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CAS(NObject handle) {
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

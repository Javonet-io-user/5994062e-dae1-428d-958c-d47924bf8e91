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

public class STC extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setHealthCareClaimStatus1(HealthCareClaimStatus value) {
    try {
      javonetHandle.set("HealthCareClaimStatus1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HealthCareClaimStatus getHealthCareClaimStatus1() {
    try {
      return new HealthCareClaimStatus(
          (NObject) javonetHandle.<NObject>get("HealthCareClaimStatus1"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDate1(java.lang.String value) {
    try {
      javonetHandle.set("Date1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate1() {
    try {
      return (java.lang.String) javonetHandle.get("Date1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setActionCode(java.lang.String value) {
    try {
      javonetHandle.set("ActionCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getActionCode() {
    try {
      return (java.lang.String) javonetHandle.get("ActionCode");
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

  public void setDate2(java.lang.String value) {
    try {
      javonetHandle.set("Date2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate2() {
    try {
      return (java.lang.String) javonetHandle.get("Date2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPaymentMethodCode(java.lang.String value) {
    try {
      javonetHandle.set("PaymentMethodCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPaymentMethodCode() {
    try {
      return (java.lang.String) javonetHandle.get("PaymentMethodCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDate3(java.lang.String value) {
    try {
      javonetHandle.set("Date3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate3() {
    try {
      return (java.lang.String) javonetHandle.get("Date3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCheckNumber(java.lang.String value) {
    try {
      javonetHandle.set("CheckNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCheckNumber() {
    try {
      return (java.lang.String) javonetHandle.get("CheckNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHealthCareClaimStatus2(HealthCareClaimStatus value) {
    try {
      javonetHandle.set("HealthCareClaimStatus2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HealthCareClaimStatus getHealthCareClaimStatus2() {
    try {
      return new HealthCareClaimStatus(
          (NObject) javonetHandle.<NObject>get("HealthCareClaimStatus2"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setHealthCareClaimStatus3(HealthCareClaimStatus value) {
    try {
      javonetHandle.set("HealthCareClaimStatus3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HealthCareClaimStatus getHealthCareClaimStatus3() {
    try {
      return new HealthCareClaimStatus(
          (NObject) javonetHandle.<NObject>get("HealthCareClaimStatus3"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFreeFormMessageText(java.lang.String value) {
    try {
      javonetHandle.set("FreeFormMessageText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFreeFormMessageText() {
    try {
      return (java.lang.String) javonetHandle.get("FreeFormMessageText");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public STC() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.STC");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public STC(NObject handle) {
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

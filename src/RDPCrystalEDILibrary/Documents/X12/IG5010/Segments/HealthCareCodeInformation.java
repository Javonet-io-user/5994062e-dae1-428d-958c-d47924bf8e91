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

public class HealthCareCodeInformation extends CompositeElement {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCodeListQualifierCode(java.lang.String value) {
    try {
      javonetHandle.set("CodeListQualifierCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCodeListQualifierCode() {
    try {
      return (java.lang.String) javonetHandle.get("CodeListQualifierCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIndustryCode1(java.lang.String value) {
    try {
      javonetHandle.set("IndustryCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIndustryCode1() {
    try {
      return (java.lang.String) javonetHandle.get("IndustryCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDateTimePeriodFormatQualifier(java.lang.String value) {
    try {
      javonetHandle.set("DateTimePeriodFormatQualifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDateTimePeriodFormatQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("DateTimePeriodFormatQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDateTimePeriod(java.lang.String value) {
    try {
      javonetHandle.set("DateTimePeriod", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDateTimePeriod() {
    try {
      return (java.lang.String) javonetHandle.get("DateTimePeriod");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setQuantity(java.lang.String value) {
    try {
      javonetHandle.set("Quantity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setVersionIdentifier(java.lang.String value) {
    try {
      javonetHandle.set("VersionIdentifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getVersionIdentifier() {
    try {
      return (java.lang.String) javonetHandle.get("VersionIdentifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIndustryCode2(java.lang.String value) {
    try {
      javonetHandle.set("IndustryCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIndustryCode2() {
    try {
      return (java.lang.String) javonetHandle.get("IndustryCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HealthCareCodeInformation() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.HealthCareCodeInformation");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HealthCareCodeInformation(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetString(java.lang.Character compElemSep) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetString", compElemSep);
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

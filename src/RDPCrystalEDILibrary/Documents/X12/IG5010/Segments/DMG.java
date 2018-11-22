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

public class DMG extends DocumentSegment {
  protected NObject javonetHandle;
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

  public void setGenderCode(java.lang.String value) {
    try {
      javonetHandle.set("GenderCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getGenderCode() {
    try {
      return (java.lang.String) javonetHandle.get("GenderCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMaritalStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("MaritalStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMaritalStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("MaritalStatusCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setRaceOrEthnicityInformation(RaceOrEthnicityInformation value) {
    try {
      javonetHandle.set("RaceOrEthnicityInformation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RaceOrEthnicityInformation getRaceOrEthnicityInformation() {
    try {
      return new RaceOrEthnicityInformation(
          (NObject) javonetHandle.<NObject>get("RaceOrEthnicityInformation"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCitizenshipStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("CitizenshipStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCitizenshipStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("CitizenshipStatusCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCountryCode(java.lang.String value) {
    try {
      javonetHandle.set("CountryCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCountryCode() {
    try {
      return (java.lang.String) javonetHandle.get("CountryCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBasisOfVerificationCode(java.lang.String value) {
    try {
      javonetHandle.set("BasisOfVerificationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBasisOfVerificationCode() {
    try {
      return (java.lang.String) javonetHandle.get("BasisOfVerificationCode");
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

  public void setIndustryCode(java.lang.String value) {
    try {
      javonetHandle.set("IndustryCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIndustryCode() {
    try {
      return (java.lang.String) javonetHandle.get("IndustryCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DMG() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.DMG");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DMG(NObject handle) {
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

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

public class UM extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRequestCategoryCode(java.lang.String value) {
    try {
      javonetHandle.set("RequestCategoryCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getRequestCategoryCode() {
    try {
      return (java.lang.String) javonetHandle.get("RequestCategoryCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCertificationTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("CertificationTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCertificationTypeCode() {
    try {
      return (java.lang.String) javonetHandle.get("CertificationTypeCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setServiceTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("ServiceTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getServiceTypeCode() {
    try {
      return (java.lang.String) javonetHandle.get("ServiceTypeCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHealthCareServiceLocation(HealthCareServiceLocation value) {
    try {
      javonetHandle.set("HealthCareServiceLocation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HealthCareServiceLocation getHealthCareServiceLocation() {
    try {
      return new HealthCareServiceLocation(
          (NObject) javonetHandle.<NObject>get("HealthCareServiceLocation"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRelatedCausesInformation(RelatedCausesInformation value) {
    try {
      javonetHandle.set("RelatedCausesInformation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RelatedCausesInformation getRelatedCausesInformation() {
    try {
      return new RelatedCausesInformation(
          (NObject) javonetHandle.<NObject>get("RelatedCausesInformation"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLevelOfServiceCode(java.lang.String value) {
    try {
      javonetHandle.set("LevelOfServiceCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLevelOfServiceCode() {
    try {
      return (java.lang.String) javonetHandle.get("LevelOfServiceCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCurrentHealthConditionCode(java.lang.String value) {
    try {
      javonetHandle.set("CurrentHealthConditionCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCurrentHealthConditionCode() {
    try {
      return (java.lang.String) javonetHandle.get("CurrentHealthConditionCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPrognosisCode(java.lang.String value) {
    try {
      javonetHandle.set("PrognosisCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPrognosisCode() {
    try {
      return (java.lang.String) javonetHandle.get("PrognosisCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setReleaseOfInformationCode(java.lang.String value) {
    try {
      javonetHandle.set("ReleaseOfInformationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getReleaseOfInformationCode() {
    try {
      return (java.lang.String) javonetHandle.get("ReleaseOfInformationCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDelayReasonCode(java.lang.String value) {
    try {
      javonetHandle.set("DelayReasonCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDelayReasonCode() {
    try {
      return (java.lang.String) javonetHandle.get("DelayReasonCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public UM() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.UM");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UM(NObject handle) {
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

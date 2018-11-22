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

public class CLP extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setClaimSubmitterIdentifier(java.lang.String value) {
    try {
      javonetHandle.set("ClaimSubmitterIdentifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimSubmitterIdentifier() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimSubmitterIdentifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimStatusCode");
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

  public void setClaimFilingIndicatorCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimFilingIndicatorCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimFilingIndicatorCode() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimFilingIndicatorCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
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

  public void setFacilityCodeValue(java.lang.String value) {
    try {
      javonetHandle.set("FacilityCodeValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFacilityCodeValue() {
    try {
      return (java.lang.String) javonetHandle.get("FacilityCodeValue");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimFrequencyTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimFrequencyTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimFrequencyTypeCode() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimFrequencyTypeCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPatientStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("PatientStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPatientStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("PatientStatusCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDiagnosisRelatedGroupCode(java.lang.String value) {
    try {
      javonetHandle.set("DiagnosisRelatedGroupCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDiagnosisRelatedGroupCode() {
    try {
      return (java.lang.String) javonetHandle.get("DiagnosisRelatedGroupCode");
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

  public void setPercentage(java.lang.String value) {
    try {
      javonetHandle.set("Percentage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPercentage() {
    try {
      return (java.lang.String) javonetHandle.get("Percentage");
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

  public CLP() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CLP");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CLP(NObject handle) {
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

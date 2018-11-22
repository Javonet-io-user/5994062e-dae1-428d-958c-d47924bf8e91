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

public class CLM extends DocumentSegment {
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

  public void setNonInstitutionalClaimTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("NonInstitutionalClaimTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNonInstitutionalClaimTypeCode() {
    try {
      return (java.lang.String) javonetHandle.get("NonInstitutionalClaimTypeCode");
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

  public void setYesNoConditionOrResponseCode1(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode1() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAssignmentOrPlanParticipationCode(java.lang.String value) {
    try {
      javonetHandle.set("AssignmentOrPlanParticipationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAssignmentOrPlanParticipationCode() {
    try {
      return (java.lang.String) javonetHandle.get("AssignmentOrPlanParticipationCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode2(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode2() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode2");
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

  public void setPatientSignatureSourceCode(java.lang.String value) {
    try {
      javonetHandle.set("PatientSignatureSourceCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPatientSignatureSourceCode() {
    try {
      return (java.lang.String) javonetHandle.get("PatientSignatureSourceCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setSpecialProgramCode(java.lang.String value) {
    try {
      javonetHandle.set("SpecialProgramCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSpecialProgramCode() {
    try {
      return (java.lang.String) javonetHandle.get("SpecialProgramCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode3(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode3() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setYesNoConditionOrResponseCode4(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode4() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProviderAgreementCode(java.lang.String value) {
    try {
      javonetHandle.set("ProviderAgreementCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProviderAgreementCode() {
    try {
      return (java.lang.String) javonetHandle.get("ProviderAgreementCode");
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

  public void setYesNoConditionOrResponseCode5(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode5() {
    try {
      return (java.lang.String) javonetHandle.get("YesNoConditionOrResponseCode5");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimStatusReasonCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimStatusReasonCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimStatusReasonCode() {
    try {
      return (java.lang.String) javonetHandle.get("ClaimStatusReasonCode");
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

  public CLM() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CLM");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CLM(NObject handle) {
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

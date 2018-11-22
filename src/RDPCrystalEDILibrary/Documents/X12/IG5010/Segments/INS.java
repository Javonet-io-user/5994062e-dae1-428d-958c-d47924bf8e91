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

public class INS extends DocumentSegment {
  protected NObject javonetHandle;
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

  public void setIndividualRelationshipCode(java.lang.String value) {
    try {
      javonetHandle.set("IndividualRelationshipCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIndividualRelationshipCode() {
    try {
      return (java.lang.String) javonetHandle.get("IndividualRelationshipCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMaintenanceTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("MaintenanceTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMaintenanceTypeCode() {
    try {
      return (java.lang.String) javonetHandle.get("MaintenanceTypeCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMaintenanceReasonCode(java.lang.String value) {
    try {
      javonetHandle.set("MaintenanceReasonCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMaintenanceReasonCode() {
    try {
      return (java.lang.String) javonetHandle.get("MaintenanceReasonCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBenefitStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("BenefitStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBenefitStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("BenefitStatusCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMedicareStatusCode(MedicareStatusCode value) {
    try {
      javonetHandle.set("MedicareStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public MedicareStatusCode getMedicareStatusCode() {
    try {
      return new MedicareStatusCode((NObject) javonetHandle.<NObject>get("MedicareStatusCode"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setConsolidatedOmnibusBudgetReconciliationAct(java.lang.String value) {
    try {
      javonetHandle.set("ConsolidatedOmnibusBudgetReconciliationAct", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getConsolidatedOmnibusBudgetReconciliationAct() {
    try {
      return (java.lang.String) javonetHandle.get("ConsolidatedOmnibusBudgetReconciliationAct");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEmploymentStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("EmploymentStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEmploymentStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("EmploymentStatusCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setStudentStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("StudentStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getStudentStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("StudentStatusCode");
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

  public void setConfidentialityCode(java.lang.String value) {
    try {
      javonetHandle.set("ConfidentialityCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getConfidentialityCode() {
    try {
      return (java.lang.String) javonetHandle.get("ConfidentialityCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCityName(java.lang.String value) {
    try {
      javonetHandle.set("CityName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCityName() {
    try {
      return (java.lang.String) javonetHandle.get("CityName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setStateOrProvinceCode(java.lang.String value) {
    try {
      javonetHandle.set("StateOrProvinceCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getStateOrProvinceCode() {
    try {
      return (java.lang.String) javonetHandle.get("StateOrProvinceCode");
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

  public void setNumber(java.lang.String value) {
    try {
      javonetHandle.set("Number", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNumber() {
    try {
      return (java.lang.String) javonetHandle.get("Number");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public INS() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.INS");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public INS(NObject handle) {
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

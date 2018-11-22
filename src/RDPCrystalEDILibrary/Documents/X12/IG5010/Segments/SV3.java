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

public class SV3 extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCompositeMedicalProcedureIdentifier(CompositeMedicalProcedureIdentifier value) {
    try {
      javonetHandle.set("CompositeMedicalProcedureIdentifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CompositeMedicalProcedureIdentifier getCompositeMedicalProcedureIdentifier() {
    try {
      return new CompositeMedicalProcedureIdentifier(
          (NObject) javonetHandle.<NObject>get("CompositeMedicalProcedureIdentifier"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void setOralCavityDesign(OralCavityDesign value) {
    try {
      javonetHandle.set("OralCavityDesign", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public OralCavityDesign getOralCavityDesign() {
    try {
      return new OralCavityDesign((NObject) javonetHandle.<NObject>get("OralCavityDesign"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setProsthesisCrownOrInlayCode(java.lang.String value) {
    try {
      javonetHandle.set("ProsthesisCrownOrInlayCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProsthesisCrownOrInlayCode() {
    try {
      return (java.lang.String) javonetHandle.get("ProsthesisCrownOrInlayCode");
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

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** SetProperty */

  public void setCopayStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("CopayStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCopayStatusCode() {
    try {
      return (java.lang.String) javonetHandle.get("CopayStatusCode");
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
  /** SetProperty */

  public void setCompositeDiagnosticCodePointer(CompositeDiagnosticCodePointer value) {
    try {
      javonetHandle.set("CompositeDiagnosticCodePointer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CompositeDiagnosticCodePointer getCompositeDiagnosticCodePointer() {
    try {
      return new CompositeDiagnosticCodePointer(
          (NObject) javonetHandle.<NObject>get("CompositeDiagnosticCodePointer"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SV3() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.SV3");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SV3(NObject handle) {
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

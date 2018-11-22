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

public class CR5 extends DocumentSegment {
  protected NObject javonetHandle;
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

  public void setOxygenEquipmentTypeCode1(java.lang.String value) {
    try {
      javonetHandle.set("OxygenEquipmentTypeCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenEquipmentTypeCode1() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenEquipmentTypeCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenEquipmentTypeCode2(java.lang.String value) {
    try {
      javonetHandle.set("OxygenEquipmentTypeCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenEquipmentTypeCode2() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenEquipmentTypeCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDescription1(java.lang.String value) {
    try {
      javonetHandle.set("Description1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription1() {
    try {
      return (java.lang.String) javonetHandle.get("Description1");
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

  public void setDescription2(java.lang.String value) {
    try {
      javonetHandle.set("Description2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription2() {
    try {
      return (java.lang.String) javonetHandle.get("Description2");
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
  /** SetProperty */

  public void setOxygenTestConditionCode(java.lang.String value) {
    try {
      javonetHandle.set("OxygenTestConditionCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenTestConditionCode() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenTestConditionCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenTestFindingsCode1(java.lang.String value) {
    try {
      javonetHandle.set("OxygenTestFindingsCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenTestFindingsCode1() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenTestFindingsCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenTestFindingsCode2(java.lang.String value) {
    try {
      javonetHandle.set("OxygenTestFindingsCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenTestFindingsCode2() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenTestFindingsCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenTestFindingsCode3(java.lang.String value) {
    try {
      javonetHandle.set("OxygenTestFindingsCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenTestFindingsCode3() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenTestFindingsCode3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setQuantity7(java.lang.String value) {
    try {
      javonetHandle.set("Quantity7", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQuantity7() {
    try {
      return (java.lang.String) javonetHandle.get("Quantity7");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenDeliverySystemCode(java.lang.String value) {
    try {
      javonetHandle.set("OxygenDeliverySystemCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenDeliverySystemCode() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenDeliverySystemCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOxygenEquipmentTypeCode3(java.lang.String value) {
    try {
      javonetHandle.set("OxygenEquipmentTypeCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOxygenEquipmentTypeCode3() {
    try {
      return (java.lang.String) javonetHandle.get("OxygenEquipmentTypeCode3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CR5() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CR5");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CR5(NObject handle) {
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

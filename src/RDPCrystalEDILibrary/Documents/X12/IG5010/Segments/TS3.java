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

public class TS3 extends DocumentSegment {
  protected NObject javonetHandle;
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

  public void setDate(java.lang.String value) {
    try {
      javonetHandle.set("Date", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate() {
    try {
      return (java.lang.String) javonetHandle.get("Date");
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

  public void setMonetaryAmount7(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount7", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount7() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount7");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount8(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount8", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount8() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount8");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount9(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount9", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount9() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount9");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount10(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount10", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount10() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount10");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount11(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount11", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount11() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount11");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount12(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount12", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount12() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount12");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount13(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount13", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount13() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount13");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount14(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount14", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount14() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount14");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount15(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount15", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount15() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount15");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount16(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount16", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount16() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount16");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount17(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount17", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount17() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount17");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount18(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount18", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount18() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount18");
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

  public void setMonetaryAmount19(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount19", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount19() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount19");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public TS3() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.TS3");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TS3(NObject handle) {
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

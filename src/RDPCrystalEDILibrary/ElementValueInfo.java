package RDPCrystalEDILibrary;

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
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class ElementValueInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCodeList(CodeList value) {
    try {
      javonetHandle.set("CodeList", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CodeList getCodeList() {
    try {
      return new CodeList((NObject) javonetHandle.<NObject>get("CodeList"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegmentOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("SegmentOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getSegmentOrdinalNumber() {
    try {
      return javonetHandle.get("SegmentOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElementOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("ElementOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementOrdinalNumber() {
    try {
      return javonetHandle.get("ElementOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSubElementOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("SubElementOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getSubElementOrdinalNumber() {
    try {
      return javonetHandle.get("SubElementOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getPossibleValues() {
    try {
      return new HashSet<java.lang.String>((NObject) javonetHandle.<NObject>get("PossibleValues"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCodeListName(java.lang.String value) {
    try {
      javonetHandle.set("CodeListName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCodeListName() {
    try {
      return (java.lang.String) javonetHandle.get("CodeListName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ElementValueInfo() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementValueInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementValueInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetPossibleValues() {
    try {
      return (java.lang.String) javonetHandle.invoke("GetPossibleValues");
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

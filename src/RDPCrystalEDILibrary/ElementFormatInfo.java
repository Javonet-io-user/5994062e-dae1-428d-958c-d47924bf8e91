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

public class ElementFormatInfo {
  protected NObject javonetHandle;
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
  /** SetProperty */

  public void setElementFormat(ElementFormat value) {
    try {
      javonetHandle.set("ElementFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ElementFormat getElementFormat() {
    try {
      return new ElementFormat((NObject) javonetHandle.<NObject>get("ElementFormat"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElementFormatInfo() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementFormatInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementFormatInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

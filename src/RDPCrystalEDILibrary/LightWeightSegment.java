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

public class LightWeightSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      return (java.lang.String) javonetHandle.get("Name");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSegmentLoop(LightWeightLoop value) {
    try {
      javonetHandle.set("SegmentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getSegmentLoop() {
    try {
      return new LightWeightLoop((NObject) javonetHandle.<NObject>get("SegmentLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("OrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getOrdinalNumber() {
    try {
      return javonetHandle.get("OrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElements(LightWeightElements value) {
    try {
      javonetHandle.set("Elements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightElements getElements() {
    try {
      return new LightWeightElements((NObject) javonetHandle.<NObject>get("Elements"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightElement getLastElement() {
    try {
      return new LightWeightElement((NObject) javonetHandle.<NObject>get("LastElement"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightElement getFirstElement() {
    try {
      return new LightWeightElement((NObject) javonetHandle.<NObject>get("FirstElement"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LightWeightSegment() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightSegment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightSegment(java.lang.String segmentName) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightSegment", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightSegment(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean ContainsElement(java.lang.Integer elementIndex) {
    try {
      return javonetHandle.invoke("ContainsElement", elementIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToEDIString(Delimiters delimiters) {
    try {
      return (java.lang.String) javonetHandle.invoke("ToEDIString", delimiters);
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

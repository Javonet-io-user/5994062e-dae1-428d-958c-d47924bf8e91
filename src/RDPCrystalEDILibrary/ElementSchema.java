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

public class ElementSchema {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setElementNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("ElementNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementNumber() {
    try {
      return javonetHandle.get("ElementNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setUsage(Usage value) {
    try {
      javonetHandle.set("Usage", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Usage getUsage() {
    try {
      return Usage.valueOf(((NEnum) javonetHandle.<NEnum>get("Usage")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setComposite(java.lang.Boolean value) {
    try {
      javonetHandle.set("Composite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getComposite() {
    try {
      return javonetHandle.get("Composite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCompositeElement(Segment value) {
    try {
      javonetHandle.set("CompositeElement", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Segment getCompositeElement() {
    try {
      return new Segment((NObject) javonetHandle.<NObject>get("CompositeElement"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElementSchema() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementSchema");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementSchema(java.lang.Integer elementNumber, Usage usage) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.ElementSchema", elementNumber, NEnum.fromJavaEnum(usage));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementSchema(java.lang.Integer elementNumber) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementSchema", elementNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementSchema(NObject handle) {
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

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
import jio.System.Collections.ObjectModel.*;

public class ElementPairConstraint {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setElementOrdinals(Collection<java.lang.Integer> value) {
    try {
      javonetHandle.set("ElementOrdinals", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<java.lang.Integer> getElementOrdinals() {
    try {
      return new Collection<java.lang.Integer>(
          (NObject) javonetHandle.<NObject>get("ElementOrdinals"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElementPairConstraint() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementPairConstraint");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementPairConstraint(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetElementOrdinalsString() {
    try {
      return (java.lang.String) javonetHandle.invoke("GetElementOrdinalsString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetElementOrdinalsString(java.lang.Integer start) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetElementOrdinalsString", start);
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

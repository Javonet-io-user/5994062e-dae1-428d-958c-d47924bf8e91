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
import jio.System.Collections.ObjectModel.*;

public class SelfRule {
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

  public void setElementValues(HashSet<java.lang.String> value) {
    try {
      javonetHandle.set("ElementValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getElementValues() {
    try {
      return new HashSet<java.lang.String>((NObject) javonetHandle.<NObject>get("ElementValues"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRuleOperator(RuleOperator value) {
    try {
      javonetHandle.set("RuleOperator", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RuleOperator getRuleOperator() {
    try {
      return RuleOperator.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("RuleOperator")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUsedElementCollection(Collection<java.lang.Integer> value) {
    try {
      javonetHandle.set("UsedElementCollection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<java.lang.Integer> getUsedElementCollection() {
    try {
      return new Collection<java.lang.Integer>(
          (NObject) javonetHandle.<NObject>get("UsedElementCollection"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setNotUsedElementCollection(Collection<java.lang.Integer> value) {
    try {
      javonetHandle.set("NotUsedElementCollection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<java.lang.Integer> getNotUsedElementCollection() {
    try {
      return new Collection<java.lang.Integer>(
          (NObject) javonetHandle.<NObject>get("NotUsedElementCollection"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SelfRule() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SelfRule");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SelfRule(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetNotUsedOrdinalsString() {
    try {
      return (java.lang.String) javonetHandle.invoke("GetNotUsedOrdinalsString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetUsedOrdinalsString() {
    try {
      return (java.lang.String) javonetHandle.invoke("GetUsedOrdinalsString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetUsedOrdinalsString(java.lang.Character separator) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetUsedOrdinalsString", separator);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetNotUsedOrdinalsString(java.lang.Character separator) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetNotUsedOrdinalsString", separator);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetCommaSeparatedElementValues() {
    try {
      return (java.lang.String) javonetHandle.invoke("GetCommaSeparatedElementValues");
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

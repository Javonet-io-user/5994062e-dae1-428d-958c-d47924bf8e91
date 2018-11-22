package RDPCrystalEDILibrary.Rules;

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
import RDPCrystalEDILibrary.Rules.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class ElseIfStatement extends Node {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCondition(Condition value) {
    try {
      javonetHandle.set("Condition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Condition getCondition() {
    try {
      return new Condition((NObject) javonetHandle.<NObject>get("Condition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTrue(Node value) {
    try {
      javonetHandle.set("True", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Node getTrue() {
    try {
      return new Node((NObject) javonetHandle.<NObject>get("True"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFalse(Node value) {
    try {
      javonetHandle.set("False", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Node getFalse() {
    try {
      return new Node((NObject) javonetHandle.<NObject>get("False"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElseIfStatement(java.lang.String text, java.lang.Integer depth) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.ElseIfStatement", text, depth);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElseIfStatement(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean Evaluate(
      EDIValidator validator, FoundSegmentCollection foundSegments, SegmentPositionNode sp) {
    try {
      return javonetHandle.invoke("Evaluate", validator, foundSegments, sp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Evaluate(
      EDIValidator validator, Dictionary<java.lang.Integer, java.lang.String> foundElements) {
    try {
      return javonetHandle.invoke("Evaluate", validator, foundElements);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String ToRuleString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToRuleString");
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

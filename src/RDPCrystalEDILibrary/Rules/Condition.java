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

public class Condition extends Node {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setOperator(RuleOperator value) {
    try {
      javonetHandle.set("Operator", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RuleOperator getOperator() {
    try {
      return RuleOperator.valueOf(((NEnum) javonetHandle.<NEnum>get("Operator")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCodeCondition(CodeCondition value) {
    try {
      javonetHandle.set("CodeCondition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CodeCondition getCodeCondition() {
    try {
      return new CodeCondition((NObject) javonetHandle.<NObject>get("CodeCondition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFirstOpPosition(SegmentPositionNode value) {
    try {
      javonetHandle.set("FirstOpPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SegmentPositionNode getFirstOpPosition() {
    try {
      return new SegmentPositionNode((NObject) javonetHandle.<NObject>get("FirstOpPosition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSecondOpPosition(SegmentPositionNode value) {
    try {
      javonetHandle.set("SecondOpPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SegmentPositionNode getSecondOpPosition() {
    try {
      return new SegmentPositionNode((NObject) javonetHandle.<NObject>get("SecondOpPosition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementPosition(ElementPositionNode value) {
    try {
      javonetHandle.set("ElementPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ElementPositionNode getElementPosition() {
    try {
      return new ElementPositionNode((NObject) javonetHandle.<NObject>get("ElementPosition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setValue(java.lang.String value) {
    try {
      javonetHandle.set("Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getValue() {
    try {
      return (java.lang.String) javonetHandle.get("Value");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public List<Condition> getoperands() {
    try {
      return new List<Condition>((NObject) javonetHandle.<NObject>get("operands"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setoperands(List<Condition> param) {
    try {
      javonetHandle.set("operands", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public List<java.lang.String> getoperators() {
    try {
      return new List<java.lang.String>((NObject) javonetHandle.<NObject>get("operators"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setoperators(List<java.lang.String> param) {
    try {
      javonetHandle.set("operators", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Condition(java.lang.String text, java.lang.Integer depth) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.Condition", text, depth);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Condition(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

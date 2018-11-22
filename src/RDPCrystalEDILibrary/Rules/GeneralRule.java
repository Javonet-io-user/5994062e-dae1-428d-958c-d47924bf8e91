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

public class GeneralRule extends Node {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setDepSegmentPositionNode(SegmentPositionNode value) {
    try {
      javonetHandle.set("DepSegmentPositionNode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SegmentPositionNode getDepSegmentPositionNode() {
    try {
      return new SegmentPositionNode(
          (NObject) javonetHandle.<NObject>get("DepSegmentPositionNode"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIfStatement(IfStatement value) {
    try {
      javonetHandle.set("IfStatement", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IfStatement getIfStatement() {
    try {
      return new IfStatement((NObject) javonetHandle.<NObject>get("IfStatement"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GeneralRule(java.lang.String text, java.lang.Integer depth) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.GeneralRule", text, depth);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GeneralRule(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

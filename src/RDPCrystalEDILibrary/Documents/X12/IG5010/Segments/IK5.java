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

public class IK5 extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTransactionSetAcknowledgmentCode(java.lang.String value) {
    try {
      javonetHandle.set("TransactionSetAcknowledgmentCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTransactionSetAcknowledgmentCode() {
    try {
      return (java.lang.String) javonetHandle.get("TransactionSetAcknowledgmentCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setImplementationTransactionSetSyntaxErrorCode1(java.lang.String value) {
    try {
      javonetHandle.set("ImplementationTransactionSetSyntaxErrorCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getImplementationTransactionSetSyntaxErrorCode1() {
    try {
      return (java.lang.String) javonetHandle.get("ImplementationTransactionSetSyntaxErrorCode1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setImplementationTransactionSetSyntaxErrorCode2(java.lang.String value) {
    try {
      javonetHandle.set("ImplementationTransactionSetSyntaxErrorCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getImplementationTransactionSetSyntaxErrorCode2() {
    try {
      return (java.lang.String) javonetHandle.get("ImplementationTransactionSetSyntaxErrorCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setImplementationTransactionSetSyntaxErrorCode3(java.lang.String value) {
    try {
      javonetHandle.set("ImplementationTransactionSetSyntaxErrorCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getImplementationTransactionSetSyntaxErrorCode3() {
    try {
      return (java.lang.String) javonetHandle.get("ImplementationTransactionSetSyntaxErrorCode3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setImplementationTransactionSetSyntaxErrorCode4(java.lang.String value) {
    try {
      javonetHandle.set("ImplementationTransactionSetSyntaxErrorCode4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getImplementationTransactionSetSyntaxErrorCode4() {
    try {
      return (java.lang.String) javonetHandle.get("ImplementationTransactionSetSyntaxErrorCode4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public IK5() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.IK5");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public IK5(NObject handle) {
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

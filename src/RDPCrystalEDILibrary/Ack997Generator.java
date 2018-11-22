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

public class Ack997Generator {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setDelimiters(Delimiters value) {
    try {
      javonetHandle.set("Delimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Delimiters getDelimiters() {
    try {
      return new Delimiters((NObject) javonetHandle.<NObject>get("Delimiters"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegmentSeparatorString(java.lang.String value) {
    try {
      javonetHandle.set("SegmentSeparatorString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSegmentSeparatorString() {
    try {
      return (java.lang.String) javonetHandle.get("SegmentSeparatorString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPaddingChar(java.lang.Character value) {
    try {
      javonetHandle.set("PaddingChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Character getPaddingChar() {
    try {
      return javonetHandle.get("PaddingChar");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Ack997Generator() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Ack997Generator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Ack997Generator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public EDIDocument Generate997Acknowledgement(EDIValidator ediValidator) {
    try {
      return new EDIDocument(
          (NObject) javonetHandle.invoke("Generate997Acknowledgement", ediValidator));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

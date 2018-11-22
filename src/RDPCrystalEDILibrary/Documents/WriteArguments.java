package RDPCrystalEDILibrary.Documents;

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
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class WriteArguments {
  protected NObject javonetHandle;
  /** GetFiled */
  public Delimiters getDelimiters() {
    try {
      return new Delimiters((NObject) javonetHandle.<NObject>get("Delimiters"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setDelimiters(Delimiters param) {
    try {
      javonetHandle.set("Delimiters", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public List<java.lang.String> getValues() {
    try {
      return new List<java.lang.String>((NObject) javonetHandle.<NObject>get("Values"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setValues(List<java.lang.String> param) {
    try {
      javonetHandle.set("Values", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getNewLineAfterSegment() {
    try {
      return javonetHandle.get("NewLineAfterSegment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setNewLineAfterSegment(java.lang.Boolean param) {
    try {
      javonetHandle.set("NewLineAfterSegment", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WriteArguments() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.WriteArguments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WriteArguments(NObject handle) {
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

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

public class PER extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setContactFunctionCode(java.lang.String value) {
    try {
      javonetHandle.set("ContactFunctionCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContactFunctionCode() {
    try {
      return (java.lang.String) javonetHandle.get("ContactFunctionCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setContactName(java.lang.String value) {
    try {
      javonetHandle.set("ContactName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContactName() {
    try {
      return (java.lang.String) javonetHandle.get("ContactName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumberQualifier1(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumberQualifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumberQualifier1() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumberQualifier1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumber1(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumber1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumber1() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumber1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumberQualifier2(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumberQualifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumberQualifier2() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumberQualifier2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumber2(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumber2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumber2() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumber2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumberQualifier3(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumberQualifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumberQualifier3() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumberQualifier3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommunicationNumber3(java.lang.String value) {
    try {
      javonetHandle.set("CommunicationNumber3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommunicationNumber3() {
    try {
      return (java.lang.String) javonetHandle.get("CommunicationNumber3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setContactInquiryReference(java.lang.String value) {
    try {
      javonetHandle.set("ContactInquiryReference", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContactInquiryReference() {
    try {
      return (java.lang.String) javonetHandle.get("ContactInquiryReference");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PER() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.PER");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PER(NObject handle) {
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

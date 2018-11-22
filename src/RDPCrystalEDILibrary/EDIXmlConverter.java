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
import jio.System.Xml.*;

public class EDIXmlConverter {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setXmlConfigOptions(XmlConfigOptions value) {
    try {
      javonetHandle.set("XmlConfigOptions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public XmlConfigOptions getXmlConfigOptions() {
    try {
      return new XmlConfigOptions((NObject) javonetHandle.<NObject>get("XmlConfigOptions"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getEDIXMLFileString() {
    try {
      return (java.lang.String) javonetHandle.get("EDIXMLFileString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBufferSize(java.lang.Integer value) {
    try {
      javonetHandle.set("BufferSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getBufferSize() {
    try {
      return javonetHandle.get("BufferSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public EDIXmlConverter(EDILightWeightDocument ediDocument) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIXmlConverter", ediDocument);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIXmlConverter(EDIDocument ediDocument) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIXmlConverter", ediDocument);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIXmlConverter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public XmlDocument ToXml() {
    try {
      return new XmlDocument((NObject) javonetHandle.invoke("ToXml"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ToXml(java.lang.String file) {
    try {
      javonetHandle.invoke("ToXml", file);
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

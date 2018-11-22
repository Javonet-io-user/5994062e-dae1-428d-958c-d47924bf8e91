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

public class EDIFACTStrings {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getUNA() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNA");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNA(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNT() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNT");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNT(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNH() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNH");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNH(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNH", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNB() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNB");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNB(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNG() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNG");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNG(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNG", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNE() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNE");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNE(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUNZ() {
    try {
      return (java.lang.String) Javonet.getType("EDIFACTStrings").get("UNZ");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUNZ(java.lang.String param) {
    try {
      Javonet.getType("EDIFACTStrings").set("UNZ", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFACTStrings() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFACTStrings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFACTStrings(NObject handle) {
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

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

public class NM1 extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setEntityIdentifierCode(java.lang.String value) {
    try {
      javonetHandle.set("EntityIdentifierCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEntityIdentifierCode() {
    try {
      return (java.lang.String) javonetHandle.get("EntityIdentifierCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEntityTypeQualifier(java.lang.String value) {
    try {
      javonetHandle.set("EntityTypeQualifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEntityTypeQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("EntityTypeQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNameLastOrOrganizationName(java.lang.String value) {
    try {
      javonetHandle.set("NameLastOrOrganizationName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNameLastOrOrganizationName() {
    try {
      return (java.lang.String) javonetHandle.get("NameLastOrOrganizationName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFirstName(java.lang.String value) {
    try {
      javonetHandle.set("FirstName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFirstName() {
    try {
      return (java.lang.String) javonetHandle.get("FirstName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMiddleName(java.lang.String value) {
    try {
      javonetHandle.set("MiddleName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMiddleName() {
    try {
      return (java.lang.String) javonetHandle.get("MiddleName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNamePrefix(java.lang.String value) {
    try {
      javonetHandle.set("NamePrefix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNamePrefix() {
    try {
      return (java.lang.String) javonetHandle.get("NamePrefix");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNameSuffix(java.lang.String value) {
    try {
      javonetHandle.set("NameSuffix", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNameSuffix() {
    try {
      return (java.lang.String) javonetHandle.get("NameSuffix");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIdentificationCodeQualifier(java.lang.String value) {
    try {
      javonetHandle.set("IdentificationCodeQualifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIdentificationCodeQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("IdentificationCodeQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIdentificationCode(java.lang.String value) {
    try {
      javonetHandle.set("IdentificationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIdentificationCode() {
    try {
      return (java.lang.String) javonetHandle.get("IdentificationCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEntityRelationshipCode(java.lang.String value) {
    try {
      javonetHandle.set("EntityRelationshipCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEntityRelationshipCode() {
    try {
      return (java.lang.String) javonetHandle.get("EntityRelationshipCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEntityIdentifierCode2(java.lang.String value) {
    try {
      javonetHandle.set("EntityIdentifierCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEntityIdentifierCode2() {
    try {
      return (java.lang.String) javonetHandle.get("EntityIdentifierCode2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNameLastOrOrganizationName2(java.lang.String value) {
    try {
      javonetHandle.set("NameLastOrOrganizationName2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNameLastOrOrganizationName2() {
    try {
      return (java.lang.String) javonetHandle.get("NameLastOrOrganizationName2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public NM1() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.NM1");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NM1(NObject handle) {
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

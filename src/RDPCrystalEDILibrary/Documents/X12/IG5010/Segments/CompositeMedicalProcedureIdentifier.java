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

public class CompositeMedicalProcedureIdentifier extends CompositeElement {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setProductServiceIDQualifier(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier() {
    try {
      return (java.lang.String) javonetHandle.get("ProductServiceIDQualifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID1(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID1() {
    try {
      return (java.lang.String) javonetHandle.get("ProductServiceID1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProcedureModifier1(java.lang.String value) {
    try {
      javonetHandle.set("ProcedureModifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProcedureModifier1() {
    try {
      return (java.lang.String) javonetHandle.get("ProcedureModifier1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProcedureModifier2(java.lang.String value) {
    try {
      javonetHandle.set("ProcedureModifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProcedureModifier2() {
    try {
      return (java.lang.String) javonetHandle.get("ProcedureModifier2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProcedureModifier3(java.lang.String value) {
    try {
      javonetHandle.set("ProcedureModifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProcedureModifier3() {
    try {
      return (java.lang.String) javonetHandle.get("ProcedureModifier3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProcedureModifier4(java.lang.String value) {
    try {
      javonetHandle.set("ProcedureModifier4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProcedureModifier4() {
    try {
      return (java.lang.String) javonetHandle.get("ProcedureModifier4");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      return (java.lang.String) javonetHandle.get("Description");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID2(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID2() {
    try {
      return (java.lang.String) javonetHandle.get("ProductServiceID2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CompositeMedicalProcedureIdentifier() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CompositeMedicalProcedureIdentifier");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CompositeMedicalProcedureIdentifier(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetString(java.lang.Character compElemSep) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetString", compElemSep);
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

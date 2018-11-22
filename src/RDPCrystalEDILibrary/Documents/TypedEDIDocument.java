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

public abstract class TypedEDIDocument {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setDestroySegmentsAfter(java.lang.Boolean value) {
    try {
      javonetHandle.set("DestroySegmentsAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getDestroySegmentsAfter() {
    try {
      return javonetHandle.get("DestroySegmentsAfter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAutoPlaceCorrectNumOfSegments(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceCorrectNumOfSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceCorrectNumOfSegments() {
    try {
      return javonetHandle.get("AutoPlaceCorrectNumOfSegments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAutoPlaceNumOfTransactions(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceNumOfTransactions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceNumOfTransactions() {
    try {
      return javonetHandle.get("AutoPlaceNumOfTransactions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAutoPlaceNumOfFunctionalGroups(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceNumOfFunctionalGroups", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceNumOfFunctionalGroups() {
    try {
      return javonetHandle.get("AutoPlaceNumOfFunctionalGroups");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setPadISAElementValues(java.lang.Boolean value) {
    try {
      javonetHandle.set("PadISAElementValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPadISAElementValues() {
    try {
      return javonetHandle.get("PadISAElementValues");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setMainSection(DocumentLoop value) {
    try {
      javonetHandle.set("MainSection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DocumentLoop getMainSection() {
    try {
      return new DocumentLoop((NObject) javonetHandle.<NObject>get("MainSection"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TypedEDIDocument() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.TypedEDIDocument");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypedEDIDocument(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToEDIString(WriteArguments args) {
    try {
      return (java.lang.String) javonetHandle.invoke("ToEDIString", args);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToEDIString(Delimiters delimiters) {
    try {
      return (java.lang.String) javonetHandle.invoke("ToEDIString", delimiters);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void GenerateEDIFile(Delimiters delimiters, java.lang.String file) {
    try {
      javonetHandle.invoke("GenerateEDIFile", delimiters, file);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GenerateEDIFile(WriteArguments writeArguments, java.lang.String file) {
    try {
      javonetHandle.invoke("GenerateEDIFile", writeArguments, file);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Load(EDILightWeightDocument lightWeightDocument) {
    try {
      javonetHandle.invoke("Load", lightWeightDocument);
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

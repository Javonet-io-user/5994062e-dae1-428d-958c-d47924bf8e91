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
import jio.System.Collections.Generic.*;

public class DocumentLoop {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getName() {
    try {
      return (java.lang.String) javonetHandle.get("Name");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public List<DocumentLoop> getLoops() {
    try {
      return new List<DocumentLoop>((NObject) javonetHandle.<NObject>get("Loops"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<DocumentSegment> getDocumentSegments() {
    try {
      return new List<DocumentSegment>((NObject) javonetHandle.<NObject>get("DocumentSegments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DocumentLoop(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.DocumentLoop", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DocumentLoop(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public DocumentLoop CreateLoop(java.lang.String name) {
    try {
      return new DocumentLoop((NObject) javonetHandle.invoke("CreateLoop", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T CreateSegment(Class<?> returnType) {
    try {
      return (T) Convert(javonetHandle.generic().invoke("CreateSegment"), returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Add(DocumentSegment segment) {
    try {
      javonetHandle.invoke("Add", segment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Add(DocumentLoop loop) {
    try {
      javonetHandle.invoke("Add", loop);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public List<DocumentLoop> GetLoops(java.lang.String name) {
    try {
      return new List<DocumentLoop>((NObject) javonetHandle.invoke("GetLoops", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DocumentLoop GetLoop(java.lang.String name) {
    try {
      return new DocumentLoop((NObject) javonetHandle.invoke("GetLoop", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<DocumentSegment> GetSegments(java.lang.String name) {
    try {
      return new List<DocumentSegment>((NObject) javonetHandle.invoke("GetSegments", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DocumentSegment GetSegment(java.lang.String name) {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("GetSegment", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <T> T GetSegment(Class<?> returnType) {
    try {
      return (T) Convert(javonetHandle.generic().invoke("GetSegment"), returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      return (java.lang.String) javonetHandle.invoke("ToString");
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

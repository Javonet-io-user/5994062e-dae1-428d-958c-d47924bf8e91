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
import jio.System.Collections.ObjectModel.*;

public class ElementFormat {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setPivotElementOrdinal(java.lang.Integer value) {
    try {
      javonetHandle.set("PivotElementOrdinal", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getPivotElementOrdinal() {
    try {
      return javonetHandle.get("PivotElementOrdinal");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setPivotElementValue(java.lang.String value) {
    try {
      javonetHandle.set("PivotElementValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPivotElementValue() {
    try {
      return (java.lang.String) javonetHandle.get("PivotElementValue");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFormatCollection(Collection<Format> value) {
    try {
      javonetHandle.set("FormatCollection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<Format> getFormatCollection() {
    try {
      return new Collection<Format>((NObject) javonetHandle.<NObject>get("FormatCollection"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElementFormat() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementFormat");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementFormat(java.lang.Integer pivotElementOridinal, java.lang.String pivotElementValue) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.ElementFormat", pivotElementOridinal, pivotElementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementFormat(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetElementFormats(java.lang.Character separator) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetElementFormats", separator);
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

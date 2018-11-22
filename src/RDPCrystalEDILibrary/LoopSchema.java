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

public class LoopSchema {
  protected NObject javonetHandle;
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

  public void setParent(LoopSchema value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LoopSchema getParent() {
    try {
      return new LoopSchema((NObject) javonetHandle.<NObject>get("Parent"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIsSegmentLoop(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsSegmentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSegmentLoop() {
    try {
      return javonetHandle.get("IsSegmentLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setLoopID(java.lang.String value) {
    try {
      javonetHandle.set("LoopID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLoopID() {
    try {
      return (java.lang.String) javonetHandle.get("LoopID");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOccurred(java.lang.Boolean value) {
    try {
      javonetHandle.set("Occurred", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOccurred() {
    try {
      return javonetHandle.get("Occurred");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setMin(java.lang.Integer value) {
    try {
      javonetHandle.set("Min", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMin() {
    try {
      return javonetHandle.get("Min");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setMax(java.lang.Integer value) {
    try {
      javonetHandle.set("Max", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMax() {
    try {
      return javonetHandle.get("Max");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setIndefinite(java.lang.Boolean value) {
    try {
      javonetHandle.set("Indefinite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIndefinite() {
    try {
      return javonetHandle.get("Indefinite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setUsage(Usage value) {
    try {
      javonetHandle.set("Usage", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Usage getUsage() {
    try {
      return Usage.valueOf(((NEnum) javonetHandle.<NEnum>get("Usage")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLoops(Collection<LoopSchema> value) {
    try {
      javonetHandle.set("Loops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<LoopSchema> getLoops() {
    try {
      return new Collection<LoopSchema>((NObject) javonetHandle.<NObject>get("Loops"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegments(Collection<SegmentSchema> value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<SegmentSchema> getSegments() {
    try {
      return new Collection<SegmentSchema>((NObject) javonetHandle.<NObject>get("Segments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public SegmentSchema getLastSegment() {
    try {
      return new SegmentSchema((NObject) javonetHandle.<NObject>get("LastSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LoopSchema() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LoopSchema");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoopSchema(java.lang.String loopID) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LoopSchema", loopID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoopSchema(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public SegmentSchema GetNextSegment(java.lang.Integer currentIndex) {
    try {
      return new SegmentSchema((NObject) javonetHandle.invoke("GetNextSegment", currentIndex));
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

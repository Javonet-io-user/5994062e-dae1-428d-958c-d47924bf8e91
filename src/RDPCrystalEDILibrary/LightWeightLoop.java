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

public class LightWeightLoop {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setParent(LightWeightLoop value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getParent() {
    try {
      return new LightWeightLoop((NObject) javonetHandle.<NObject>get("Parent"));
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

  public void setSegments(LightWeightSegments value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightSegments getSegments() {
    try {
      return new LightWeightSegments((NObject) javonetHandle.<NObject>get("Segments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      return (java.lang.String) javonetHandle.get("Name");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLoops(LightWeightLoops value) {
    try {
      javonetHandle.set("Loops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoops getLoops() {
    try {
      return new LightWeightLoops((NObject) javonetHandle.<NObject>get("Loops"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getLastSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("LastSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getFirstSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("FirstSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LightWeightLoop() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightLoop(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightLoop", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightLoop(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public LightWeightLoop GetLastLoop() {
    try {
      return new LightWeightLoop((NObject) javonetHandle.invoke("GetLastLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoop GetLoop(java.lang.String loopName) {
    try {
      return new LightWeightLoop((NObject) javonetHandle.invoke("GetLoop", loopName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment GetSegment(java.lang.String segmentName) {
    try {
      return new LightWeightSegment((NObject) javonetHandle.invoke("GetSegment", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegments GetSegmentCollection(java.lang.String segmentName) {
    try {
      return new LightWeightSegments(
          (NObject) javonetHandle.invoke("GetSegmentCollection", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegments GetSegments(
      java.lang.String segmentName,
      java.lang.Integer elementPosition,
      java.lang.String elementValue) {
    try {
      return new LightWeightSegments(
          (NObject)
              javonetHandle.invoke("GetSegments", segmentName, elementPosition, elementValue));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoops GetLoopCollection(java.lang.String loopName) {
    try {
      return new LightWeightLoops((NObject) javonetHandle.invoke("GetLoopCollection", loopName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsSegment(java.lang.String segmentName) {
    try {
      return javonetHandle.invoke("ContainsSegment", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public LightWeightLoop CreateLoop(java.lang.String loopName) {
    try {
      return new LightWeightLoop((NObject) javonetHandle.invoke("CreateLoop", loopName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoop CreateLoop() {
    try {
      return new LightWeightLoop((NObject) javonetHandle.invoke("CreateLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment CreateSegment(java.lang.String segmentName) {
    try {
      return new LightWeightSegment((NObject) javonetHandle.invoke("CreateSegment", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment CreateSegmentLoop(java.lang.String segmentName) {
    try {
      return new LightWeightSegment(
          (NObject) javonetHandle.invoke("CreateSegmentLoop", segmentName));
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
  /** Method */

  public java.lang.String ToEDIString(Delimiters delimiters) {
    try {
      return (java.lang.String) javonetHandle.invoke("ToEDIString", delimiters);
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

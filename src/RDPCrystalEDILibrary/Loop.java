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
import jio.System.*;

public class Loop extends LightWeightLoop {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRepetitionIndefinite(java.lang.Boolean value) {
    try {
      javonetHandle.set("RepetitionIndefinite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRepetitionIndefinite() {
    try {
      return javonetHandle.get("RepetitionIndefinite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setParentAsLoop(Loop value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getParentAsLoop() {
    try {
      return new Loop((NObject) javonetHandle.<NObject>get("Parent"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTag(Object value) {
    try {
      javonetHandle.set("Tag", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getTag() {
    try {
      return (Object) javonetHandle.<NObject>get("Tag");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void setSegmentsAsLoop(DataSegments value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DataSegments getSegmentsAsLoop() {
    try {
      return new DataSegments((NObject) javonetHandle.<NObject>get("Segments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void setLoopsAsLoop(Loops value) {
    try {
      javonetHandle.set("Loops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loops getLoopsAsLoop() {
    try {
      return new Loops((NObject) javonetHandle.<NObject>get("Loops"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMinimumOccurrences(java.lang.Integer value) {
    try {
      javonetHandle.set("MinimumOccurrences", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMinimumOccurrences() {
    try {
      return javonetHandle.get("MinimumOccurrences");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setMaximumOccurrences(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumOccurrences", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaximumOccurrences() {
    try {
      return javonetHandle.get("MaximumOccurrences");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public DataSegment getLastSegmentAsLoop() {
    try {
      return new DataSegment((NObject) javonetHandle.<NObject>get("LastSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DataSegment getFirstSegmentAsLoop() {
    try {
      return new DataSegment((NObject) javonetHandle.<NObject>get("FirstSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Loop() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(java.lang.String name, java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop", name, description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Loop Loop___GetLastLoop() {
    try {
      return new Loop((NObject) javonetHandle.invoke("GetLastLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___GetLoop(java.lang.String loopName) {
    try {
      return new Loop((NObject) javonetHandle.invoke("GetLoop", loopName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___GetSegment(java.lang.String segmentName) {
    try {
      return new DataSegment((NObject) javonetHandle.invoke("GetSegment", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetSegmentPosition(DataSegment segment) {
    try {
      return javonetHandle.invoke("GetSegmentPosition", segment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Collection<DataSegment> Loop___GetSegmentCollection(java.lang.String segmentName) {
    try {
      return new Collection<DataSegment>(
          (NObject) javonetHandle.invoke("GetSegmentCollection", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegments Loop___GetSegments(
      java.lang.String segmentName,
      java.lang.Integer elementPosition,
      java.lang.String elementValue) {
    try {
      return new DataSegments(
          (NObject)
              javonetHandle.invoke("GetSegments", segmentName, elementPosition, elementValue));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Collection<Loop> Loop___GetLoopCollection(java.lang.String loopName) {
    try {
      return new Collection<Loop>((NObject) javonetHandle.invoke("GetLoopCollection", loopName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___GetSegment(java.lang.Integer segmentOridinalNumber) {
    try {
      return new DataSegment((NObject) javonetHandle.invoke("GetSegment", segmentOridinalNumber));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment GetNextSegment(java.lang.Integer currentIndex) {
    try {
      return new DataSegment((NObject) javonetHandle.invoke("GetNextSegment", currentIndex));
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

  public DataSegment Loop___CreateSegment(java.lang.String segmentName) {
    try {
      return new DataSegment((NObject) javonetHandle.invoke("CreateSegment", segmentName));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___CreateSegment(
      java.lang.String segmentName,
      java.lang.Integer min,
      java.lang.Integer max,
      Usage usage,
      java.lang.String description) {
    try {
      return new DataSegment(
          (NObject)
              javonetHandle.invoke(
                  "CreateSegment", segmentName, min, max, NEnum.fromJavaEnum(usage), description));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___CreateSegmentLoop(
      java.lang.String segmentName,
      java.lang.Integer min,
      java.lang.Integer max,
      Usage usage,
      java.lang.String description) {
    try {
      return new DataSegment(
          (NObject)
              javonetHandle.invoke(
                  "CreateSegmentLoop",
                  segmentName,
                  min,
                  max,
                  NEnum.fromJavaEnum(usage),
                  description));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop(java.lang.String name) {
    try {
      return new Loop((NObject) javonetHandle.invoke("CreateLoop", name));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop() {
    try {
      return new Loop((NObject) javonetHandle.invoke("CreateLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop(java.lang.String name, java.lang.String description) {
    try {
      return new Loop((NObject) javonetHandle.invoke("CreateLoop", name, description));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop GetSiblingAbove() {
    try {
      return new Loop((NObject) javonetHandle.invoke("GetSiblingAbove"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetChildPosition(Loop childLoop) {
    try {
      return javonetHandle.invoke("GetChildPosition", childLoop);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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

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

public class FoundSegmentCollection extends Collection<LightWeightSegment> {
  protected NObject javonetHandle;

  public FoundSegmentCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FoundSegmentCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FoundSegmentCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public LightWeightSegment GetLastOccurrence(java.lang.Integer segmentOrdinalNumber) {
    try {
      return new LightWeightSegment(
          (NObject) javonetHandle.invoke("GetLastOccurrence", segmentOrdinalNumber));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment GetLastDataSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.invoke("GetLastDataSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void RemoveSegment(java.lang.Integer segmentOrdinalNumber) {
    try {
      javonetHandle.invoke("RemoveSegment", segmentOrdinalNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveHLSegment(java.lang.Integer segmentOrdinalNumber) {
    try {
      javonetHandle.invoke("RemoveHLSegment", segmentOrdinalNumber);
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

package RDPCrystalEDILibrary.Rules;

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
import jio.System.*;
import RDPCrystalEDILibrary.Rules.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class CodeConditionEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCodeCondition(CodeCondition value) {
    try {
      javonetHandle.set("CodeCondition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CodeCondition getCodeCondition() {
    try {
      return new CodeCondition((NObject) javonetHandle.<NObject>get("CodeCondition"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDataLoop(LightWeightLoop value) {
    try {
      javonetHandle.set("DataLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getDataLoop() {
    try {
      return new LightWeightLoop((NObject) javonetHandle.<NObject>get("DataLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentSegmentSchema(DataSegment value) {
    try {
      javonetHandle.set("CurrentSegmentSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DataSegment getCurrentSegmentSchema() {
    try {
      return new DataSegment((NObject) javonetHandle.<NObject>get("CurrentSegmentSchema"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentSegment(LightWeightSegment value) {
    try {
      javonetHandle.set("CurrentSegment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightSegment getCurrentSegment() {
    try {
      return new LightWeightSegment((NObject) javonetHandle.<NObject>get("CurrentSegment"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentLoop(Loop value) {
    try {
      javonetHandle.set("CurrentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getCurrentLoop() {
    try {
      return new Loop((NObject) javonetHandle.<NObject>get("CurrentLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFoundSegments(FoundSegmentCollection value) {
    try {
      javonetHandle.set("FoundSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FoundSegmentCollection getFoundSegments() {
    try {
      return new FoundSegmentCollection((NObject) javonetHandle.<NObject>get("FoundSegments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFoundElements(Dictionary<java.lang.Integer, java.lang.String> value) {
    try {
      javonetHandle.set("FoundElements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.Integer, java.lang.String> getFoundElements() {
    try {
      return new Dictionary<java.lang.Integer, java.lang.String>(
          (NObject) javonetHandle.<NObject>get("FoundElements"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setConditionValid(java.lang.Boolean value) {
    try {
      javonetHandle.set("ConditionValid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getConditionValid() {
    try {
      return javonetHandle.get("ConditionValid");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CodeConditionEventArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.CodeConditionEventArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CodeConditionEventArgs(NObject handle) {
    super(handle);
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

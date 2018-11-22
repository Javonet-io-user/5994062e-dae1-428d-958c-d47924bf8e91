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
import RDPCrystalEDILibrary.Rules.*;

public class SegmentSchema {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setPosition(java.lang.String value) {
    try {
      javonetHandle.set("Position", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPosition() {
    try {
      return (java.lang.String) javonetHandle.get("Position");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setOnlySegmentInLoop(java.lang.Boolean value) {
    try {
      javonetHandle.set("OnlySegmentInLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOnlySegmentInLoop() {
    try {
      return javonetHandle.get("OnlySegmentInLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** GetProperty */

  public java.lang.Integer getOridinalNumber() {
    try {
      return javonetHandle.get("OridinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
  /** SetProperty */

  public void setRepeatIndefinite(java.lang.Boolean value) {
    try {
      javonetHandle.set("RepeatIndefinite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRepeatIndefinite() {
    try {
      return javonetHandle.get("RepeatIndefinite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setRules(Collection<SemanticRule> value) {
    try {
      javonetHandle.set("Rules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<SemanticRule> getRules() {
    try {
      return new Collection<SemanticRule>((NObject) javonetHandle.<NObject>get("Rules"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGeneralRules(Collection<GeneralRule> value) {
    try {
      javonetHandle.set("GeneralRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<GeneralRule> getGeneralRules() {
    try {
      return new Collection<GeneralRule>((NObject) javonetHandle.<NObject>get("GeneralRules"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void setMaskNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("MaskNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaskNumber() {
    try {
      return javonetHandle.get("MaskNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SegmentSchema() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SegmentSchema");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SegmentSchema", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName, Usage usage) {
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.SegmentSchema", segmentName, NEnum.fromJavaEnum(usage));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName, Usage usage, java.lang.Integer maskNumber) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.SegmentSchema",
              segmentName,
              NEnum.fromJavaEnum(usage),
              maskNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(NObject handle) {
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

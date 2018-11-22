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

public class Segment {
  protected NObject javonetHandle;
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

  public void setLoopValidationIndex(java.lang.Integer value) {
    try {
      javonetHandle.set("LoopValidationIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLoopValidationIndex() {
    try {
      return javonetHandle.get("LoopValidationIndex");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSelfRules(Collection<SelfRule> value) {
    try {
      javonetHandle.set("SelfRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<SelfRule> getSelfRules() {
    try {
      return new Collection<SelfRule>((NObject) javonetHandle.<NObject>get("SelfRules"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGeneralSelfRules(Collection<GeneralSelfRule> value) {
    try {
      javonetHandle.set("GeneralSelfRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<GeneralSelfRule> getGeneralSelfRules() {
    try {
      return new Collection<GeneralSelfRule>(
          (NObject) javonetHandle.<NObject>get("GeneralSelfRules"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementExclusionConstraints(Collection<ElementExclusionConstraint> value) {
    try {
      javonetHandle.set("ElementExclusionConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementExclusionConstraint> getElementExclusionConstraints() {
    try {
      return new Collection<ElementExclusionConstraint>(
          (NObject) javonetHandle.<NObject>get("ElementExclusionConstraints"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementListConditionConstraints(
      Collection<ElementListConditionalConstraint> value) {
    try {
      javonetHandle.set("ElementListConditionConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementListConditionalConstraint> getElementListConditionConstraints() {
    try {
      return new Collection<ElementListConditionalConstraint>(
          (NObject) javonetHandle.<NObject>get("ElementListConditionConstraints"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setModified(java.lang.Boolean value) {
    try {
      javonetHandle.set("Modified", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getModified() {
    try {
      return javonetHandle.get("Modified");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setElementRequiredConstraints(Collection<ElementRequiredConstraint> value) {
    try {
      javonetHandle.set("ElementRequiredConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementRequiredConstraint> getElementRequiredConstraints() {
    try {
      return new Collection<ElementRequiredConstraint>(
          (NObject) javonetHandle.<NObject>get("ElementRequiredConstraints"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementPairConstraints(Collection<ElementPairConstraint> value) {
    try {
      javonetHandle.set("ElementPairConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementPairConstraint> getElementPairConstraints() {
    try {
      return new Collection<ElementPairConstraint>(
          (NObject) javonetHandle.<NObject>get("ElementPairConstraints"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementConditionalConstraints(Collection<ElementConditionalConstraint> value) {
    try {
      javonetHandle.set("ElementConditionalConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementConditionalConstraint> getElementConditionalConstraints() {
    try {
      return new Collection<ElementConditionalConstraint>(
          (NObject) javonetHandle.<NObject>get("ElementConditionalConstraints"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementSchema(Collection<ElementSchema> value) {
    try {
      javonetHandle.set("ElementSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementSchema> getElementSchema() {
    try {
      return new Collection<ElementSchema>((NObject) javonetHandle.<NObject>get("ElementSchema"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMasks(Collection<Mask> value) {
    try {
      javonetHandle.set("Masks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<Mask> getMasks() {
    try {
      return new Collection<Mask>((NObject) javonetHandle.<NObject>get("Masks"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Segment() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Segment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Segment(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Segment", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Segment(NObject handle) {
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

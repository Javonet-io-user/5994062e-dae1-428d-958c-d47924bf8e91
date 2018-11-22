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
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class EDIRulesCreator extends Component {
  protected NObject javonetHandle;
  /** GetProperty */
  public List<ElementCounterDisplay> getElementCounterDisplays() {
    try {
      return new List<ElementCounterDisplay>(
          (NObject) javonetHandle.<NObject>get("ElementCounterDisplays"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<SummaryDisplay> getSummaries() {
    try {
      return new List<SummaryDisplay>((NObject) javonetHandle.<NObject>get("Summaries"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<RuleDisplay> getRules() {
    try {
      return new List<RuleDisplay>((NObject) javonetHandle.<NObject>get("Rules"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<ElementEqualityDisplay> getElementEqualities() {
    try {
      return new List<ElementEqualityDisplay>(
          (NObject) javonetHandle.<NObject>get("ElementEqualities"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEDIRuleFileData(Dictionary<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("EDIRuleFileData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getEDIRuleFileData() {
    try {
      return new Dictionary<java.lang.String, java.lang.String>(
          (NObject) javonetHandle.<NObject>get("EDIRuleFileData"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElements(SortedDictionary<java.lang.Integer, Element> value) {
    try {
      javonetHandle.set("Elements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SortedDictionary<java.lang.Integer, Element> getElements() {
    try {
      return new SortedDictionary<java.lang.Integer, Element>(
          (NObject) javonetHandle.<NObject>get("Elements"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCompositeSegments(SortedDictionary<java.lang.String, Segment> value) {
    try {
      javonetHandle.set("CompositeSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SortedDictionary<java.lang.String, Segment> getCompositeSegments() {
    try {
      return new SortedDictionary<java.lang.String, Segment>(
          (NObject) javonetHandle.<NObject>get("CompositeSegments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegments(SortedDictionary<java.lang.String, Segment> value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SortedDictionary<java.lang.String, Segment> getSegments() {
    try {
      return new SortedDictionary<java.lang.String, Segment>(
          (NObject) javonetHandle.<NObject>get("Segments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLoopSchema(LoopSchema value) {
    try {
      javonetHandle.set("LoopSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LoopSchema getLoopSchema() {
    try {
      return new LoopSchema((NObject) javonetHandle.<NObject>get("LoopSchema"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMainLoop(Loop value) {
    try {
      javonetHandle.set("MainLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getMainLoop() {
    try {
      return new Loop((NObject) javonetHandle.<NObject>get("MainLoop"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegmentSchemas(Dictionary<java.lang.Integer, SegmentSchema> value) {
    try {
      javonetHandle.set("SegmentSchemas", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.Integer, SegmentSchema> getSegmentSchemas() {
    try {
      return new Dictionary<java.lang.Integer, SegmentSchema>(
          (NObject) javonetHandle.<NObject>get("SegmentSchemas"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCodeLists(Dictionary<java.lang.String, CodeList> value) {
    try {
      javonetHandle.set("CodeLists", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, CodeList> getCodeLists() {
    try {
      return new Dictionary<java.lang.String, CodeList>(
          (NObject) javonetHandle.<NObject>get("CodeLists"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getElementFormats() {
    try {
      return new Dictionary<java.lang.String, java.lang.String>(
          (NObject) javonetHandle.<NObject>get("ElementFormats"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEDIRuleFilename(java.lang.String value) {
    try {
      javonetHandle.set("EDIRuleFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEDIRuleFilename() {
    try {
      return (java.lang.String) javonetHandle.get("EDIRuleFilename");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSaveFilename(java.lang.String value) {
    try {
      javonetHandle.set("SaveFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSaveFilename() {
    try {
      return (java.lang.String) javonetHandle.get("SaveFilename");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSampleData(List<java.lang.String> value) {
    try {
      javonetHandle.set("SampleData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public List<java.lang.String> getSampleData() {
    try {
      return new List<java.lang.String>((NObject) javonetHandle.<NObject>get("SampleData"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public EDIRulesCreator() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesCreator");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesCreator(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesCreator", container);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesCreator(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void LoadFile() {
    try {
      javonetHandle.invoke("LoadFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LoadFile(java.lang.String EDIRulesFilename) {
    try {
      javonetHandle.invoke("LoadFile", EDIRulesFilename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CreateFile() {
    try {
      javonetHandle.invoke("CreateFile");
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

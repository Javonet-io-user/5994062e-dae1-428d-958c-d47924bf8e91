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
import jio.System.IO.*;
import jio.System.*;

public class EDIRulesReader extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setLoadDescriptions(java.lang.Boolean value) {
    try {
      javonetHandle.set("LoadDescriptions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getLoadDescriptions() {
    try {
      return javonetHandle.get("LoadDescriptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** GetProperty */

  public java.lang.Boolean getParsed() {
    try {
      return javonetHandle.get("Parsed");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Integer getNumberOfLoopsCreated() {
    try {
      return javonetHandle.get("NumberOfLoopsCreated");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
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

  public List<ElementEqualityDisplay> getElementEqualities() {
    try {
      return new List<ElementEqualityDisplay>(
          (NObject) javonetHandle.<NObject>get("ElementEqualities"));
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

  public SortedDictionary<java.lang.Integer, Element> getElements() {
    try {
      return new SortedDictionary<java.lang.Integer, Element>(
          (NObject) javonetHandle.<NObject>get("Elements"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void setRuleFileData(Dictionary<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("RuleFileData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getRuleFileData() {
    try {
      return new Dictionary<java.lang.String, java.lang.String>(
          (NObject) javonetHandle.<NObject>get("RuleFileData"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public SortedDictionary<java.lang.String, Segment> getCompositesSegments() {
    try {
      return new SortedDictionary<java.lang.String, Segment>(
          (NObject) javonetHandle.<NObject>get("CompositesSegments"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, ElementCodeList> getElementCodes() {
    try {
      return new Dictionary<java.lang.String, ElementCodeList>(
          (NObject) javonetHandle.<NObject>get("ElementCodes"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getFileData() {
    try {
      return new Dictionary<java.lang.String, java.lang.String>(
          (NObject) javonetHandle.<NObject>get("FileData"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** GetProperty */

  public Loop getSchema() {
    try {
      return new Loop((NObject) javonetHandle.<NObject>get("Schema"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEDIRulesFilePath(java.lang.String value) {
    try {
      javonetHandle.set("EDIRulesFilePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEDIRulesFilePath() {
    try {
      return (java.lang.String) javonetHandle.get("EDIRulesFilePath");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEDIRulesFile(Stream value) {
    try {
      javonetHandle.set("EDIRulesFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Stream getEDIRulesFile() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.<NObject>get("EDIRulesFile"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEDIRulesFileData(java.lang.String value) {
    try {
      javonetHandle.set("EDIRulesFileData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEDIRulesFileData() {
    try {
      return (java.lang.String) javonetHandle.get("EDIRulesFileData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public EDIRulesReader(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader(java.lang.String ediRuleFilePath) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader", ediRuleFilePath);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Parse(java.lang.String rulesFilePath) {
    try {
      javonetHandle.invoke("Parse", rulesFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Parse() {
    try {
      javonetHandle.invoke("Parse");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<GeneralEvent> _ProgressChangedListeners =
      new java.util.ArrayList<GeneralEvent>();

  public void addProgressChanged(GeneralEvent toAdd) {
    _ProgressChangedListeners.add(toAdd);
  }

  public void removeProgressChanged(GeneralEvent toRemove) {
    _ProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<ErrorEvent> _OnErrorOccurredListeners =
      new java.util.ArrayList<ErrorEvent>();

  public void addOnErrorOccurred(ErrorEvent toAdd) {
    _OnErrorOccurredListeners.add(toAdd);
  }

  public void removeOnErrorOccurred(ErrorEvent toRemove) {
    _OnErrorOccurredListeners.remove(toRemove);
  }

  public interface GeneralEvent {
    public void Invoke(java.lang.Integer progress);
  }

  public interface ErrorEvent {
    public void Invoke(Object sender, EDIRulesReaderEventArg e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

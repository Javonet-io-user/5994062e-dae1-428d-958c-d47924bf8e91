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
import jio.System.IO.*;
import jio.System.Xml.*;
import jio.System.*;

public class EDILightWeightDocument extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCreator(DocumentCreator value) {
    try {
      javonetHandle.set("Creator", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DocumentCreator getCreator() {
    try {
      return DocumentCreator.valueOf(((NEnum) javonetHandle.<NEnum>get("Creator")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** SetProperty */

  public void setDelimiters(Delimiters value) {
    try {
      javonetHandle.set("Delimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Delimiters getDelimiters() {
    try {
      return new Delimiters((NObject) javonetHandle.<NObject>get("Delimiters"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFileBufferSize(java.lang.Integer value) {
    try {
      javonetHandle.set("FileBufferSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getFileBufferSize() {
    try {
      return javonetHandle.get("FileBufferSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setAutoPlaceCorrectNumOfSegments(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceCorrectNumOfSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceCorrectNumOfSegments() {
    try {
      return javonetHandle.get("AutoPlaceCorrectNumOfSegments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAutoPlaceCorrectNumOfST(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceCorrectNumOfST", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceCorrectNumOfST() {
    try {
      return javonetHandle.get("AutoPlaceCorrectNumOfST");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setAutoPlaceCorrectNumOfGT(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceCorrectNumOfGT", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoPlaceCorrectNumOfGT() {
    try {
      return javonetHandle.get("AutoPlaceCorrectNumOfGT");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setNewLineAfterSegment(java.lang.Boolean value) {
    try {
      javonetHandle.set("NewLineAfterSegment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getNewLineAfterSegment() {
    try {
      return javonetHandle.get("NewLineAfterSegment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFileString() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFileString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFileStream(FileStream value) {
    try {
      javonetHandle.set("FileStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileStream getFileStream() {
    try {
      return new FileStream((NObject) javonetHandle.<NObject>get("FileStream"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setEDIFilePath(java.lang.String value) {
    try {
      javonetHandle.set("EDIFilePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEDIFilePath() {
    try {
      return (java.lang.String) javonetHandle.get("EDIFilePath");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public EDILightWeightDocument() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDILightWeightDocument");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "EDIDocumentFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GeneralEvent handler : _EDIDocumentFinishedListeners) {
                handler.Invoke(Convert(objects[0], Object.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDILightWeightDocument(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDILightWeightDocument", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "EDIDocumentFinished",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GeneralEvent handler : _EDIDocumentFinishedListeners) {
                handler.Invoke(Convert(objects[0], Object.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDILightWeightDocument(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GenerateEDIData() {
    try {
      return (java.lang.String) javonetHandle.invoke("GenerateEDIData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void GenerateEDIFile(FileStream stream) {
    try {
      javonetHandle.invoke("GenerateEDIFile", stream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GenerateEDIFile(java.lang.String outputFile) {
    try {
      javonetHandle.invoke("GenerateEDIFile", outputFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public XmlDocument ToXml() {
    try {
      return new XmlDocument((NObject) javonetHandle.invoke("ToXml"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ToXml(java.lang.String file) {
    try {
      javonetHandle.invoke("ToXml", file);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ToXml(java.lang.String file, XmlConfigOptions options) {
    try {
      javonetHandle.invoke("ToXml", file, options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public XmlDocument ToXml(XmlConfigOptions options) {
    try {
      return new XmlDocument((NObject) javonetHandle.invoke("ToXml", options));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GenerateEDIFileWithBatchWrite() {
    try {
      javonetHandle.invoke("GenerateEDIFileWithBatchWrite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GenerateEDIFile() {
    try {
      javonetHandle.invoke("GenerateEDIFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<GeneralEvent> _EDIDocumentFinishedListeners =
      new java.util.ArrayList<GeneralEvent>();

  public void addEDIDocumentFinished(GeneralEvent toAdd) {
    _EDIDocumentFinishedListeners.add(toAdd);
  }

  public void removeEDIDocumentFinished(GeneralEvent toRemove) {
    _EDIDocumentFinishedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

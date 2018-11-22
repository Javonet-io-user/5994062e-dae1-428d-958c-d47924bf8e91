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
import jio.System.*;

public class EDIFileJoiner extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAutoDetectDelimiters(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoDetectDelimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoDetectDelimiters() {
    try {
      return javonetHandle.get("AutoDetectDelimiters");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public void setTrimString(java.lang.String value) {
    try {
      javonetHandle.set("TrimString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTrimString() {
    try {
      return (java.lang.String) javonetHandle.get("TrimString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAutoGenerateSTControlNumber(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoGenerateSTControlNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAutoGenerateSTControlNumber() {
    try {
      return javonetHandle.get("AutoGenerateSTControlNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setFileJoinLevel(FileJoinLevel value) {
    try {
      javonetHandle.set("FileJoinLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileJoinLevel getFileJoinLevel() {
    try {
      return FileJoinLevel.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("FileJoinLevel")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setReadBlockSize(java.lang.Integer value) {
    try {
      javonetHandle.set("ReadBlockSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getReadBlockSize() {
    try {
      return javonetHandle.get("ReadBlockSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setNewFileBufferSize(java.lang.Integer value) {
    try {
      javonetHandle.set("NewFileBufferSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getNewFileBufferSize() {
    try {
      return javonetHandle.get("NewFileBufferSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setEachSegmentInNewLine(java.lang.Boolean value) {
    try {
      javonetHandle.set("EachSegmentInNewLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getEachSegmentInNewLine() {
    try {
      return javonetHandle.get("EachSegmentInNewLine");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public EDIFileJoiner() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileJoiner");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnFileOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<FileOperationCompletedEventArgs> handler :
                  _OnFileOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FileOperationCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileJoiner(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileJoiner", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnFileOperationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<FileOperationCompletedEventArgs> handler :
                  _OnFileOperationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], FileOperationCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileJoiner(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Join(List<java.lang.String> files, java.lang.String outputFile, Object state) {
    try {
      javonetHandle.invoke("Join", files, outputFile, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Join(List<java.lang.String> files, java.lang.String outputFile) {
    try {
      javonetHandle.invoke("Join", files, outputFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void JoinAsync(List<java.lang.String> files, java.lang.String outputFile, Object state) {
    try {
      javonetHandle.invoke("JoinAsync", files, outputFile, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String JoinStrings(List<java.lang.String> ediDataStrings) {
    try {
      return (java.lang.String) javonetHandle.invoke("JoinStrings", ediDataStrings);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Event */

  private java.util.ArrayList<EventHandler<FileOperationCompletedEventArgs>>
      _OnFileOperationCompletedListeners =
          new java.util.ArrayList<EventHandler<FileOperationCompletedEventArgs>>();

  public void addOnFileOperationCompleted(EventHandler<FileOperationCompletedEventArgs> toAdd) {
    _OnFileOperationCompletedListeners.add(toAdd);
  }

  public void removeOnFileOperationCompleted(
      EventHandler<FileOperationCompletedEventArgs> toRemove) {
    _OnFileOperationCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

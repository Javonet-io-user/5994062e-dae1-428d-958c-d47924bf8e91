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
import jio.System.*;

public class EDIFileSplitter extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setEDIFileType(FileType value) {
    try {
      javonetHandle.set("EDIFileType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileType getEDIFileType() {
    try {
      return FileType.valueOf(((NEnum) javonetHandle.<NEnum>get("EDIFileType")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOutputFilename(java.lang.String value) {
    try {
      javonetHandle.set("OutputFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOutputFilename() {
    try {
      return (java.lang.String) javonetHandle.get("OutputFilename");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setGeneratePseudoRandomNumberInFilename(java.lang.Boolean value) {
    try {
      javonetHandle.set("GeneratePseudoRandomNumberInFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getGeneratePseudoRandomNumberInFilename() {
    try {
      return javonetHandle.get("GeneratePseudoRandomNumberInFilename");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setOutputFilenameFormat(java.lang.String value) {
    try {
      javonetHandle.set("OutputFilenameFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOutputFilenameFormat() {
    try {
      return (java.lang.String) javonetHandle.get("OutputFilenameFormat");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNumberOfItemsPerFile(java.lang.Integer value) {
    try {
      javonetHandle.set("NumberOfItemsPerFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getNumberOfItemsPerFile() {
    try {
      return javonetHandle.get("NumberOfItemsPerFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSplitFileExtension(java.lang.String value) {
    try {
      javonetHandle.set("SplitFileExtension", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSplitFileExtension() {
    try {
      return (java.lang.String) javonetHandle.get("SplitFileExtension");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setFileSplitLevel(FileSplitLevel value) {
    try {
      javonetHandle.set("FileSplitLevel", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileSplitLevel getFileSplitLevel() {
    try {
      return FileSplitLevel.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("FileSplitLevel")).getValueName());
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

  public void setWriteBlockBuffer(java.lang.Integer value) {
    try {
      javonetHandle.set("WriteBlockBuffer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getWriteBlockBuffer() {
    try {
      return javonetHandle.get("WriteBlockBuffer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public EDIFileSplitter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileSplitter");
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

  public EDIFileSplitter(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileSplitter", container);
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

  public EDIFileSplitter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Split(java.lang.String file, java.lang.String outputDirectory) {
    try {
      javonetHandle.invoke("Split", file, outputDirectory);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Split(java.lang.String file, java.lang.String outputDirectory, Object state) {
    try {
      javonetHandle.invoke("Split", file, outputDirectory, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SplitAsync(java.lang.String file, java.lang.String outputDirectory, Object state) {
    try {
      javonetHandle.invoke("SplitAsync", file, outputDirectory, state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

package jio.System.Net;

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
import jio.System.Collections.Specialized.*;
import jio.System.Net.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;

public class WebHeaderCollection extends NameValueCollection
    implements ICollection, IEnumerable, ISerializable, IDeserializationCallback {
  protected NObject javonetHandle;

  public WebHeaderCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Net.WebHeaderCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WebHeaderCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ISerializable_GetObjectData(
      SerializationInfo serializationInfo, StreamingContext streamingContext) {
    try {
      javonetHandle.invoke(
          "System.Runtime.Serialization.ISerializable.GetObjectData",
          serializationInfo,
          streamingContext);
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

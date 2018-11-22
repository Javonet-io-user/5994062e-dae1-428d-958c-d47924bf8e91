package jio.System.Collections.Specialized;

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
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Collections.*;

public abstract class NameObjectCollectionBase
    implements ICollection, IEnumerable, ISerializable, IDeserializationCallback {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getCount() {
    try {
      return javonetHandle.get("Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public KeysCollection getKeys() {
    try {
      return new KeysCollection((NObject) javonetHandle.<NObject>get("Keys"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NameObjectCollectionBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ISerializable_GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle.invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(Object sender) {
    try {
      javonetHandle.invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ICollection_CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("System.Collections.ICollection.CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object ICollection_get_SyncRoot() {
    try {
      return (Object) javonetHandle.invoke("System.Collections.ICollection.get_SyncRoot");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ICollection_get_IsSynchronized() {
    try {
      return javonetHandle.invoke("System.Collections.ICollection.get_IsSynchronized");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public static class KeysCollection implements ICollection, IEnumerable {
    protected NObject javonetHandle;
    /** GetProperty */
    public java.lang.String get_Item(java.lang.Integer index) {
      try {
        return (java.lang.String) javonetHandle.invoke("get_Item", index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** GetProperty */

    public java.lang.Integer getCount() {
      try {
        return javonetHandle.get("Count");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }

    public KeysCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.String Get(java.lang.Integer index) {
      try {
        return (java.lang.String) javonetHandle.invoke("Get", index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** Method */

    public IEnumerator GetEnumerator() {
      try {
        return ConvertToConcreteInterfaceImplementation(
            (NObject) javonetHandle.invoke("GetEnumerator"));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("System.Collections.ICollection.CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_SyncRoot() {
      try {
        return (Object) javonetHandle.invoke("System.Collections.ICollection.get_SyncRoot");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public java.lang.Boolean get_IsSynchronized() {
      try {
        return javonetHandle.invoke("System.Collections.ICollection.get_IsSynchronized");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
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

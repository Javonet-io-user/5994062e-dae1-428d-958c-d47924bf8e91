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
import jio.System.*;
import jio.System.Collections.*;

public class NameValueCollection extends NameObjectCollectionBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_Item(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("set_Item", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String get_Item(java.lang.String name) {
    try {
      return (java.lang.String) javonetHandle.invoke("get_Item", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
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

  public java.lang.String[] getAllKeys() {
    try {
      return Helper.ConvertNObjectToDestinationType(
          (NObject[]) javonetHandle.<NObject[]>get("AllKeys"), java.lang.String[].class);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NameValueCollection() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(NameValueCollection col) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection", col);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(IHashCodeProvider hashProvider, IComparer comparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", hashProvider, comparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Collections.Specialized.NameValueCollection", capacity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(IEqualityComparer equalityComparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", equalityComparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity, IEqualityComparer equalityComparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NameValueCollection", capacity, equalityComparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(java.lang.Integer capacity, NameValueCollection col) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Collections.Specialized.NameValueCollection", capacity, col);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(
      java.lang.Integer capacity, IHashCodeProvider hashProvider, IComparer comparer) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Collections.Specialized.NameValueCollection",
              capacity,
              hashProvider,
              comparer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NameValueCollection(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(NameValueCollection c) {
    try {
      javonetHandle.invoke("Add", c);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array dest, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", dest, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean HasKeys() {
    try {
      return javonetHandle.invoke("HasKeys");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Add(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("Add", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String Get(java.lang.String name) {
    try {
      return (java.lang.String) javonetHandle.invoke("Get", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String[] GetValues(java.lang.String name) {
    try {
      return Helper.ConvertNObjectToDestinationType(
          (NObject[]) javonetHandle.invoke("GetValues", name), java.lang.String[].class);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Set(java.lang.String name, java.lang.String value) {
    try {
      javonetHandle.invoke("Set", name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(java.lang.String name) {
    try {
      javonetHandle.invoke("Remove", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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

  public java.lang.String[] GetValues(java.lang.Integer index) {
    try {
      return Helper.ConvertNObjectToDestinationType(
          (NObject[]) javonetHandle.invoke("GetValues", index), java.lang.String[].class);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String GetKey(java.lang.Integer index) {
    try {
      return (java.lang.String) javonetHandle.invoke("GetKey", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

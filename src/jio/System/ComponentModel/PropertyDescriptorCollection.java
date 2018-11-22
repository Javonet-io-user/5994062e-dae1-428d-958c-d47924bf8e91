package jio.System.ComponentModel;

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
import jio.System.Collections.*;
import jio.System.*;

public class PropertyDescriptorCollection implements ICollection, IEnumerable, IList, IDictionary {
  protected NObject javonetHandle;

  public PropertyDescriptorCollection(PropertyDescriptor[] properties) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.PropertyDescriptorCollection", new Object[] {properties});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyDescriptorCollection(PropertyDescriptor[] properties, java.lang.Boolean readOnly) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.PropertyDescriptorCollection",
              new Object[] {properties},
              readOnly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyDescriptorCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer ICollection_get_Count() {
    try {
      return javonetHandle.invoke("System.Collections.ICollection.get_Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IEnumerable.GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IList_get_Item(java.lang.Integer index) {
    try {
      return (Object) javonetHandle.invoke("System.Collections.IList.get_Item", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IList_set_Item(java.lang.Integer index, Object value) {
    try {
      javonetHandle.invoke("System.Collections.IList.set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IList_Add(Object value) {
    try {
      return javonetHandle.invoke("System.Collections.IList.Add", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean IList_Contains(Object value) {
    try {
      return javonetHandle.invoke("System.Collections.IList.Contains", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IList_Clear() {
    try {
      javonetHandle.invoke("System.Collections.IList.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsReadOnly() {
    try {
      return javonetHandle.invoke("System.Collections.IList.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsFixedSize() {
    try {
      return javonetHandle.invoke("System.Collections.IList.get_IsFixedSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer IList_IndexOf(Object value) {
    try {
      return javonetHandle.invoke("System.Collections.IList.IndexOf", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void IList_Insert(java.lang.Integer index, Object value) {
    try {
      javonetHandle.invoke("System.Collections.IList.Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_Remove(Object value) {
    try {
      javonetHandle.invoke("System.Collections.IList.Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.invoke("System.Collections.IList.RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object IDictionary_get_Item(Object key) {
    try {
      return (Object) javonetHandle.invoke("System.Collections.IDictionary.get_Item", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IDictionary_set_Item(Object key, Object value) {
    try {
      javonetHandle.invoke("System.Collections.IDictionary.set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ICollection IDictionary_get_Keys() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IDictionary.get_Keys"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ICollection IDictionary_get_Values() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IDictionary.get_Values"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_Contains(Object key) {
    try {
      return javonetHandle.invoke("System.Collections.IDictionary.Contains", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IDictionary_Add(Object key, Object value) {
    try {
      javonetHandle.invoke("System.Collections.IDictionary.Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("System.Collections.IDictionary.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_get_IsReadOnly() {
    try {
      return javonetHandle.invoke("System.Collections.IDictionary.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_get_IsFixedSize() {
    try {
      return javonetHandle.invoke("System.Collections.IDictionary.get_IsFixedSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IDictionary.GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IDictionary_Remove(Object key) {
    try {
      javonetHandle.invoke("System.Collections.IDictionary.Remove", key);
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

package jio.System.Collections.Generic;

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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class SortedDictionary<TKey, TValue>
    implements jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_Item(TKey key, TValue value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TValue get_Item(TKey key, Class<?> returnType) {
    try {
      return (TValue) Convert(javonetHandle.invoke("get_Item", key), returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** GetProperty */

  public jio.System.Collections.Generic.IComparer<TKey> getComparer() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.<NObject>get("Comparer"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public KeyCollection<TKey, TValue> getKeys() {
    try {
      return new KeyCollection<TKey, TValue>((NObject) javonetHandle.<NObject>get("Keys"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ValueCollection<TKey, TValue> getValues() {
    try {
      return new ValueCollection<TKey, TValue>((NObject) javonetHandle.<NObject>get("Values"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public SortedDictionary(Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedDictionary`2",
                  getGetObjectName(TKey),
                  getGetObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public SortedDictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedDictionary`2",
                  getGetObjectName(TKey),
                  getGetObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public SortedDictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      jio.System.Collections.Generic.IComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedDictionary`2",
                  getGetObjectName(TKey),
                  getGetObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public SortedDictionary(
      jio.System.Collections.Generic.IComparer<TKey> comparer, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.SortedDictionary`2",
                  getGetObjectName(TKey),
                  getGetObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedDictionary(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(TKey key, TValue value) {
    try {
      javonetHandle.invoke("Add", key, value);
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

  public java.lang.Boolean ContainsKey(TKey key) {
    try {
      return javonetHandle.invoke("ContainsKey", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsValue(TValue value) {
    try {
      return javonetHandle.invoke("ContainsValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(KeyValuePair[] array, java.lang.Integer index) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Enumerator<TKey, TValue> GetEnumerator() {
    try {
      return new Enumerator<TKey, TValue>((NObject) javonetHandle.invoke("GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Remove(TKey key) {
    try {
      return javonetHandle.invoke("Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean TryGetValue(TKey key, TValue value) {
    try {
      return javonetHandle.invoke("TryGetValue", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IEnumerable.GetEnumerator"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public jio.System.Collections.ICollection IDictionary_get_Keys() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.invoke("System.Collections.IDictionary.get_Keys"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.ICollection IDictionary_get_Values() {
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

  public static class Enumerator<TKey, TValue> extends ValueType
      implements IDisposable, jio.System.Collections.IEnumerator, IDictionaryEnumerator {
    protected NObject javonetHandle;
    /** GetProperty */
    public KeyValuePair<TKey, TValue> getCurrent() {
      try {
        return new KeyValuePair<TKey, TValue>((NObject) javonetHandle.<NObject>get("Current"));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Enumerator(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Boolean MoveNext() {
      try {
        return javonetHandle.invoke("MoveNext");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Dispose() {
      try {
        javonetHandle.invoke("Dispose");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Current() {
      try {
        return (Object) javonetHandle.invoke("System.Collections.IEnumerator.get_Current");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void Reset() {
      try {
        javonetHandle.invoke("System.Collections.IEnumerator.Reset");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Key() {
      try {
        return (Object) javonetHandle.invoke("System.Collections.IDictionaryEnumerator.get_Key");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public Object get_Value() {
      try {
        return (Object) javonetHandle.invoke("System.Collections.IDictionaryEnumerator.get_Value");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public DictionaryEntry get_Entry() {
      try {
        return new DictionaryEntry(
            (NObject) javonetHandle.invoke("System.Collections.IDictionaryEnumerator.get_Entry"));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class KeyCollection<TKey, TValue>
      implements jio.System.Collections.IEnumerable, jio.System.Collections.ICollection {
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
    /** GenericConstructor */

    public KeyCollection(
        SortedDictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.SortedDictionary`2+KeyCollection",
                    getGetObjectName(TKey),
                    getGetObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public KeyCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        return ConvertToConcreteInterfaceImplementation(
            (NObject) javonetHandle.invoke("System.Collections.IEnumerable.GetEnumerator"));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TKey[] array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
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

    public static class Enumerator<TKey, TValue> extends ValueType
        implements IDisposable, jio.System.Collections.IEnumerator {
      protected NObject javonetHandle;
      /** GetProperty */
      public TKey get_Current(Class<?> returnType) {
        try {
          return (TKey) Convert(javonetHandle.invoke("get_Current"), returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          return javonetHandle.invoke("MoveNext");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          return (Object) javonetHandle.invoke("System.Collections.IEnumerator.get_Current");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle.invoke("System.Collections.IEnumerator.Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
    }
  }

  public static class ValueCollection<TKey, TValue>
      implements jio.System.Collections.IEnumerable, jio.System.Collections.ICollection {
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
    /** GenericConstructor */

    public ValueCollection(
        SortedDictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.SortedDictionary`2+ValueCollection",
                    getGetObjectName(TKey),
                    getGetObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ValueCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        return ConvertToConcreteInterfaceImplementation(
            (NObject) javonetHandle.invoke("System.Collections.IEnumerable.GetEnumerator"));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TValue[] array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
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

    public static class Enumerator<TKey, TValue> extends ValueType
        implements IDisposable, jio.System.Collections.IEnumerator {
      protected NObject javonetHandle;
      /** GetProperty */
      public TValue get_Current(Class<?> returnType) {
        try {
          return (TValue) Convert(javonetHandle.invoke("get_Current"), returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          return javonetHandle.invoke("MoveNext");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          return (Object) javonetHandle.invoke("System.Collections.IEnumerator.get_Current");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle.invoke("System.Collections.IEnumerator.Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
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

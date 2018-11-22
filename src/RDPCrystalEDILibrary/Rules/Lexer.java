package RDPCrystalEDILibrary.Rules;

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
import RDPCrystalEDILibrary.Rules.*;
import jio.System.*;
import jio.System.IO.*;
import jio.System.Collections.Generic.*;

public class Lexer implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getTokenContents() {
    try {
      return (java.lang.String) javonetHandle.get("TokenContents");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Object getToken() {
    try {
      return (Object) javonetHandle.<NObject>get("Token");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getLineNumber() {
    try {
      return javonetHandle.get("LineNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getPosition() {
    try {
      return javonetHandle.get("Position");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public Lexer(TextReader reader, List<TokenDefinition> tokenDefinitions) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.Lexer", reader, tokenDefinitions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Lexer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean Next() {
    try {
      return javonetHandle.invoke("Next");
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

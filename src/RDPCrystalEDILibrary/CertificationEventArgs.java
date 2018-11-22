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
import jio.System.*;
import RDPCrystalEDILibrary.*;
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Net.Security.*;

public class CertificationEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCancel(java.lang.Boolean value) {
    try {
      javonetHandle.set("Cancel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCancel() {
    try {
      return javonetHandle.get("Cancel");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCertificate(X509Certificate value) {
    try {
      javonetHandle.set("Certificate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public X509Certificate getCertificate() {
    try {
      return new X509Certificate((NObject) javonetHandle.<NObject>get("Certificate"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setChain(X509Chain value) {
    try {
      javonetHandle.set("Chain", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public X509Chain getChain() {
    try {
      return new X509Chain((NObject) javonetHandle.<NObject>get("Chain"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSslPolicyErrors(SslPolicyErrors value) {
    try {
      javonetHandle.set("SslPolicyErrors", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SslPolicyErrors getSslPolicyErrors() {
    try {
      return SslPolicyErrors.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("SslPolicyErrors")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CertificationEventArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.CertificationEventArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CertificationEventArgs(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;

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
import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;

public class BPR extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTransactionHandlingCode(java.lang.String value) {
    try {
      javonetHandle.set("TransactionHandlingCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTransactionHandlingCode() {
    try {
      return (java.lang.String) javonetHandle.get("TransactionHandlingCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount() {
    try {
      return (java.lang.String) javonetHandle.get("MonetaryAmount");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCreditDebitFlagCode(java.lang.String value) {
    try {
      javonetHandle.set("CreditDebitFlagCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCreditDebitFlagCode() {
    try {
      return (java.lang.String) javonetHandle.get("CreditDebitFlagCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPaymentMethodCode(java.lang.String value) {
    try {
      javonetHandle.set("PaymentMethodCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPaymentMethodCode() {
    try {
      return (java.lang.String) javonetHandle.get("PaymentMethodCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPaymentFormatCode(java.lang.String value) {
    try {
      javonetHandle.set("PaymentFormatCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPaymentFormatCode() {
    try {
      return (java.lang.String) javonetHandle.get("PaymentFormatCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IDNumberQualifier1(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IDNumberQualifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IDNumberQualifier1() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IDNumberQualifier1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IdentificationNumber1(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IdentificationNumber1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IdentificationNumber1() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IdentificationNumber1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumberQualifier1(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumberQualifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumberQualifier1() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumberQualifier1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumber1(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumber1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumber1() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumber1");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOriginatingCompanyIdentifier(java.lang.String value) {
    try {
      javonetHandle.set("OriginatingCompanyIdentifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOriginatingCompanyIdentifier() {
    try {
      return (java.lang.String) javonetHandle.get("OriginatingCompanyIdentifier");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOriginatingCompanySupplementalCode(java.lang.String value) {
    try {
      javonetHandle.set("OriginatingCompanySupplementalCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOriginatingCompanySupplementalCode() {
    try {
      return (java.lang.String) javonetHandle.get("OriginatingCompanySupplementalCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IDNumberQualifier2(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IDNumberQualifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IDNumberQualifier2() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IDNumberQualifier2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IdentificationNumber2(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IdentificationNumber2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IdentificationNumber2() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IdentificationNumber2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumberQualifier2(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumberQualifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumberQualifier2() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumberQualifier2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumber2(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumber2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumber2() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumber2");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDate(java.lang.String value) {
    try {
      javonetHandle.set("Date", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDate() {
    try {
      return (java.lang.String) javonetHandle.get("Date");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBusinessFunctionCode(java.lang.String value) {
    try {
      javonetHandle.set("BusinessFunctionCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBusinessFunctionCode() {
    try {
      return (java.lang.String) javonetHandle.get("BusinessFunctionCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IDNumberQualifier3(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IDNumberQualifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IDNumberQualifier3() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IDNumberQualifier3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDFI_IdentificationNumber3(java.lang.String value) {
    try {
      javonetHandle.set("DFI_IdentificationNumber3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDFI_IdentificationNumber3() {
    try {
      return (java.lang.String) javonetHandle.get("DFI_IdentificationNumber3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumberQualifier3(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumberQualifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumberQualifier3() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumberQualifier3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAccountNumber3(java.lang.String value) {
    try {
      javonetHandle.set("AccountNumber3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAccountNumber3() {
    try {
      return (java.lang.String) javonetHandle.get("AccountNumber3");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public BPR() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.BPR");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BPR(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Write(WriteArguments w) {
    try {
      javonetHandle.invoke("Write", w);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Load(LightWeightSegment segment) {
    try {
      javonetHandle.invoke("Load", segment);
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

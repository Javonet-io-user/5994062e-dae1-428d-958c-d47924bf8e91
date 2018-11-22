package RDPCrystalEDILibrary.UI.Winforms;

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
import RDPCrystalEDILibrary.UI.Winforms.*;
import RDPCrystalEDILibrary.*;
import jio.System.Windows.Forms.*;

public class TreeGenerator {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static TreeNode BuildRulesTree(EDIRulesReader reader) {
    try {
      return new TreeNode(
          (NObject) Javonet.getType("TreeGenerator").invoke("BuildRulesTree", reader));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static TreeNode BuildEDIDocumentTree(
      EDIDocument document, java.lang.Boolean expandLoopNode) {
    try {
      return new TreeNode(
          (NObject)
              Javonet.getType("TreeGenerator")
                  .invoke("BuildEDIDocumentTree", document, expandLoopNode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static TreeNode BuildValidatedDataTree(EDIValidator validator) {
    try {
      return new TreeNode(
          (NObject) Javonet.getType("TreeGenerator").invoke("BuildValidatedDataTree", validator));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

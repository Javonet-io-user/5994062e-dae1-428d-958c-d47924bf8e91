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
import jio.System.Drawing.*;
import jio.System.Drawing.Printing.*;
import jio.System.Collections.ObjectModel.*;

public class FormPrinter extends Component {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setImage(Image value) {
    try {
      javonetHandle.set("Image", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Image getImage() {
    try {
      return ConvertToConcreteInterfaceImplementation(
          (NObject) javonetHandle.<NObject>get("Image"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setImageX(java.lang.Float value) {
    try {
      javonetHandle.set("ImageX", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Float getImageX() {
    try {
      return javonetHandle.get("ImageX");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setImageY(java.lang.Float value) {
    try {
      javonetHandle.set("ImageY", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Float getImageY() {
    try {
      return javonetHandle.get("ImageY");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Bitmap getFormBitmap() {
    try {
      return new Bitmap((NObject) javonetHandle.<NObject>get("FormBitmap"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFontColor(Color value) {
    try {
      javonetHandle.set("FontColor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Color getFontColor() {
    try {
      return new Color((NObject) javonetHandle.<NObject>get("FontColor"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPageSettings(PageSettings value) {
    try {
      javonetHandle.set("PageSettings", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PageSettings getPageSettings() {
    try {
      return new PageSettings((NObject) javonetHandle.<NObject>get("PageSettings"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFont(Font value) {
    try {
      javonetHandle.set("Font", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Font getFont() {
    try {
      return new Font((NObject) javonetHandle.<NObject>get("Font"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setPrintCellRectangle(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrintCellRectangle", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrintCellRectangle() {
    try {
      return javonetHandle.get("PrintCellRectangle");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setPrintUppercase(java.lang.Boolean value) {
    try {
      javonetHandle.set("PrintUppercase", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrintUppercase() {
    try {
      return javonetHandle.get("PrintUppercase");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Collection<FormCell> getCells() {
    try {
      return new Collection<FormCell>((NObject) javonetHandle.<NObject>get("Cells"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FormPrinter(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormPrinter", container);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormPrinter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormPrinter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormPrinter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height) {
    try {
      return new FormCell((NObject) javonetHandle.invoke("CreateCell", data, x, y, width, height));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa) {
    try {
      return new FormCell(
          (NObject)
              javonetHandle.invoke(
                  "CreateCell", data, x, y, width, height, NEnum.fromJavaEnum(sa)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      return new FormCell(
          (NObject)
              javonetHandle.invoke(
                  "CreateCell",
                  data,
                  x,
                  y,
                  width,
                  height,
                  NEnum.fromJavaEnum(sa),
                  NEnum.fromJavaEnum(lineAlignment)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(java.lang.String data) {
    try {
      return new FormCell((NObject) javonetHandle.invoke("CreateCell", data));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data, java.lang.Double x, java.lang.Double y, SizeF size) {
    try {
      return new FormCell((NObject) javonetHandle.invoke("CreateCell", data, x, y, size));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa) {
    try {
      return new FormCell(
          (NObject) javonetHandle.invoke("CreateCell", data, x, y, size, NEnum.fromJavaEnum(sa)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public FormCell CreateCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      return new FormCell(
          (NObject)
              javonetHandle.invoke(
                  "CreateCell",
                  data,
                  x,
                  y,
                  size,
                  NEnum.fromJavaEnum(sa),
                  NEnum.fromJavaEnum(lineAlignment)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Print() {
    try {
      javonetHandle.invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void PrintPreview() {
    try {
      javonetHandle.invoke("PrintPreview");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void PrintToImage() {
    try {
      javonetHandle.invoke("PrintToImage");
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

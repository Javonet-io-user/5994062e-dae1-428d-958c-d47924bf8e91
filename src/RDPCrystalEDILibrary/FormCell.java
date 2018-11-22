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
import RDPCrystalEDILibrary.*;
import jio.System.Drawing.*;

public class FormCell {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStringFormatFlags(StringFormatFlags value) {
    try {
      javonetHandle.set("StringFormatFlags", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StringFormatFlags getStringFormatFlags() {
    try {
      return StringFormatFlags.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("StringFormatFlags")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setStringAlignment(StringAlignment value) {
    try {
      javonetHandle.set("StringAlignment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StringAlignment getStringAlignment() {
    try {
      return StringAlignment.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("StringAlignment")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLineAlignment(StringAlignment value) {
    try {
      javonetHandle.set("LineAlignment", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public StringAlignment getLineAlignment() {
    try {
      return StringAlignment.valueOf(
          ((NEnum) javonetHandle.<NEnum>get("LineAlignment")).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      return (java.lang.String) javonetHandle.get("Name");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      return (java.lang.String) javonetHandle.get("Description");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setData(java.lang.String value) {
    try {
      javonetHandle.set("Data", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getData() {
    try {
      return (java.lang.String) javonetHandle.get("Data");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setX(java.lang.Double value) {
    try {
      javonetHandle.set("X", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getX() {
    try {
      return javonetHandle.get("X");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  public void setY(java.lang.Double value) {
    try {
      javonetHandle.set("Y", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getY() {
    try {
      return javonetHandle.get("Y");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  public void setWidth(java.lang.Double value) {
    try {
      javonetHandle.set("Width", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getWidth() {
    try {
      return javonetHandle.get("Width");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  public void setHeight(java.lang.Double value) {
    try {
      javonetHandle.set("Height", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Double getHeight() {
    try {
      return javonetHandle.get("Height");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** GetProperty */

  public RectangleF getRectangleF() {
    try {
      return new RectangleF((NObject) javonetHandle.<NObject>get("RectangleF"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FormCell() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(java.lang.String data) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, width, height);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell", data, x, y, width, height, NEnum.fromJavaEnum(sa));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      java.lang.Double width,
      java.lang.Double height,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell",
              data,
              x,
              y,
              width,
              height,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(java.lang.String data, java.lang.Double x, java.lang.Double y, SizeF size) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, size);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa) {
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.FormCell", data, x, y, size, NEnum.fromJavaEnum(sa));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(
      java.lang.String data,
      java.lang.Double x,
      java.lang.Double y,
      SizeF size,
      StringAlignment sa,
      StringAlignment lineAlignment) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.FormCell",
              data,
              x,
              y,
              size,
              NEnum.fromJavaEnum(sa),
              NEnum.fromJavaEnum(lineAlignment));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormCell(NObject handle) {
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

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

public class Tokens {
  protected NObject javonetHandle;
  /** GetFiled */
  public static TokenDefinition getCOMMA() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("COMMA"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCOMMA(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("COMMA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSEMICOLON() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("SEMICOLON"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSEMICOLON(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SEMICOLON", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSPACE() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("SPACE"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSPACE(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SPACE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getEQUAL() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("EQUAL"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEQUAL(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("EQUAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getEQUALSS() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("EQUALSS"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEQUALSS(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("EQUALSS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getEND() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("END"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEND(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("END", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getIFSTATEMENT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("IFSTATEMENT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setIFSTATEMENT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("IFSTATEMENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getELSEIFSTATEMENT() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ELSEIFSTATEMENT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setELSEIFSTATEMENT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ELSEIFSTATEMENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getIF() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("IF"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setIF(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("IF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getELSEIF() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("ELSEIF"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setELSEIF(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ELSEIF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getELSE() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("ELSE"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setELSE(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ELSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getNULL() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("NULL"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNULL(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("NULL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSYMBOL() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("SYMBOL"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSYMBOL(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SYMBOL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSEGPOS() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("SEGPOS"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSEGPOS(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SEGPOS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getELEMPOS() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("ELEMPOS"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setELEMPOS(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ELEMPOS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSTRINGLIST() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("STRINGLIST"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSTRINGLIST(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("STRINGLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getINTEGERINDEXLIST() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("INTEGERINDEXLIST"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setINTEGERINDEXLIST(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("INTEGERINDEXLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getINTEGERLIST() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("INTEGERLIST"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setINTEGERLIST(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("INTEGERLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getINDEXER() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("INDEXER"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setINDEXER(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("INDEXER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getINT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("INT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setINT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("INT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getFLOAT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("FLOAT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFLOAT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("FLOAT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCONDITION() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("CONDITION"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCONDITION(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CONDITION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getGREATERTHAN() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("GREATERTHAN"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setGREATERTHAN(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("GREATERTHAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getGREATERTHANOREQUALTO() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("GREATERTHANOREQUALTO"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setGREATERTHANOREQUALTO(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("GREATERTHANOREQUALTO", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getLESSTHAN() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("LESSTHAN"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLESSTHAN(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("LESSTHAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getLESSTHANOREQUALTO() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("LESSTHANOREQUALTO"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLESSTHANOREQUALTO(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("LESSTHANOREQUALTO", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getNOTEQUAL() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("NOTEQUAL"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNOTEQUAL(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("NOTEQUAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getAND() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("AND"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setAND(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("AND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getOR() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("OR"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setOR(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("OR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getLEFT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("LEFT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLEFT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("LEFT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getLEFTBRACKET() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("LEFTBRACKET"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLEFTBRACKET(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("LEFTBRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getRIGHT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("RIGHT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRIGHT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("RIGHT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getRIGHTBRACKET() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("RIGHTBRACKET"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRIGHTBRACKET(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("RIGHTBRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getDOT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("DOT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setDOT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("DOT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getTHEN() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("THEN"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setTHEN(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("THEN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getLOCALCODE() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("LOCALCODE"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setLOCALCODE(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("LOCALCODE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getERROR() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("ERROR"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setERROR(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ERROR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getUSAGE() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("USAGE"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setUSAGE(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("USAGE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getELEMENTLIST() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("ELEMENTLIST"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setELEMENTLIST(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ELEMENTLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getREQUIRED() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("REQUIRED"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setREQUIRED(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("REQUIRED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getNOTUSED() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("NOTUSED"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNOTUSED(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("NOTUSED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getOPTIONAL() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("OPTIONAL"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setOPTIONAL(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("OPTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getRECOMMENDED() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("RECOMMENDED"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setRECOMMENDED(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("RECOMMENDED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getNOTRECOMMENDED() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("NOTRECOMMENDED"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNOTRECOMMENDED(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("NOTRECOMMENDED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getDEFAULT() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("DEFAULT"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setDEFAULT(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("DEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSegmentNotUsed() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("SegmentNotUsed"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSegmentNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SegmentNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSegmentRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("SegmentRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSegmentRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SegmentRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSegmentMissing() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("SegmentMissing"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSegmentMissing(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SegmentMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSegmentNotRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("SegmentNotRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSegmentNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("SegmentNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getElementHasWrongValue() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ElementHasWrongValue"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setElementHasWrongValue(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ElementHasWrongValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getElementNotUsed() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ElementNotUsed"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setElementNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ElementNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getElementRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ElementRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setElementRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ElementRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getElementNotRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ElementNotRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setElementNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ElementNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getElementMissing() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("ElementMissing"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setElementMissing(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("ElementMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCompositeElementHasWrongValue() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("CompositeElementHasWrongValue"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCompositeElementHasWrongValue(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CompositeElementHasWrongValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCompositeElementNotUsed() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("CompositeElementNotUsed"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCompositeElementNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CompositeElementNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCompositeElementRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("CompositeElementRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCompositeElementRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CompositeElementRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCompositeElementNotRecommended() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("CompositeElementNotRecommended"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCompositeElementNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CompositeElementNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCompositeElementMissing() {
    try {
      return new TokenDefinition(
          (NObject) Javonet.getType("Tokens").<NObject>get("CompositeElementMissing"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCompositeElementMissing(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CompositeElementMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getSTRING() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("STRING"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSTRING(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static TokenDefinition getCODECONDITION() {
    try {
      return new TokenDefinition((NObject) Javonet.getType("Tokens").<NObject>get("CODECONDITION"));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCODECONDITION(TokenDefinition param) {
    try {
      Javonet.getType("Tokens").set("CODECONDITION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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

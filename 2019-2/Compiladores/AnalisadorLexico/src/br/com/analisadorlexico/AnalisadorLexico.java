/* The following code was generated by JFlex 1.6.1 */

package br.com.analisadorlexico;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>especificacoes/MiniC.flex</tt>
 */
class AnalisadorLexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\4\1\44\1\44\1\3\22\0\1\5\1\40\1\15"+
    "\1\43\3\0\1\10\1\43\1\43\1\17\1\42\1\43\1\42\1\7"+
    "\1\16\12\2\1\0\1\43\1\40\1\41\1\40\2\0\32\1\1\0"+
    "\1\11\2\0\1\6\1\0\1\26\1\30\1\32\1\23\1\31\1\24"+
    "\1\1\1\33\1\22\2\1\1\25\1\34\1\12\1\21\1\37\1\1"+
    "\1\14\1\35\1\13\1\27\1\20\1\36\3\1\1\43\1\0\1\43"+
    "\7\0\1\44\u1fa2\0\1\44\1\44\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\1\1\2"+
    "\1\1\2\6\11\2\1\6\2\0\1\7\1\0\1\2"+
    "\1\0\1\10\1\4\1\0\2\2\1\11\7\2\1\12"+
    "\1\2\1\0\21\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\45\0\45\0\271"+
    "\0\336\0\u0103\0\u0128\0\45\0\u014d\0\u0172\0\u0197\0\u01bc"+
    "\0\u01e1\0\u0206\0\u022b\0\u0250\0\u0275\0\u029a\0\u02bf\0\u02e4"+
    "\0\45\0\u0309\0\u032e\0\u0103\0\45\0\u0353\0\u0378\0\u039d"+
    "\0\u03c2\0\112\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0"+
    "\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8"+
    "\0\u05ed\0\u0612\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0"+
    "\0\u0715\0\u073a\0\u075f\0\u0784\0\u07a9";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\6\1\3\1\7\1\10"+
    "\1\2\2\3\1\11\1\12\1\13\1\14\1\15\1\3"+
    "\1\16\1\17\1\20\4\3\1\21\1\22\1\3\1\23"+
    "\1\3\1\24\1\25\2\26\1\14\1\7\47\0\2\3"+
    "\3\0\1\3\3\0\3\3\3\0\20\3\7\0\1\4"+
    "\4\0\1\27\41\0\1\6\41\0\2\30\5\0\1\31"+
    "\1\32\3\30\3\0\20\30\6\0\2\3\3\0\1\3"+
    "\3\0\3\3\3\0\11\3\1\33\6\3\5\0\15\34"+
    "\1\35\27\34\16\0\1\36\1\37\26\0\2\3\3\0"+
    "\1\3\3\0\3\3\3\0\1\3\1\40\16\3\6\0"+
    "\2\3\3\0\1\3\3\0\1\41\2\3\3\0\4\3"+
    "\1\42\13\3\6\0\2\3\3\0\1\3\3\0\3\3"+
    "\3\0\1\3\1\43\16\3\6\0\2\3\3\0\1\3"+
    "\3\0\3\3\3\0\5\3\1\44\12\3\6\0\2\3"+
    "\3\0\1\3\3\0\3\3\3\0\5\3\1\45\12\3"+
    "\6\0\2\3\3\0\1\3\3\0\3\3\3\0\13\3"+
    "\1\46\4\3\6\0\2\3\3\0\1\3\3\0\3\3"+
    "\3\0\6\3\1\47\11\3\6\0\2\3\3\0\1\3"+
    "\3\0\3\3\3\0\13\3\1\50\4\3\6\0\2\3"+
    "\3\0\1\3\3\0\2\3\1\51\3\0\20\3\46\0"+
    "\1\14\5\0\1\52\52\0\1\31\45\0\4\30\31\0"+
    "\2\3\3\0\1\3\3\0\1\3\1\53\1\3\3\0"+
    "\20\3\5\0\3\36\1\5\1\6\40\36\17\37\1\54"+
    "\25\37\1\0\2\3\3\0\1\3\3\0\3\3\3\0"+
    "\2\3\1\55\15\3\6\0\2\3\3\0\1\3\3\0"+
    "\1\3\1\42\1\3\3\0\12\3\1\56\5\3\6\0"+
    "\2\3\3\0\1\3\3\0\3\3\3\0\7\3\1\57"+
    "\10\3\6\0\2\3\3\0\1\3\3\0\3\3\3\0"+
    "\1\3\1\60\16\3\6\0\2\3\3\0\1\3\3\0"+
    "\3\3\3\0\15\3\1\61\2\3\6\0\2\3\3\0"+
    "\1\3\3\0\3\3\3\0\6\3\1\62\11\3\6\0"+
    "\2\3\3\0\1\3\3\0\3\3\3\0\2\3\1\63"+
    "\15\3\6\0\2\3\3\0\1\3\3\0\3\3\3\0"+
    "\2\3\1\64\15\3\6\0\2\3\3\0\1\3\3\0"+
    "\3\3\3\0\2\3\1\65\15\3\7\0\1\52\4\0"+
    "\1\27\36\0\2\3\3\0\1\3\3\0\3\3\3\0"+
    "\7\3\1\66\10\3\5\0\16\37\1\6\1\54\25\37"+
    "\1\0\2\3\3\0\1\3\3\0\3\3\3\0\3\3"+
    "\1\42\14\3\6\0\2\3\3\0\1\3\3\0\3\3"+
    "\3\0\5\3\1\67\12\3\6\0\2\3\3\0\1\3"+
    "\3\0\3\3\3\0\10\3\1\64\7\3\6\0\2\3"+
    "\3\0\1\3\3\0\3\3\3\0\6\3\1\70\11\3"+
    "\6\0\2\3\3\0\1\3\3\0\3\3\3\0\11\3"+
    "\1\42\6\3\6\0\2\3\3\0\1\3\3\0\2\3"+
    "\1\42\3\0\20\3\6\0\2\3\3\0\1\3\3\0"+
    "\1\42\2\3\3\0\20\3\6\0\2\3\3\0\1\3"+
    "\3\0\3\3\3\0\5\3\1\61\12\3\6\0\2\3"+
    "\3\0\1\3\3\0\1\71\2\3\3\0\20\3\6\0"+
    "\2\3\3\0\1\3\3\0\2\3\1\63\3\0\20\3"+
    "\6\0\2\3\3\0\1\3\3\0\3\3\3\0\7\3"+
    "\1\72\10\3\6\0\2\3\3\0\1\3\3\0\1\3"+
    "\1\42\1\3\3\0\20\3\6\0\2\3\3\0\1\3"+
    "\3\0\1\3\1\73\1\3\3\0\20\3\6\0\2\3"+
    "\3\0\1\3\3\0\3\3\3\0\3\3\1\61\14\3"+
    "\6\0\2\3\3\0\1\3\3\0\3\3\3\0\2\3"+
    "\1\74\1\3\1\42\10\3\1\75\2\3\6\0\2\3"+
    "\3\0\1\3\3\0\1\70\2\3\3\0\20\3\6\0"+
    "\2\3\3\0\1\3\3\0\1\3\1\62\1\3\3\0"+
    "\20\3\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1998];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\2\11\4\1\1\11\12\1\2\0"+
    "\1\11\1\0\1\1\1\0\1\11\1\1\1\0\14\1"+
    "\1\0\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalisadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Token( TipoToken.ERRO.toString(), yyline, yycolumn, yytext() );
            }
          case 11: break;
          case 2: 
            { return new Token( TipoToken.IDENTIFICADOR.toString(), yyline, yycolumn, yytext() );
            }
          case 12: break;
          case 3: 
            { return new Token( TipoToken.LITERAL_INTEIRO.toString(), yyline, yycolumn, yytext() );
            }
          case 13: break;
          case 4: 
            { 
            }
          case 14: break;
          case 5: 
            { return new Token( TipoToken.PONTUACAO.toString(), yyline, yycolumn, yytext() );
            }
          case 15: break;
          case 6: 
            { return new Token( TipoToken.OPERADOR.toString(), yyline, yycolumn, yytext() );
            }
          case 16: break;
          case 7: 
            { return new Token( TipoToken.LITERAL_CHAR.toString(), yyline, yycolumn, yytext() );
            }
          case 17: break;
          case 8: 
            { return new Token( TipoToken.LITERAL_STRING.toString(), yyline, yycolumn, yytext() );
            }
          case 18: break;
          case 9: 
            { return new Token( TipoToken.PALAVRA_RESERVADA.toString(), yyline, yycolumn, yytext() );
            }
          case 19: break;
          case 10: 
            { return new Token( TipoToken.LITERAL_PONTO_FLUTUANTE.toString(), yyline, yycolumn, yytext() );
            }
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

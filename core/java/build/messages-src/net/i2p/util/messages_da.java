/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.util;
public class messages_da extends java.util.ResourceBundle {
  private static final java.lang.Object[] table;
  static {
    java.lang.Object[] t = new java.lang.Object[58];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-17 17:16+0000\nLast-Translator: Anders \u00d8bro, 2022\nLanguage-Team: Danish (https://www.transifex.com/otf/teams/12694/da/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: da\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[4] = "{0,number,####} \u03bcs";
    t[5] = new java.lang.String[] { "{0,number,####} \u03bcs", "{0,number,###} \u03bcs" };
    t[12] = "{0} min";
    t[13] = new java.lang.String[] { "{0} min", "{0} min" };
    t[16] = "ERROR";
    t[17] = "ERROR";
    t[18] = "WARN";
    t[19] = "WARN";
    t[22] = "{0} sec";
    t[23] = new java.lang.String[] { "{0} sek", "{0} sek" };
    t[26] = "INFO";
    t[27] = "INFO";
    t[38] = "{0,number,####} ms";
    t[39] = new java.lang.String[] { "{0,number,####} ms", "{0,number,####} ms" };
    t[42] = "CRIT";
    t[43] = "CRIT";
    t[44] = "n/a";
    t[45] = "Ikke tilg\u00e6ngelig ";
    t[46] = "{0} day";
    t[47] = new java.lang.String[] { "{0} dag", "{0} dage" };
    t[50] = "{0} hour";
    t[51] = new java.lang.String[] { "{0} time", "{0} timer" };
    t[56] = "DEBUG";
    t[57] = "DEBUG";
    table = t;
  }
  public static final java.lang.String[] get_msgid_plural_table () {
    return new java.lang.String[] { "{0,number,###} \u03bcs", "{0} min", "{0} sec", "{0,number,####} ms", "{0} days", "{0} hours" };
  }
  public java.lang.Object lookup (java.lang.String msgid) {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 29) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    java.lang.Object value = lookup(msgid);
    return (value instanceof java.lang.String[] ? ((java.lang.String[])value)[0] : value);
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 58 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 58);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 58 && table[idx] == null);
          return key;
        }
      };
  }
  public static long pluralEval (long n) {
    return ((n != 1) ? 1 : 0);
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

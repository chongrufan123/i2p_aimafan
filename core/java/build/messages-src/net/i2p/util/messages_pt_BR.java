/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.util;
public class messages_pt_BR extends java.util.ResourceBundle {
  private static final java.lang.Object[] table;
  static {
    java.lang.Object[] t = new java.lang.Object[46];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-17 17:16+0000\nLast-Translator: blueboy, 2020\nLanguage-Team: Portuguese (Brazil) (https://www.transifex.com/otf/teams/12694/pt_BR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: pt_BR\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[4] = "{0} hour";
    t[5] = new java.lang.String[] { "{0} horas", "{0} horas" };
    t[8] = "{0} similar message omitted";
    t[9] = new java.lang.String[] { "{0} mensagem semelhante omitida", "{0} mensagens semelhantes omitidas" };
    t[10] = "DEBUG";
    t[11] = "DEPURA\u00c7\u00c3O";
    t[12] = "{0} sec";
    t[13] = new java.lang.String[] { "{0} seg", "{0} seg" };
    t[14] = "{0} day";
    t[15] = new java.lang.String[] { "{0} dias", "{0} dias" };
    t[16] = "{0,number,####} ms";
    t[17] = new java.lang.String[] { "{0,number,####} ms", "{0,number,####} ms" };
    t[18] = "CRIT";
    t[19] = "CRIT";
    t[20] = "{0} min";
    t[21] = new java.lang.String[] { "{0} min", "{0} min" };
    t[22] = "WARN";
    t[23] = "AVISO";
    t[28] = "ERROR";
    t[29] = "ERRO";
    t[30] = "n/a";
    t[31] = "n/a";
    t[32] = "{0,number,####} ns";
    t[33] = new java.lang.String[] { "{0,number,####} ns", "{0,number,###} ns" };
    t[34] = "{0} year";
    t[35] = new java.lang.String[] { "{0} ano", "{0} anos" };
    t[40] = "INFO";
    t[41] = "INFORMA\u00c7\u00c3O";
    t[44] = "{0,number,####} \u03bcs";
    t[45] = new java.lang.String[] { "{0,number,####} \u03bcs", "{0,number,###} \u03bcs" };
    table = t;
  }
  public static final java.lang.String[] get_msgid_plural_table () {
    return new java.lang.String[] { "{0} hours", "{0} similar messages omitted", "{0} sec", "{0} days", "{0,number,####} ms", "{0} min", "{0,number,###} ns", "{0} years", "{0,number,###} \u03bcs" };
  }
  public java.lang.Object lookup (java.lang.String msgid) {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 23) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 21) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 46)
        idx -= 46;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    java.lang.Object value = lookup(msgid);
    return (value instanceof java.lang.String[] ? ((java.lang.String[])value)[0] : value);
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 46 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 46);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 46 && table[idx] == null);
          return key;
        }
      };
  }
  public static long pluralEval (long n) {
    return ((n > 1) ? 1 : 0);
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
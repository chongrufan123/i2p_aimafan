/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.util;
public class messages_sl extends java.util.ResourceBundle {
  private static final java.lang.Object[] table;
  static {
    java.lang.Object[] t = new java.lang.Object[46];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-17 17:16+0000\nLast-Translator: \u017dan \u0160adl-Fer\u0161, 2021\nLanguage-Team: Slovenian (https://www.transifex.com/otf/teams/12694/sl/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: sl\nPlural-Forms: nplurals=4; plural=(n%100==1 ? 0 : n%100==2 ? 1 : n%100==3 || n%100==4 ? 2 : 3);\n";
    t[4] = "{0} hour";
    t[5] = new java.lang.String[] { "{0} ura", "{0} ure", "{0} uri", "{0} ur" };
    t[8] = "{0} similar message omitted";
    t[9] = new java.lang.String[] { "{0} podobno sporo\u010dilo izpu\u0161\u010deno", "{0} podobna sporo\u010dila izpu\u0161\u010dena", "{0} podobnih sporo\u010dil izpu\u0161\u010denih", "{0} podobnih sporo\u010dil izpu\u0161\u010denih" };
    t[10] = "DEBUG";
    t[11] = "RAZHRO\u0160\u010cEVANJE";
    t[12] = "{0} sec";
    t[13] = new java.lang.String[] { "{0} sekunda", "{0} sekundi", "{0} sekunde", "{0} sekund" };
    t[14] = "{0} day";
    t[15] = new java.lang.String[] { "{0} dan", "{0} dneva", "{0} dni", "{0} dni" };
    t[16] = "{0,number,####} ms";
    t[17] = new java.lang.String[] { "{0,number,####} milisekunda", "{0,number,####} milisekundi", "{0,number,####} milisekunde", "{0,number,####} milisekund" };
    t[18] = "CRIT";
    t[19] = "KRITI\u010cNO";
    t[20] = "{0} min";
    t[21] = new java.lang.String[] { "{0} minuta", "{0} minuti", "{0} minute", "{0} minut" };
    t[22] = "WARN";
    t[23] = "OPOZORILO";
    t[28] = "ERROR";
    t[29] = "NAPAKA";
    t[30] = "n/a";
    t[31] = "Ni na voljo";
    t[32] = "{0,number,####} ns";
    t[33] = new java.lang.String[] { "{0,number,###} nanosekunda", "{0,number,###} nanosekundi", "{0,number,####} nanosekunde", "{0,number,###} nanosekund" };
    t[34] = "{0} year";
    t[35] = new java.lang.String[] { "{0} leto", "{0} leti", "{0} leta", "{0} let" };
    t[40] = "INFO";
    t[41] = "INFORMACIJE";
    t[44] = "{0,number,####} \u03bcs";
    t[45] = new java.lang.String[] { "{0,number,###} mikrosekunda", "{0,number,###} mikrosekundi", "{0,number,###} mikrosekunde", "{0,number,###} mikrosekund" };
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
    return (((n % 100) == 1) ? 0 : (((n % 100) == 2) ? 1 : ((((n % 100) == 3) || ((n % 100) == 4)) ? 2 : 3)));
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

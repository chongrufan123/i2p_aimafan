/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.i2ptunnel.proxy;
public class messages_nn extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[46];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-02-05 15:27+0000\nLast-Translator: zzzi2p\nLanguage-Team: Norwegian Nynorsk (http://www.transifex.com/otf/I2P/language/nn/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: nn\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Added via address helper from {0}";
    t[3] = "Lagt til via adressehjelpar fr\u00e5 {0}";
    t[8] = "i2paddresshelper cannot help you with a destination like that!";
    t[9] = "i2paddresshelper kan ikkje hjelpa med ei s\u00e5nn m\u00e5lside!";
    t[10] = "Redirecting to {0}";
    t[11] = "Vidaresender til {0}";
    t[12] = "Help";
    t[13] = "Hjelp";
    t[16] = "Click here if you are not redirected automatically.";
    t[17] = "Klikk her om du ikkje blir vidaresendt.";
    t[20] = "Router Console";
    t[21] = "Ruterkonsoll";
    t[22] = "Generate";
    t[23] = "generer";
    t[26] = "Added via address helper";
    t[27] = "Lagt til med adressehjelpar";
    t[28] = "Continue to {0} without saving";
    t[29] = "Fortset til {0} utan \u00e5 lagra";
    t[30] = "Addressbook";
    t[31] = "Adressebok";
    t[32] = "Host";
    t[33] = "Tenar";
    t[36] = "Configuration";
    t[37] = "Konfigurasjon";
    t[38] = "Destination";
    t[39] = "M\u00e5lside";
    t[42] = "This seems to be a bad destination:";
    t[43] = "Dette ser ut til \u00e5 vera ei feilaktig m\u00e5lside:";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
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
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_tr extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[86];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-20 07:46+0000\nLast-Translator: Kaya Zeren <kayazeren@gmail.com>\nLanguage-Team: Turkish (Turkey) (http://www.transifex.com/otf/I2P/language/tr_TR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: tr_TR\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[2] = "Message expired";
    t[3] = "\u0130letinin s\u00fcresi ge\u00e7mi\u015f";
    t[6] = "Invalid destination";
    t[7] = "Hedef ge\u00e7ersiz";
    t[10] = "Local lease set invalid";
    t[11] = "Yerel kiralama k\u00fcmesi ge\u00e7ersiz";
    t[12] = "Connection was reset";
    t[13] = "Ba\u011flant\u0131 s\u0131f\u0131rland\u0131";
    t[22] = "Local network failure";
    t[23] = "Yerel a\u011f sorunu";
    t[30] = "No local tunnels";
    t[31] = "Yerel t\u00fcnel bulunamad\u0131";
    t[36] = "Failed delivery to local destination";
    t[37] = "Yerel hedefe iletilemedi";
    t[38] = "Unsupported encryption options";
    t[39] = "\u015eifreleme se\u00e7enekleri desteklenmiyor";
    t[40] = "Local router failure";
    t[41] = "Yerel y\u00f6neltici sorunu";
    t[44] = "Failure code";
    t[45] = "Hata kodu";
    t[50] = "Invalid message";
    t[51] = "\u0130leti ge\u00e7ersiz";
    t[56] = "Message timeout";
    t[57] = "\u0130leti zaman a\u015f\u0131m\u0131";
    t[58] = "Session closed";
    t[59] = "Oturum kapat\u0131ld\u0131";
    t[60] = "Local destination shutdown";
    t[61] = "Yerel hedef kapand\u0131";
    t[64] = "Destination lease set expired";
    t[65] = "Hedef kiralama k\u00fcmesinin s\u00fcresi ge\u00e7mi\u015f";
    t[68] = "Buffer overflow";
    t[69] = "Ara bellek ta\u015fmas\u0131";
    t[72] = "Destination lease set not found";
    t[73] = "Hedef kiralama k\u00fcmesi bulunamad\u0131";
    t[82] = "Invalid message options";
    t[83] = "\u0130leti se\u00e7enekleri ge\u00e7ersiz";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 43) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 41) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 86)
        idx -= 86;
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
        { while (idx < 86 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 86);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 86 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

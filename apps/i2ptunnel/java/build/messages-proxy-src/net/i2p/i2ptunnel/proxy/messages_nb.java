/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.i2ptunnel.proxy;
public class messages_nb extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[94];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2013-07-20 14:50+0000\nLast-Translator: Allan Nordh\u00f8y <epost@anotheragency.no>, 2017\nLanguage-Team: Norwegian Bokm\u00e5l (http://www.transifex.com/otf/I2P/language/nb/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: nb\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Help";
    t[3] = "Hjelp";
    t[4] = "Added via address helper from {0}";
    t[5] = "Lagt til via addresse hjelper fra {0}";
    t[6] = "Destination lease set not found";
    t[7] = "Oppsatt m\u00e5lleie ikke funnet";
    t[12] = "Addressbook";
    t[13] = "Adressebok";
    t[18] = "Host";
    t[19] = "Vert";
    t[22] = "The connection to the website was reset while the page was loading.";
    t[23] = "Tilkoblingen til nettsiden ble tilbakestilt mens siden lastet.";
    t[24] = "Generate";
    t[25] = "Opprett";
    t[28] = "Added via address helper";
    t[29] = "Lagt til via adresse helper";
    t[34] = "Continue to {0} without saving";
    t[35] = "Fortsett til {0} uten \u00e5 lagre";
    t[44] = "i2paddresshelper cannot help you with a destination like that!";
    t[45] = "i2paddresshelper kan ikke hjelpe deg med en destinasjon som dette!";
    t[46] = "The website was not reachable.";
    t[47] = "Nettsiden kan ikke n\u00e5s.";
    t[48] = "Address Book";
    t[49] = "Adressebok";
    t[54] = "Website Unreachable";
    t[55] = "Nettsiden kan ikke n\u00e5s";
    t[58] = "Warning: Invalid Destination";
    t[59] = "Lokal destinasjon";
    t[60] = "Click here if you are not redirected automatically.";
    t[61] = "Klikk her hvis du ikke blir videresendt automatisk.";
    t[62] = "Destination";
    t[63] = "Destinasjon";
    t[64] = "I2P Router Console";
    t[65] = "Ruter Konsoll";
    t[66] = "Configuration";
    t[67] = "Konfigurasjon";
    t[68] = "Encryption key";
    t[69] = "Krypteringsn\u00f8kkel";
    t[70] = "Address book";
    t[71] = "Adressebok";
    t[72] = "Proxy Authorization Required";
    t[73] = "utproxy autorisasjon";
    t[74] = "Redirecting to {0}";
    t[75] = "Videresender til {0}";
    t[78] = "Could not find the following destination:";
    t[79] = "Tunnel destinasjon";
    t[80] = "private";
    t[81] = "privat";
    t[82] = "I2P HTTP Proxy Authorization Required";
    t[83] = "utproxy autorisasjon";
    t[86] = "This seems to be a bad destination:";
    t[87] = "Dette synes \u00e5 v\u00e6re en d\u00e5rlig destinasjon:";
    t[90] = "Router Console";
    t[91] = "Ruter Konsoll";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 47) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 45) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 94)
        idx -= 94;
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
        { while (idx < 94 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 94);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 94 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.news;
public class messages_pl extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[56];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-05-12 21:53+0000\nLast-Translator: \u2606Verdulo\nLanguage-Team: Polish (http://www.transifex.com/otf/I2P/language/pl/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: pl\nPlural-Forms: nplurals=4; plural=(n==1 ? 0 : (n%10>=2 && n%10<=4) && (n%100<12 || n%100>14) ? 1 : n!=1 && (n%10>=0 && n%10<=1) || (n%10>=5 && n%10<=9) || (n%100>=12 && n%100<=14) ? 2 : 3);\n";
    t[2] = "Welcome to I2P!";
    t[3] = "Witaj w I2P!";
    t[4] = "Just enter 127.0.0.1 (or localhost) port 4444 as a http proxy into your browser settings.";
    t[5] = "Po prostu wpisz 127.0.0.1 (lub localhost) port 4444 jako proxy http w ustawieniach swojej przegl\u0105darki.";
    t[6] = "I2P Development Team";
    t[7] = "Zesp\u00f3\u0142 programist\u00f3w I2P";
    t[12] = "Once you have a \"shared clients\" destination listed on the left, please {0}check out{1} our {2}FAQ{3}.";
    t[13] = "Gdy na li\u015bcie po lewej pojawi si\u0119 cel \"shared clients\", prosz\u0119 {0}sprawd\u017a{1} nasze {2}FAQ{3}.";
    t[14] = "Please {0}have patience{1} as I2P boots up and finds peers.";
    t[15] = "Prosz\u0119 {0}cierpliwie czeka\u0107{1}, I2P startuje i szuka peer\u00f3w.";
    t[16] = "Also you can setup your browser to use the I2P proxy to reach eepsites.";
    t[17] = "Mo\u017cesz skonfigurowa\u0107 swoj\u0105 przegl\u0105dark\u0119, by u\u017cywa\u0142a proxy I2P do po\u0142\u0105cze\u0144 z eepsites.";
    t[20] = "Congratulations on getting I2P installed!";
    t[21] = "Gratulacje pomy\u015blnego zainstalowania I2P!";
    t[32] = "More information can be found on the {0}I2P browser proxy setup page{1}.";
    t[33] = "Wi\u0119cej informacji mo\u017cna znale\u017a\u0107 na {0}stronie ustawie\u0144 proxy przegl\u0105darki I2P{1}.";
    t[34] = "Point your IRC client to {0}localhost:6668{1} and say hi to us on {2}#i2p{3}.";
    t[35] = "Skieruj swojego klienta IRC do {0}localhost:6668{1} i przywitaj si\u0119 z nami na {2}#i2p{3}.";
    t[44] = "While you are waiting, please {0}adjust your bandwidth settings{1} on the {2}configuration page{3}.";
    t[45] = "W czasie gdy czekasz, prosz\u0119 {0}dostosuj swoje ustawienia przepustowo\u015bci{1} na {2}stronie konfiguracji{3}.";
    t[50] = "Do not use SOCKS for this.";
    t[51] = "Nie u\u017cywaj w tym celu SOCKS.";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 28) << 1;
    java.lang.Object found = table[idx];
    if (found != null && msgid.equals(found))
      return table[idx + 1];
    return null;
  }
  public java.util.Enumeration getKeys () {
    return
      new java.util.Enumeration() {
        private int idx = 0;
        { while (idx < 56 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 56);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 56 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

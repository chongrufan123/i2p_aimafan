/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.news;
public class messages_mg extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[56];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-07-08 14:40+0000\nLast-Translator: zzzi2p\nLanguage-Team: Malagasy (http://www.transifex.com/otf/I2P/language/mg/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: mg\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[2] = "Welcome to I2P!";
    t[3] = "Tongasoa eto amin'i I2P!";
    t[4] = "Just enter 127.0.0.1 (or localhost) port 4444 as a http proxy into your browser settings.";
    t[5] = "Ampidiro fotsiny ny 127.0.0.1(na localhost) sy port 4444 mba ho proxy http ao anatin'ny fanitsiana ny firejena tranon-kalanao.";
    t[12] = "Once you have a \"shared clients\" destination listed on the left, please {0}check out{1} our {2}FAQ{3}.";
    t[13] = "Rehefa mahita \"shared clients\" eo amin'ny  lisitra amin'ny ankavia , dia {0}jereo ny{1} misy ny {2}Fanontaniana mateti-pitranga{3}.";
    t[14] = "Please {0}have patience{1} as I2P boots up and finds peers.";
    t[15] = "Azafady{0}miandrasa  kely{1}mbola mamelona tena sy mitady olona hifandraisana i I2P.";
    t[16] = "Also you can setup your browser to use the I2P proxy to reach eepsites.";
    t[17] = "Azonao atao koa ny manomana ny fiejerena tranonkala ny mba ampiasa ny proxy I2P rehefa hijery eepsites.";
    t[20] = "Congratulations on getting I2P installed!";
    t[21] = "Arahabaina fa tontosa ny fametrahana an'i I2P!";
    t[32] = "More information can be found on the {0}I2P browser proxy setup page{1}.";
    t[33] = "Misy filazana hafa koa azo jerena ao amin''ny {0}Pejy fanitsian''ny proxy hoan''ny I2P{1}.";
    t[34] = "Point your IRC client to {0}localhost:6668{1} and say hi to us on {2}#i2p{3}.";
    t[35] = "Tondroy ny fampiresahana IRC eo amin''ny {0}localhost:6668{1} dia miresaha aminay eo amin''ny {2}#i2p{3}.";
    t[44] = "While you are waiting, please {0}adjust your bandwidth settings{1} on the {2}configuration page{3}.";
    t[45] = "Mandra-piandry, mba{0}amboary ny bandwidth{1}eo amin''ny {2}pejy fanitsiana{3}";
    t[50] = "Do not use SOCKS for this.";
    t[51] = "Aza mampiasa SOCKS amin'ity.";
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

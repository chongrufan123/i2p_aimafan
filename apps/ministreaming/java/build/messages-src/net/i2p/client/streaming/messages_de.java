/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.client.streaming;
public class messages_de extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[86];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2017-06-30 21:32+0000\nLast-Translator: Ettore Atalan <atalanttore@googlemail.com>\nLanguage-Team: German (http://www.transifex.com/otf/I2P/language/de/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: de\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Message expired";
    t[3] = "Nachricht nicht mehr g\u00fcltig";
    t[6] = "Invalid destination";
    t[7] = "Ung\u00fcltiges Ziel";
    t[10] = "Local lease set invalid";
    t[11] = "Lokales Leaseset ung\u00fcltig";
    t[12] = "Connection was reset";
    t[13] = "Verbindung wurde zur\u00fcckgesetzt";
    t[22] = "Local network failure";
    t[23] = "Fehler im lokalen Netzwerk";
    t[30] = "No local tunnels";
    t[31] = "Keine lokalen Tunnel";
    t[36] = "Failed delivery to local destination";
    t[37] = "Konnte nicht zur lokalen Destination zugestellt werden";
    t[38] = "Unsupported encryption options";
    t[39] = "Nicht unterst\u00fctzte Verschl\u00fcsselungsoptionen";
    t[40] = "Local router failure";
    t[41] = "Fehler im lokalen Router";
    t[44] = "Failure code";
    t[45] = "Fehlercode";
    t[50] = "Invalid message";
    t[51] = "Ung\u00fcltige Nachricht";
    t[56] = "Message timeout";
    t[57] = "Nachrichtenzeit\u00fcberschreitung";
    t[58] = "Session closed";
    t[59] = "Sitzung geschlossen";
    t[60] = "Local destination shutdown";
    t[61] = "Lokale Destination geschlossen";
    t[64] = "Destination lease set expired";
    t[65] = "Leaseset der Destination abgelaufen";
    t[68] = "Buffer overflow";
    t[69] = "Puffer\u00fcberlauf";
    t[72] = "Destination lease set not found";
    t[73] = "Destinations Leaseset nicht gefunden";
    t[82] = "Invalid message options";
    t[83] = "Ung\u00fcltige Nachrichtenoptionen";
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

/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_de extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[166];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-11-24 13:40+0000\nLast-Translator: Moritz Neumann <Moritzcneumann@web.de>\nLanguage-Team: German (http://www.transifex.com/otf/I2P/language/de/)\nLanguage: de\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nPlural-Forms: nplurals=2; plural=(n != 1);\n";
    t[2] = "Dropping tunnel requests: High load";
    t[3] = "Ignoriere Tunnelanfragen: Hohe Last";
    t[4] = "Firewalled";
    t[5] = "Firewall aktiv";
    t[10] = "IPv4: OK; IPv6: Firewalled";
    t[11] = "IPv4: OK; IPv6: Mit Firewall";
    t[12] = "Rejecting tunnels: Hidden mode";
    t[13] = "Weise Tunnel ab: Versteckter Modus";
    t[14] = "IPv4: Symmetric NAT; IPv6: OK";
    t[15] = "IPv4: Symmetrisches NAT; IPv6: OK";
    t[20] = "Dropping tunnel requests: Overloaded";
    t[21] = "Ignoriere Tunnelanfragen: \u00fcberlastet";
    t[24] = "Rejecting tunnels";
    t[25] = "Weise Tunnelanfragen zur\u00fcck";
    t[30] = "IPv4: Testing; IPv6: Firewalled";
    t[31] = "IPv4: Pr\u00fcfvorgang; IPv6: Mit Firewall";
    t[38] = "Testing";
    t[39] = "Teste";
    t[44] = "Rejecting tunnels: Bandwidth limit";
    t[45] = "Weise Tunnelanfragen zur\u00fcck: Bandbreitenbeschr\u00e4nkung erreicht";
    t[54] = "Rejecting tunnels: Shutting down";
    t[55] = "Weise Tunnelanfragen zur\u00fcck: Beende Router";
    t[58] = "IPv4: Testing; IPv6: OK";
    t[59] = "IPv4: Pr\u00fcfvorgang; IPv6: OK";
    t[62] = "Rejecting tunnels: Request overload";
    t[63] = "Weise Tunnelanfragen zur\u00fcck: \u00dcberlast an Anfragen";
    t[68] = "OK";
    t[69] = "OK";
    t[70] = "Rejecting tunnels: Limit reached";
    t[71] = "Weise Tunnelanfragen zur\u00fcck: Begrenzung erreicht";
    t[74] = "IPv4: Firewalled; IPv6: OK";
    t[75] = "IPv4: Mit Firewall; IPv6: OK";
    t[78] = "IPv4: Disabled; IPv6: Firewalled";
    t[79] = "IPv4: Deaktiviert; IPv6: Mit Firewall";
    t[84] = "Accepting tunnels";
    t[85] = "Akzeptiere Tunnelanfragen";
    t[88] = "IPv4: Disabled; IPv6: OK";
    t[89] = "IPv4: Deaktiviert; IPv6: OK";
    t[92] = "Accepting most tunnels";
    t[93] = "Akzeptiere die meisten Tunnelanfragen";
    t[94] = "Symmetric NAT";
    t[95] = "Symmetrisches NAT";
    t[96] = "Rejecting most tunnels: Bandwidth limit";
    t[97] = "Weise die meisten Tunnelanfragen zur\u00fcck: Bandbreitenbeschr\u00e4nkung erreicht";
    t[98] = "Dropping tunnel requests: Queue time";
    t[99] = "Ignoriere Tunnelanfragen: zu lange Warteschlange";
    t[100] = "Dropping tunnel requests: High job lag";
    t[101] = "Tunnelanforderungen werden verworfen: Hohe Aufgabenverz\u00f6gerung";
    t[102] = "Dropping tunnel requests: Too slow";
    t[103] = "Ignoriere Tunnelanfragen: zu langsam";
    t[104] = "Disconnected";
    t[105] = "Getrennt";
    t[106] = "Rejecting most tunnels: High number of requests";
    t[107] = "Weise Tunnelanfragen zur\u00fcck: hohe Anzahl an Anfragen";
    t[124] = "Port Conflict";
    t[125] = "Portkonflikt";
    t[130] = "Rejecting tunnels: Starting up";
    t[131] = "Weise Tunnelanfragen ab: Initialisieren";
    t[132] = "Rejecting tunnels: High message delay";
    t[133] = "Weise Tunnelanfragen zur\u00fcck: hohe Nachrichtenlatenz";
    t[138] = "IPv4: Symmetric NAT; IPv6: Testing";
    t[139] = "IPv4: Symmetrisches NAT; IPv6: Pr\u00fcfvorgang";
    t[142] = "IPv4: Disabled; IPv6: Testing";
    t[143] = "IPv4: Deaktiviert; IPv6: Pr\u00fcfvorgang";
    t[152] = "IPv4: OK; IPv6: Testing";
    t[153] = "IPv4: OK; IPv6: Pr\u00fcfvorgang";
    t[158] = "Rejecting tunnels: Connection limit";
    t[159] = "Weise Tunnelanfragen zur\u00fcck: Verbindungslimit erreicht";
    t[164] = "IPv4: Firewalled; IPv6: Testing";
    t[165] = "IPv4: Mit Firewall; IPv6: Pr\u00fcfvorgang";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 83) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 81) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 166)
        idx -= 166;
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
        { while (idx < 166 && table[idx] == null) idx += 2; }
        public boolean hasMoreElements () {
          return (idx < 166);
        }
        public java.lang.Object nextElement () {
          java.lang.Object key = table[idx];
          do idx += 2; while (idx < 166 && table[idx] == null);
          return key;
        }
      };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}

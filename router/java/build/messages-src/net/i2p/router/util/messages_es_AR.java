/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.util;
public class messages_es_AR extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[166];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P routerconsole\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2019-12-19 14:09+0000\nLast-Translator: zzzi2p, 2022\nLanguage-Team: Spanish (Argentina) (https://www.transifex.com/otf/teams/12694/es_AR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: es_AR\nPlural-Forms: nplurals=3; plural=n == 1 ? 0 : n != 0 && n % 1000000 == 0 ? 1 : 2;\n";
    t[2] = "Dropping tunnel requests: High load";
    t[3] = "Desechando solicitudes de t\u00fanel: Carga elevada";
    t[4] = "Firewalled";
    t[5] = "Bloqueado por cortafuegos (firewall)";
    t[10] = "IPv4: OK; IPv6: Firewalled";
    t[11] = "IPv4: OK; IPv6: Bloqueado por firewall";
    t[12] = "Rejecting tunnels: Hidden mode";
    t[13] = "Rechazando t\u00faneles: Modo oculto";
    t[14] = "IPv4: Symmetric NAT; IPv6: OK";
    t[15] = "IPv4: NAT sim\u00e9trico; IPv6: OK";
    t[20] = "Dropping tunnel requests: Overloaded";
    t[21] = "Desechando solicitudes de t\u00fanel: Sobrecargado";
    t[24] = "Rejecting tunnels";
    t[25] = "Rechazando t\u00faneles";
    t[30] = "IPv4: Testing; IPv6: Firewalled";
    t[31] = "IPv4: Probando; IPv6: Bloqueado por firewall";
    t[38] = "Testing";
    t[39] = "Probando";
    t[44] = "Rejecting tunnels: Bandwidth limit";
    t[45] = "Rechazando t\u00faneles: L\u00edmite de ancho de banda";
    t[54] = "Rejecting tunnels: Shutting down";
    t[55] = "Rechazando t\u00faneles: Apagando";
    t[58] = "IPv4: Testing; IPv6: OK";
    t[59] = "IPv4: Probando; IPv6: OK";
    t[62] = "Rejecting tunnels: Request overload";
    t[63] = "Rechazando t\u00faneles: Sobrecarga de solicitudes";
    t[68] = "OK";
    t[69] = "OK";
    t[70] = "Rejecting tunnels: Limit reached";
    t[71] = "Rechazando t\u00faneles: Se ha alcanzado el l\u00edmite";
    t[74] = "IPv4: Firewalled; IPv6: OK";
    t[75] = "IPv4: Bloqueado por firewall; IPv6: OK";
    t[78] = "IPv4: Disabled; IPv6: Firewalled";
    t[79] = "IPv4: Deshabilitado; IPv6: Bloqueado por firewall";
    t[84] = "Accepting tunnels";
    t[85] = "Aceptando t\u00faneles";
    t[88] = "IPv4: Disabled; IPv6: OK";
    t[89] = "IPv4: Deshabilitado; IPv6: OK";
    t[92] = "Accepting most tunnels";
    t[93] = "Aceptando la mayor\u00eda de los t\u00faneles";
    t[94] = "Symmetric NAT";
    t[95] = "NAT sim\u00e9trico";
    t[96] = "Rejecting most tunnels: Bandwidth limit";
    t[97] = "Rechazando la mayor\u00eda de los t\u00faneles: L\u00edmite de ancho de banda";
    t[98] = "Dropping tunnel requests: Queue time";
    t[99] = "Desechando solicitudes de t\u00fanel: Tiempo en cola";
    t[100] = "Dropping tunnel requests: High job lag";
    t[101] = "Desechando solicitudes de t\u00fanel: Alto retraso de trabajo";
    t[102] = "Dropping tunnel requests: Too slow";
    t[103] = "Desechando  solicitudes de t\u00fanel: Demasiado lento";
    t[104] = "Disconnected";
    t[105] = "Desconectado";
    t[106] = "Rejecting most tunnels: High number of requests";
    t[107] = "Rechazando la mayor\u00eda de los t\u00faneles: Elevado n\u00famero de peticiones";
    t[124] = "Port Conflict";
    t[125] = "Conflicto de puertos";
    t[130] = "Rejecting tunnels: Starting up";
    t[131] = "Rechazando t\u00faneles: Inicializando";
    t[132] = "Rejecting tunnels: High message delay";
    t[133] = "Rechazando t\u00faneles: Elevado retardo del mensaje";
    t[138] = "IPv4: Symmetric NAT; IPv6: Testing";
    t[139] = "IPv4: NAT sim\u00e9trico; IPv6: Probando";
    t[142] = "IPv4: Disabled; IPv6: Testing";
    t[143] = "IPv4: Deshabilitado; IPv6: Probando";
    t[152] = "IPv4: OK; IPv6: Testing";
    t[153] = "IPv4: OK; IPv6: Probando";
    t[158] = "Rejecting tunnels: Connection limit";
    t[159] = "Rechazando t\u00faneles: L\u00edmite de la conexi\u00f3n";
    t[164] = "IPv4: Firewalled; IPv6: Testing";
    t[165] = "IPv4: Bloqueado por firewall; IPv6: Probando";
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

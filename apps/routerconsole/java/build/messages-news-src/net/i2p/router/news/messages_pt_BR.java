/* Automatically generated by GNU msgfmt.  Do not modify!  */
package net.i2p.router.news;
public class messages_pt_BR extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[56];
    t[0] = "";
    t[1] = "Project-Id-Version: I2P\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2021-05-08 04:32+0000\nLast-Translator: Eduardo Rodrigues\nLanguage-Team: Portuguese (Brazil) (http://www.transifex.com/otf/I2P/language/pt_BR/)\nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nLanguage: pt_BR\nPlural-Forms: nplurals=2; plural=(n > 1);\n";
    t[2] = "Welcome to I2P!";
    t[3] = "Boas-Vindas ao I2P!";
    t[4] = "Just enter 127.0.0.1 (or localhost) port 4444 as a http proxy into your browser settings.";
    t[5] = "Apenas entre com 127.0.0.1 (ou localhost) porta 4444 como um proxy http nas configura\u00e7\u00f5es do seu navegador.";
    t[6] = "I2P Development Team";
    t[7] = "Equipe de Desenvolvimento I2P";
    t[12] = "Once you have a \"shared clients\" destination listed on the left, please {0}check out{1} our {2}FAQ{3}.";
    t[13] = "Uma vez que voc\u00ea tenha um destino de \"clientes compartilhados\" listado a esquerda, por favor, {0}verifique{1} nossa p\u00e1gina de  {2}Perguntas Frequentes{3}.";
    t[14] = "Please {0}have patience{1} as I2P boots up and finds peers.";
    t[15] = "Por favor, {0}tenha paci\u00eancia{1}: o roteador I2P est\u00e1 sendo inicializado e em busca de pares.";
    t[16] = "Also you can setup your browser to use the I2P proxy to reach eepsites.";
    t[17] = "Al\u00e9m disso, voc\u00ea pode configurar o seu navegador para usar o proxy I2P para acessar eepsites.";
    t[20] = "Congratulations on getting I2P installed!";
    t[21] = "Parab\u00e9ns! I2P foi instalado!";
    t[32] = "More information can be found on the {0}I2P browser proxy setup page{1}.";
    t[33] = "Informa\u00e7\u00f5es adicionais podem ser encontradas na {0}p\u00e1gina de configura\u00e7\u00e3o do proxy de navega\u00e7\u00e3o I2P{1}.";
    t[34] = "Point your IRC client to {0}localhost:6668{1} and say hi to us on {2}#i2p{3}.";
    t[35] = "Aponte seu cliente IRC para {0}localhost:6668{1} e d\u00ea um oi para n\u00f3s em {2}#i2p{3}.";
    t[44] = "While you are waiting, please {0}adjust your bandwidth settings{1} on the {2}configuration page{3}.";
    t[45] = "Enquanto voc\u00ea aguarda, por favor, {0}ajuste as especifica\u00e7\u00f5es da sua banda larga{1} na {2}p\u00e1gina de configura\u00e7\u00e3o{3}.";
    t[50] = "Do not use SOCKS for this.";
    t[51] = "N\u00e3o use SOCKS para isto!";
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
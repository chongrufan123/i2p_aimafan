/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package i2p.susi.dns.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


/*
 * Created on Sep 02, 2005
 *
 *  This file is part of susidns project, see http://susi.i2p/
 *
 *  Copyright (C) 2005 <susi23@mail.i2p>
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * $Revision: 1.2 $
 */

    // http://www.crazysquirrel.com/computing/general/form-encoding.jspx
    if (request.getCharacterEncoding() == null)
        request.setCharacterEncoding("UTF-8");

    response.setHeader("X-Frame-Options", "SAMEORIGIN");
    response.setHeader("Content-Security-Policy", "default-src 'self'; style-src 'self' 'unsafe-inline'; script-src 'self'; form-action 'self'; frame-ancestors 'self'; media-src 'none'");
    response.setHeader("X-XSS-Protection", "1; mode=block");
    response.setHeader("X-Content-Type-Options", "nosniff");
    response.setHeader("Referrer-Policy", "no-referrer");
    response.setHeader("Accept-Ranges", "none");


      out.write('\n');
      out.write('\n');
      out.write('\n');
      i2p.susi.dns.VersionBean version = null;
      synchronized (application) {
        version = (i2p.susi.dns.VersionBean) _jspx_page_context.getAttribute("version", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (version == null){
          version = new i2p.susi.dns.VersionBean();
          _jspx_page_context.setAttribute("version", version, javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      i2p.susi.dns.BaseBean base = null;
      synchronized (session) {
        base = (i2p.susi.dns.BaseBean) _jspx_page_context.getAttribute("base", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (base == null){
          base = new i2p.susi.dns.BaseBean();
          _jspx_page_context.setAttribute("base", base, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      i2p.susi.dns.Messages intl = null;
      synchronized (application) {
        intl = (i2p.susi.dns.Messages) _jspx_page_context.getAttribute("intl", javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        if (intl == null){
          intl = new i2p.susi.dns.Messages();
          _jspx_page_context.setAttribute("intl", intl, javax.servlet.jsp.PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>");
      out.print(intl._t("Introduction"));
      out.write(" - SusiDNS</title>\n<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(base.getTheme());
      out.write("susidns.css?");
      out.print(net.i2p.CoreVersion.VERSION);
      out.write("\">\n<script src=\"js/messages.js?");
      out.print(net.i2p.CoreVersion.VERSION);
      out.write("\" type=\"text/javascript\"></script>\n</head>\n<body>\n<div class=\"page\">\n<hr>\n<div id=\"navi\">\n<a id=\"overview\" class=\"active\" href=\"index\">");
      out.print(intl._t("Overview"));
      out.write("</a>&nbsp;\n<a class=\"abook\" href=\"addressbook?book=private&amp;filter=none\">");
      out.print(intl._t("Private"));
      out.write("</a>&nbsp;\n<a class=\"abook\" href=\"addressbook?book=local&amp;filter=none\">");
      out.print(intl._t("Local"));
      out.write("</a>&nbsp;\n<a class=\"abook\" href=\"addressbook?book=router&amp;filter=none\">");
      out.print(intl._t("Router"));
      out.write("</a>&nbsp;\n<a class=\"abook\" href=\"addressbook?book=published&amp;filter=none\">");
      out.print(intl._t("Published"));
      out.write("</a>&nbsp;\n<a id=\"subs\" href=\"subscriptions\">");
      out.print(intl._t("Subscriptions"));
      out.write("</a>&nbsp;\n<a id=\"config\" href=\"config\">");
      out.print(intl._t("Configuration"));
      out.write("</a>\n</div>\n<hr>\n<div id=\"content\">\n<h3 id=\"whatitis\">");
      out.print(intl._t("What is the address book?"));
      out.write("</h3>\n<p class=\"whatitis\">\n");
      out.print(intl._t("The address book application is part of your I2P installation."));
      out.write('\n');
      out.print(intl._t("You can use it to connect human-readable names, like i2p-projekt.i2p, to I2P Destinations."));
      out.write("\n</p><p class=\"whatitis\">\n");
      out.print(intl._t("It regularly updates your hosts.txt file from distributed sources or \"subscriptions\"."));
      out.write('\n');
      out.print(intl._t("In the default configuration, the address book is only subscribed to {0}.", "i2p-projekt.i2p"));
      out.write('\n');
      out.print(intl._t("Subscribing to additional sites is easy, just add them to your <a href=\"subscriptions\">subscriptions</a>."));
      out.write("\n</p>\n<p class=\"whatitis\">\n");
      out.print(intl._t("For more information on naming in I2P, see <a href=\"http://i2p-projekt.i2p/naming.html\" target=\"_blank\">the overview</a>."));
      out.write("\n</p>\n<h3 id=\"howtouse\">");
      out.print(intl._t("How to use the Address Book?"));
      out.write("</h3>\n<p class=\"howtouse\">\n");
      out.print(intl._t("The I2P Address Book allows you to manage addresses by sorting them into categories."));
      out.write('\n');
      out.print(intl._t("You may use these categories according to how you intend to use the address."));
      out.write("\n</p>\n<ul class=\"howtouse\">\n<li>");
      out.print(intl._t("Router: These addresses are added automatically, by your subscriptions. If you publish an address book, the router address book will be shared with other I2P users."));
      out.write("</li>\n<li>");
      out.print(intl._t("Local: This is your personal address book, for hosts which you publish and share with others."));
      out.write("</li>\n<li>");
      out.print(intl._t("Private: This address book if used for addresses which you do not want to share with other I2P users."));
      out.write("</li>\n</ul>\n<h3 id=\"howitworks\">");
      out.print(intl._t("How does the address book application work?"));
      out.write("</h3>\n<p class=\"howitworks\">\n");
      out.print(intl._t("The address book application regularly polls your subscriptions and merges their content into your \"router\" address book."));
      out.write('\n');
      out.print(intl._t("Then it merges your \"local\" address book into the router address book as well."));
      out.write('\n');
      out.print(intl._t("If configured, the router address book is now written to the \"published\" address book, which will be publicly available if you are running an I2P Site."));
      out.write("\n</p><p class=\"howitworks\">\n");
      out.print(intl._t("The router also uses a private address book, which is not merged or published."));
      out.write('\n');
      out.print(intl._t("Hosts in the private address book can be accessed by you but their addresses are never distributed to others."));
      out.write('\n');
      out.print(intl._t("The private address book can also be used for aliases of hosts in your other address books."));
      out.write("\n</p>\n<div class=\"illustrate howitworks\">\n<object type=\"image/svg+xml\" data=\"images/how.svg?");
      out.print(net.i2p.CoreVersion.VERSION);
      out.write("\">\n<img src=\"themes/images/how.png\" border=\"0\" alt=\"address book working scheme\" title=\"How the address book works\" class=\"illustrate\" />\n</object>\n</div>\n</div>\n<div id=\"footer\">\n<hr>\n<p class=\"footer\">susidns v");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version.version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" &copy; <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version.url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" target=\"_blank\">susi</a> 2005</p>\n</div>\n</div>\n</body>\n</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

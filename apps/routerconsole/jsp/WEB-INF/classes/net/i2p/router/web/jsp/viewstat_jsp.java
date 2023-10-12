/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package net.i2p.router.web.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewstat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


/*
 * USE CAUTION WHEN EDITING
 * Trailing whitespace OR NEWLINE on the last line will cause
 * IllegalStateExceptions !!!
 *
 * Do not tag this file for translation.
 */
net.i2p.I2PAppContext ctx = net.i2p.I2PAppContext.getGlobalContext();
net.i2p.router.web.StatSummarizer ss = net.i2p.router.web.StatSummarizer.instance(ctx);
if (ss == null) {
    response.sendError(403, "Stats disabled");
    return;
}
boolean rendered = false;
/****  unused
String templateFile = request.getParameter("template");
if (templateFile != null) {
  java.io.OutputStream cout = response.getOutputStream();
  response.setContentType("image/png");
  rendered = ss.renderPng(cout, templateFile);
}
****/
net.i2p.stat.Rate rate = null;
String stat = request.getParameter("stat");
String period = request.getParameter("period");
boolean fakeBw = (stat != null && ("bw.combined".equals(stat)));
net.i2p.stat.RateStat rs = null;
if (stat != null)
    rs = ctx.statManager().getRate(stat);
if ( !rendered && ((rs != null) || fakeBw) ) {
  long per = -1;
  try {
    if (fakeBw)
      per = 60*1000;
    else
      per = Long.parseLong(period);
    if (!fakeBw)
      rate = rs.getRate(per);
    if ( (rate != null) || (fakeBw) ) {
      if (stat != null &&
          (stat.indexOf('\n') >= 0 || stat.indexOf('\r') >= 0)) {
          response.sendError(403, "param");
          return;
      }
      java.io.OutputStream cout = response.getOutputStream();
      String format = request.getParameter("format");
      response.setHeader("X-Content-Type-Options", "nosniff");
      if ("xml".equals(format)) {
        if (!fakeBw) {
          response.setContentType("text/xml");
          response.setHeader("Content-Disposition", "attachment; filename=\"" + stat + ".xml\"");
          rendered = ss.getXML(rate, cout);
        }
      } else {
        response.setContentType("image/png");
        response.setHeader("Content-Disposition", "inline; filename=\"" + stat + ".png\"");
        // very brief 45 sec expire
        response.setDateHeader("Expires", ctx.clock().now() + (45*1000));
        response.setHeader("Accept-Ranges", "none");
        // http://jira.codehaus.org/browse/JETTY-1346
        // This doesn't actually appear in the response, but it fixes the problem,
        // so Jetty must look for this header and close the connection.
        response.setHeader("Connection", "Close");
        int width = -1;
        int height = -1;
        int periodCount = -1;
        int end = 0;
        String str = request.getParameter("width");
        if (str != null) try { width = Integer.parseInt(str); } catch (NumberFormatException nfe) {}
        str = request.getParameter("height");
        if (str != null) try { height = Integer.parseInt(str); } catch (NumberFormatException nfe) {}
        str = request.getParameter("periodCount");
        if (str != null) try { periodCount = Integer.parseInt(str); } catch (NumberFormatException nfe) {}
        str = request.getParameter("end");
        if (str != null) try { end = Integer.parseInt(str); } catch (NumberFormatException nfe) {}
        boolean hideLegend = Boolean.parseBoolean(request.getParameter("hideLegend"));
        boolean hideGrid = Boolean.parseBoolean(request.getParameter("hideGrid"));
        boolean hideTitle = Boolean.parseBoolean(request.getParameter("hideTitle"));
        boolean showEvents = Boolean.parseBoolean(request.getParameter("showEvents"));
        boolean showCredit = false;
        if (request.getParameter("showCredit") != null)
          showCredit = Boolean.parseBoolean(request.getParameter("showCredit"));
        if (fakeBw)
            rendered = ss.renderRatePng(cout, width, height, hideLegend, hideGrid, hideTitle, showEvents, periodCount, end, showCredit);
        else
            rendered = ss.renderPng(rate, cout, width, height, hideLegend, hideGrid, hideTitle, showEvents, periodCount, end, showCredit);
      }
      if (rendered)
        cout.close();
      //System.out.println("Rendered period " + per + " for the stat " + stat + "? " + rendered);
    }
  } catch (NumberFormatException nfe) {}
}
/*
 *  Send a 403 instead of a 404, because the server sends error.jsp
 *  for 404 errors, complete with the summary bar, which would be
 *  a huge load for a page full of graphs if there's a problem
 */
if (!rendered) {
    if (stat != null) {
        stat = net.i2p.data.DataHelper.stripHTML(stat);
        response.sendError(403, "The stat " + stat + " is not available, it must be enabled for graphing on the stats configuration page.");
    } else {
        response.sendError(403, "No stat specified");
    }
}

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
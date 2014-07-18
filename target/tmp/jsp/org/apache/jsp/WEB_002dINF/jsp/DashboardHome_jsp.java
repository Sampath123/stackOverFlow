package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DashboardHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div ng-controller=\"DashBoardController\">\n");
      out.write("\t<!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("    <div class=\"container-fluid\"> \n");
      out.write("        <h1>Welcome to Comments Dashboard</h1>\n");
      out.write("        <p>This is  dashboard for Stack over Flow comments. Dashboard includes pie chart, bar chart, line chart. </p>\n");
      out.write("           </div>\n");
      out.write("      <div class=\"container-fluid\" style=\"background-color:#A9D0F5; \">\n");
      out.write("    <div class=\"row placeholders\" >\n");
      out.write("    <center>\n");
      out.write(" <h2>Dashboard Features</h2> \n");
      out.write("    </center>\n");
      out.write("   \n");
      out.write("    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("\n");
      out.write("          <h3 align=\"center\" > Comments Over Time</h3>\n");
      out.write("          <p align=\"center\">We will proovide a dashboard of comments count over time. </p>\n");
      out.write("           <center><a href=\"#/dashboard/comments\" class=\"btn btn-success btn-sm\">Get Dashboard</a>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("          <h3 align=\"center\" > Edited Comments Over Time</h3>\n");
      out.write("          <p align=\"center\">We will proovide a dashboard  of edited comments count over time. </p>\n");
      out.write("          <center><a href=\"#/dashboard/edited-comments\" class=\"btn btn-success btn-sm\">Get Dashboard</a>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("          <h3 align=\"center\"> Top user who comments most </h3>\n");
      out.write("          <p align=\"center\">We will proovide a dashboard of top user count over time.</p>\n");
      out.write("          <center><a href=\"#/dashboard/top-users\" class=\"btn btn-success btn-sm\">Get Dashboard</a>\n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-6 col-sm-12\">\n");
      out.write("          <h3 align=\"center\">Reputation to comments correlation</h3>\n");
      out.write("          <p align=\"center\">We will proovide a dashboard of correlation between reputation and comments</p>\n");
      out.write("          <center><a href=\"#/dashboard/correlation\" class=\"btn btn-success btn-sm\">Get Dashboard</a>\n");
      out.write("        </center>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("\t\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

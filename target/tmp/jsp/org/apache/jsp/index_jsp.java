package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  \n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>\n");
      out.write("    </title>\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("     <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"https://www.google.com/jsapi\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"assets/js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"assets/js/ngGoogleCharts.js\" type=\"text/javascript\"></script>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("             .bigGraph {width:500px;height:500px;float:left;}\n");
      out.write("             .mediumGraph {width:400px;height:400px;float:left;}\n");
      out.write("             .smallGraph {width:200px;height:200px;float:left;}\n");
      out.write("         </style>\n");
      out.write(" \n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body ng-controller=\"IndexCtrl\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"hero-unit\">\n");
      out.write("        <div>\n");
      out.write("           <div google-chart=\"PieChart\" ng-model=\"data1\" class=\"bigGraph\"></div>\n");
      out.write("         <div google-chart=\"BarChart\" ng-model=\"data1\" class=\"bigGraph\"></div>\n");
      out.write("        <div google-chart=\"BarChart\" ng-model=\"data2\" class=\"bigGraph\"></div>\n");
      out.write("        \n");
      out.write("         </div>        \n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <script src=\"assets/js/jquery-1.8.3.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

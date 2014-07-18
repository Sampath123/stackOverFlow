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
      out.write("<html lang=\"en\" ng-app=\"myApp\">\n");
      out.write("\t<head>\n");
      out.write("    \t<meta charset=\"utf-8\">\n");
      out.write("    \t<title>Comments@StackOverFlow</title>\n");
      out.write("    \t<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    \t<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("     \t<link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("     \t<link href=\"assets/css/main.css\" rel=\"stylesheet\"> \n");
      out.write("     \t<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://www.google.com/jsapi\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/service.js\" type=\"text/javascript\"></script>         \n");
      out.write("        <script src=\"assets/js/ngGoogleCharts.js\" type=\"text/javascript\"></script>\n");
      out.write("         \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("             .bigGraph {width:1200px;height:590px;float:left;}\n");
      out.write("             .mediumGraph {width:570px;height:500px;float:left;}\n");
      out.write("             .smallGraph {width:200px;height:200px;float:left;}\n");
      out.write("    </style>\n");
      out.write("   </head>\n");
      out.write("<body class=\"container\" ng-app=\"myApp\">\n");
      out.write("  <div class=\"header\" style=\"padding-top:70px;\">\n");
      out.write(" \t <div class=\"navbar navbar-fixed-top\" role=\"navigation\"  style=\"background-color: #A4C8EC;\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("     <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("       <p>\n");
      out.write("\t      <img class=\"navbar-top\" src=\"assets/img/so-logo.png\" width=\"150\" height=\"80\" align=\"left\">\n");
      out.write("\t      <span class=\"navbar-brand title \"> Comments@DashBoard </span>\n");
      out.write("\t  </p>\n");
      out.write("    </div>\n");
      out.write("    <!-- Collection of nav links, forms, and other content for toggling -->\n");
      out.write("    <div id=\"navbarCollapse\" class=\"collapse navbar-collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li class=\"active\"><a href=\"#/home\">Home</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Dashboards <b class=\"caret\"></b></a>\n");
      out.write("                <ul role=\"menu\" class=\"dropdown-menu ,nav navbar-nav navbar-right navbar-center\"\">\n");
      out.write("                    <li><a href=\"#/dashboard/comments\">CommentsOverTime</a></li>\n");
      out.write("                    <li><a href=\"#/dashboard/edited-comments\">Edited CommentsOverTime</a></li>\n");
      out.write("                    <li><a href=\"#/dashboard/top-users\">Top User with count</a></li>\n");
      out.write("                    <li><a href=\"#/dashboard/correlation\">Reputation-Comment Count correlation</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li ><a href=\"#/home\">Feedback</a></li>\n");
      out.write("       </ul>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"body\">\n");
      out.write("        <div ng-view></div>\n");
      out.write("    </div>  \n");
      out.write("     \n");
      out.write(" <!--  <footer>\n");
      out.write("        <p>&copy; Stack-over-flow Comments@DashBoard </p>\n");
      out.write("      </footer>  -->\n");
      out.write("               \n");
      out.write("    <script src=\"assets/js/jquery-1.8.3.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("    </body>\n");
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

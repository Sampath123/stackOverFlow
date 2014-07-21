package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CommentsDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" <div ng-controller=\"CommentController\">\n");
      out.write(" \t<div class=\"container\">\n");
      out.write("\t\t<h1>Comments Over Time </h1>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write(" <div class=\"col-sm-1-12\">\n");
      out.write("     \t\t<div form=\"form\">   \n");
      out.write("   \t\t\t<div class=\"form-group leftPlace\">\n");
      out.write("          \t<label for=\"name\" required=\"required\">Start Date</label>\n");
      out.write("          \t<input type=\"date\" ng-model=\"fromDate\" class=\"form-control \" name=\"startDate\" placeholder=\"Start Date\">\n");
      out.write("        \t</div>\n");
      out.write("\n");
      out.write("        \t<div class=\"form-group leftPlace\">\n");
      out.write("         \t<label for=\"name\" required=\"required\">End Date</label>\n");
      out.write("         \t<input type=\"date\" ng-model=\"endDate\" class=\"form-control \" name=\"endDate\" placeholder=\"End Date\">\n");
      out.write("        \t</div>    \n");
      out.write("         \n");
      out.write("           <div class=\"form-group leftPlace\"><br>\n");
      out.write("             <button type=\"Show\"  class=\"btn btn-2 btn-lg\" id=\"show\" style=\"background-color: #A4C8EC;\" ng-click=\"saveNew()\">Show </button>\n");
      out.write("           </div>\n");
      out.write("       </div>\n");
      out.write("   \t</div>\n");
      out.write("    <div class=col-sm-12 \">\n");
      out.write("\t\t<div google-chart=\"ColumnChart\" ng-model=\"data1\" class=\"bigGraph\"></div>\n");
      out.write("\t</div>\t\n");
      out.write("</div>\n");
      out.write("\t<!-- <table class=\"table table-bordered table-hover\">\n");
      out.write("\t\t<thead >\n");
      out.write("\t\t\t<tr >\n");
      out.write("\t\t\t\t<td>Date</td>\n");
      out.write("\t\t\t\t<td>Comment Count</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t//| getDates:fromDate:endDate\n");
      out.write("\t\t\t<tr ng-repeat=\"comment in Comments \">\n");
      out.write("\t\t\t\t<td>{{ comment.date}} </td>\n");
      out.write("\t\t\t\t<td> {{ comment.count }} </td>\n");
      out.write("\t\t    </tr>\n");
      out.write("\t   </tbody>    \n");
      out.write("   </table> -->\n");
      out.write("</div>\n");
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

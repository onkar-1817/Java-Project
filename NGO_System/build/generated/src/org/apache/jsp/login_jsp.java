package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login form</title>\n");
      out.write("        <link rel=\"stylesheet\"  href=\"bootstrap.css\"/>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-color: lightblue;\n");
      out.write("            }\n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("                width: 30%;\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 130px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                 box-shadow: 0px 0px 5px 5px black;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                font-size: 40px;\n");
      out.write("                margin-top: -30px;\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            a\n");
      out.write("            {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Login\" method=\"POST\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1 style=\"text-align: center\">Login form</h1>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Email<span style=\"color:red\">*</span></label>\n");
      out.write("                     <input type=\"email\" name=\"txt_email\" placeholder=\"Enter your email\" class=\"form-control\" required/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Password</label>\n");
      out.write("                    <input type=\"password\" name=\"txt_pass\" class=\"form-control\" placeholder=\"Enter password\" onkeypress=\"javascript:return isNumber(event)\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <a href=\"registration.jsp\">New Member Register Here</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <input type=\"submit\" name=\"btn_save\" value=\"Login\" class=\"btn btn-primary btn-lg btn-block\"/>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </form>    \n");
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

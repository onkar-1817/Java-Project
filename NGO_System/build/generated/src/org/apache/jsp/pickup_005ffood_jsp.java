package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pickup_005ffood_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin_Header.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Food Pickup Form</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("    <script src=\"validation.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            \n");
      out.write("             background-color: lightblue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .jumbotron\n");
      out.write("        {\n");
      out.write("            margin: auto auto auto auto;\n");
      out.write("            width: 45%;\n");
      out.write("            background-color: lightgoldenrodyellow;\n");
      out.write("            box-shadow: 0px 0px 5px 5px black;\n");
      out.write("            border-radius: 20px;\n");
      out.write("        } \n");
      out.write("        .container\n");
      out.write("        {\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        label\n");
      out.write("        {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        h1\n");
      out.write("        {\n");
      out.write("            margin-top: -15px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>admin</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style>\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color: #111;\n");
      out.write("}\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    background-color: lightblue;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("<ul>\n");
      out.write("    <li><a class=\"active\" href=\"food_listing.jsp\">Food</a></li>\n");
      out.write("    <li><a href=\"pickup_food.jsp\">Pickup Food</a></li>\n");
      out.write("    <li><a href=\"clothlisting.jsp\">Clothes</a></li>\n");
      out.write("    <li><a href=\"clothes_pickup.jsp\">Pickup Clothes</a></li>\n");
      out.write("    <li><a href=\"notification.jsp\">Notification</a></li>\n");
      out.write("    <li><a href=\"Admin_Feedback_view.jsp\">Feedback</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"Pickup_food\" method=\"POST\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1 style=\"text-align: center\">Pickup Forms</h1>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>ID</label>\n");
      out.write("                <input type=\"text\" name=\"txt_id\"  class=\"form-control\"/>\n");
      out.write("                    <label> Full Name</label>\n");
      out.write("                    <input type=\"text\" name=\"txt_name\" placeholder=\"Enter your name\" class=\"form-control\" onkeypress=\"javasctript:return isString(event)\" required=\"\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Preferred Date</label>\n");
      out.write("                    <input type=\"date\" name=\"txt_date\" class=\"form-control\" min=\"2024-01-01\" max=\"2025-12-31\" required/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Preferred Time</label>\n");
      out.write("                    <input type=\"time\" name=\"txt_time\" class=\"form-control\" required/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <label>Address</label>\n");
      out.write("                    <textarea rows=\"3\" class=\"form-control\" name=\"txt_address\" placeholder=\"Enter your address\"  onkeypress=\"javasctript:return isAlphanumric(event)\" required></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </br>\n");
      out.write("            <input type=\"submit\" name=\"btn_save\" value=\"Donate\" class=\"btn btn-primary btn-lg btn-block\"/>\n");
      out.write("              </br>\n");
      out.write("              <input type=\"submit\" name=\"btn_save\" value=\"Update\" class=\"btn btn-primary btn-lg btn-block\"/>\n");
      out.write("              </br>\n");
      out.write("            <input type=\"submit\" name=\"btn_save\" value=\"Delete\" class=\"btn btn-secondary btn-lg btn-block\"/>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </form>>     \n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("</html> ");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fpayment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("    <script src=\"validation.js\"></script>\n");
      out.write("    <title>UPI Payment</title>\n");
      out.write("    <style>\n");
      out.write("        .mainbody {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 645px;\n");
      out.write("            height: 540px;\n");
      out.write("            position: relative; \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .jumbotron1 {\n");
      out.write("            width: 60%;\n");
      out.write("            height: 500px;\n");
      out.write("            background-color:skyblue;\n");
      out.write("            position: absolute; /* Use absolute positioning */\n");
      out.write("            top: 50%; /* Center vertically */\n");
      out.write("            left: 50%; /* Center horizontally */\n");
      out.write("            transform: translate(-50%, -50%); /* Center the div */\n");
      out.write("            border-radius: 30px;\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0,0,0,0.2);\n");
      out.write("            box-shadow: 0px 0px 20px rgba(0,0,0,0.5);\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .nestedCarddivleft{\n");
      out.write("           \n");
      out.write("            width: 25%;\n");
      out.write("            width: 40%;\n");
      out.write("            height: 500px;\n");
      out.write("            background-color: #8b5eb0;        \n");
      out.write("                     \n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            float: left;\n");
      out.write("               \n");
      out.write("            box-shadow: inset 0px 0px 150px 0px #000;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nestedCarddivright{\n");
      out.write("            \n");
      out.write("            width: 60%;\n");
      out.write("            height: 500px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 30px;\n");
      out.write("            float: right;           \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"Payment_Page\" method=\"POST\">      \n");
      out.write("        <br>\n");
      out.write("    <div class=\"mainbody\">\n");
      out.write("        <div class=\"jumbotron1\">\n");
      out.write("            <div class=\"nestedCarddivleft leftDiv \">\n");
      out.write("                            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"nestedCarddivright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <br>\n");
      out.write("                   <br><br>                 \n");
      out.write("                 <h3  align=\"center\" style=\"margin-left: 2%;  font-weight: bold;\" >UPI Payment</h3>\n");
      out.write("                 <br><br>\n");
      out.write("               \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input \" name=\"txt_upi_id\"  type=\"text\" id=\"maleName\" style=\"color: black\"required>\n");
      out.write("                                    <label class=\"label\" for=\"maleName\">UPI ID</label>\n");
      out.write("                            </div><br>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input class=\"input \"  name=\"amount\" type=\"tel\" id=\"femaleName\" style=\"color: black\" onkeypress=\"javascript:return isNumber(event)\" required>\n");
      out.write("                                    <label class=\"label\" for=\"femaleName\">Amount</label>\n");
      out.write("                            </div>                                                               \n");
      out.write("            </div>\n");
      out.write("                <br>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                     <!--<button class=\"btn btn-primary btn-lg btn-block\" type=\"button\">Next</button>-->\n");
      out.write("                                     <button style=\" width: 90%; font-size: 20px; margin-left: 20px;\" class=\"btn btn-primary hidden\" name=\"txt_submit\" value=\"Pay\" id=\"register\" type=\"submit\" >Pay</button>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                </div>             \n");
      out.write("                        </div>\n");
      out.write("                    </div>     \n");
      out.write("        </div>\n");
      out.write("    </form>    \n");
      out.write("</body>\n");
      out.write("</html>");
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

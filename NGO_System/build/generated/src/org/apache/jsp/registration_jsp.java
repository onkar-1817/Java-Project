package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               background-color: lightblue;\n");
      out.write("            }\n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("                width:55%;\n");
      out.write("                background-color: lightgoldenrodyellow;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                box-shadow: 0px 0px 5px 5px black;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                margin-top: -30px;\n");
      out.write("                font-size: 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                margin-top: -5px;\n");
      out.write("            }\n");
      out.write("            span\n");
      out.write("            {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("              color:#273746; \n");
      out.write("              font-weight: bold;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">   \n");
      out.write("             <form action=\"Registration\" method=\"POST\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <h1 style=\"text-align: center\">Registration form</h1>\n");
      out.write("             <hr>\n");
      out.write("            \n");
      out.write("          <div class=\"row\">\n");
      out.write("               <div class=\"col-sm-4\">\n");
      out.write("                  <label>Registration number</label>\n");
      out.write("                  <input type=\"number\" name=\"txt_fnum\" placeholder=\"Enter  number\" class=\"form-control\" onkeypress=\"javasctript:return isNumber(event)\" required=\"\"/>\n");
      out.write("              </div>\n");
      out.write("                 <div class=\"col-sm-8\">\n");
      out.write("                  <label>Name of owner<span>*</span></label>\n");
      out.write("                  <input type=\"text\" name=\"txt_owner\" placeholder=\"Enter name\" class=\"form-control\" onkeypress=\"javasctript:return isString(event)\"required=\"Hello\" title=\"Hello\"/>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("             </br>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-12\">\n");
      out.write("                     <label>Organization Name<span>*</span></label>\n");
      out.write("                  <input type=\"text\" name=\"txt_name\" placeholder=\"Enter organization name\" class=\"form-control\"onkeypress=\"javasctript:return isString(event)\"required=\"Hello\" title=\"Hello\"/>\n");
      out.write("              </div>\n");
      out.write("                 \n");
      out.write("            </div>\n");
      out.write("              </br>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-12\">\n");
      out.write("                 <label>Address</label>\n");
      out.write("                 <textarea rows=\"3\" class=\"form-control\" name=\"txt_add\" placeholder=\"Enter your address\"  onkeypress=\"javasctript:return isAlphanumric(event)\" required></textarea>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("               </br>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-6\">\n");
      out.write("                     <label>District</label>\n");
      out.write("                     <select class=\"form-control\" name=\"txt_dist\">\n");
      out.write("                         <option>Select District</option>\n");
      out.write("                         <option>Kolhapur</option>\n");
      out.write("                     </select>\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"col-sm-6\">\n");
      out.write("                     <label>Taluka</label>\n");
      out.write("                     <select class=\"form-control\" name=\"txt_tal\">\n");
      out.write("                         <option>Select Taluka</option>\n");
      out.write("                         <option>Gadhinglaj</option>\n");
      out.write("                     </select>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("                </br>\n");
      out.write("             <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-6\">\n");
      out.write("                      <label>Email<span>*</span></label>\n");
      out.write("                     <input type=\"email\" name=\"txt_email\" placeholder=\"Enter your email\" class=\"form-control\" required=\"\"/>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-6\">\n");
      out.write("                     <label>Phone Number</label>\n");
      out.write("                     <input type=\"text\" name=\"txt_num\" placeholder=\"Enter your number\" class=\"form-control\" onkeypress=\"javascript:return isNumber(event)\" pattern=\"[789][0-9]{9}\" maxlength=\"10\" minlength=\"10\" required=\"\"/>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("                </br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-sm-12\">\n");
      out.write("                     <label>Password</label>\n");
      out.write("                     <input type=\"password\" name=\"txt_password\" placeholder=\"Enter your password\" class=\"form-control\" onkeypress=\"javasctript:return isNumber(event)\" required=\"\"/>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("             </br>\n");
      out.write("             <input type=\"submit\" name=\"btn_save\" value=\"Signup\" class=\"btn btn-primary btn-lg btn-block\"/>\n");
      out.write("             </br>\n");
      out.write("             <input type=\"submit\" name=\"btn_save\" value=\"Cancel\" class=\"btn btn-secondary btn-lg btn-block\"/>\n");
      out.write("        </div>\n");
      out.write("             </form>    \n");
      out.write("         </div>\n");
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

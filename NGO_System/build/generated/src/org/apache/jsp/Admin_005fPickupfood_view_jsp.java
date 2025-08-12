package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Admin_005fPickupfood_view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin pickupfood</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style>\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("                width:110%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
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
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("  <thead class=\"thead-dark\">\n");
      out.write("      <b> <center><h3>PICKUP FOOD</h3></center></b>\n");
      out.write("\t<br>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Sr.No</th>\n");
      out.write("      <th scope=\"col\">Fullname</th>\n");
      out.write("      <th scope=\"col\">Date</th>\n");
      out.write("      <th scope=\"col\">Time</th>\n");
      out.write("      <th scope=\"col\">Address</th>\n");
      out.write("      <th scope=\"col\">Action</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    ");

      Connection cn=null;
    Statement st=null;
    
 try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/NGO_system","root","root");
           st=cn.createStatement();
           String sql="select * from pickup_food;";
           ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
           
           
      
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <form action=\"Pickup_food\" method=\"POST\">\n");
      out.write("     <td>");
      out.print(rs.getString("s_id"));
      out.write("\n");
      out.write("         <input type=\"hidden\" name=\"txt_id\"  value=\"");
      out.print(rs.getString("s_id"));
      out.write("\"/>\n");
      out.write("     </td>\n");
      out.write("      <td>\n");
      out.write("          <input type=\"text\" name=\"txt_name\"  value=\"");
      out.print(rs.getString("fullname"));
      out.write("\"/>\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          <input type=\"text\" name=\"txt_date\" value=\"");
      out.print(rs.getString("dat"));
      out.write("\"/>\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          <input type=\"text\"  name=\"txt_time\" value=\"");
      out.print(rs.getString("tim"));
      out.write("\"/>\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          <input type=\"text\" name=\"txt_address\"  value=\"");
      out.print(rs.getString("address"));
      out.write("\"/>\n");
      out.write("      </td>\n");
      out.write("      <td>\n");
      out.write("          <input type=\"submit\" name=\"btn_save\" value=\"Update\" class=\"btn btn-primary \"/>\n");
      out.write("       <input type=\"submit\" name=\"btn_save\" value=\"Delete\" class=\"btn btn-secondary \"/>\n");
      out.write("      </td>\n");
      out.write("        </form>\n");
      out.write("    </tr>\n");
      out.write("     ");

     }
        }catch(Exception ex)
        {
           
        }
     
      out.write("\n");
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>    \n");
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

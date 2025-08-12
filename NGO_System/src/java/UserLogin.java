/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Onkar
 */
@WebServlet(urlPatterns = {"/UserLogin"})
public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         PrintWriter out=resp.getWriter();
        
        String email=req.getParameter("txt_email");
        String password=req.getParameter("txt_pass");
        String event=req.getParameter("btn_save");
        
        
       out.println(email);
       out.println(password);
        
       Database db=new Database();
       out.println(db.ConnectDB());
        HttpSession session=req.getSession();
       if(event.equals("Login"))
       {
            Connection cn=null;
             Statement st=null;
             try
             {
              Class.forName("com.mysql.jdbc.Driver");
              cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ngo_system","root","root");
              st=cn.createStatement();
              String sql="select * from register where email='"+email.toString()+"'and pass='"+password.toString()+"'";
                 ResultSet rs=st.executeQuery(sql);
              if(rs.next())
              {
                  
                            session.setAttribute("name", rs.getString("owner_name"));
                            session.setAttribute("address", rs.getString("address"));
                            session.setAttribute("contact", rs.getString("phone_number"));
                            resp.setContentType("text/html;charset=UTF-8");
                            out.println("<script type=\"text/javascript\">");
                             out.println("alert('Login Successfully');");
                           out.println("location='food_listing.jsp';");
                               out.println("</script>");
 
              }
              else
              {
                  out.println("Login Failed");
              }
                 
             }catch(Exception ex)
             {
                 out.println(ex.toString());
             }
       }

    }

   
}

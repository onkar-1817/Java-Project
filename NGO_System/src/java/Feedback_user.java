/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Onkar
 */
public class Feedback_user extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String name=req.getParameter("txt_name");
        String email=req.getParameter("txt_email");
        String feedback=req.getParameter("txt_mes");
        String button=req.getParameter("btn_save");
        
        out.println(name);
        out.println(email);
        out.println(feedback);
        
        
        Database db=new Database();
       out.println(db.ConnectDB());
       
       if(button.equals("Submit"))
      {
          String sql="insert into feedback(fullname,email,feedback) values('"+name+"','"+email+"','"+feedback+"')";
          String result=db.Query(sql, "Source Added Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='feedback.jsp';");
           out.println("</script>");
      
      }
    }

   
}

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
public class Notification extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String number=req.getParameter("txt_num");
        String name=req.getParameter("txt_name");
        String message=req.getParameter("txt_msg");
        String button=req.getParameter("btn_save");
        String id=req.getParameter("txt_id");
        out.println(number);
        out.println(name);
        out.println(message);
        
        Database db=new Database();
       out.println(db.ConnectDB());

       if(button.equals("Submit"))
      {
          String sql="insert into notification(regnumber,orgname,message) values('"+number+"','"+name+"','"+message+"')";
          String result=db.Query(sql, "Source Added Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='notification.jsp';");
           out.println("</script>");
      
      }
         if(button.equals("Update"))
      {
          String sql="update notification set regnumber='"+number+"',orgname='"+name+"',message='"+message+"' where s_id='"+id+"'";
          String result=db.Query(sql, "Source Updated Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Notification_view.jsp';");
           out.println("</script>");
      
      }
            if(button.equals("Delete"))
      {
          String sql="delete from notification where s_id='"+id+"'";
          String result=db.Query(sql, "Source Deleted Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Notification_view.jsp';");
           out.println("</script>");
      
      }
        
    }
    
}
    

   


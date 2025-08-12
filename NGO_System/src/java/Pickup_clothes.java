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
public class Pickup_clothes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String name=req.getParameter("txt_name");
        String date=req.getParameter("txt_date");
        String timing=req.getParameter("txt_time");
        String address=req.getParameter("txt_address");
        String button=req.getParameter("btn_save");
        String id=req.getParameter("txt_num");
       
                
        out.println(name);
        out.println(date);
        out.println(timing);
        out.println(address);
        
        Database db=new Database();
       out.println(db.ConnectDB());
       
           if(button.equals("Donate"))
      {
          String sql="insert into pickup_clothes(fullname,tim,dat,address) values('"+name+"','"+date+"','"+timing+"','"+address+"')";
          String result=db.Query(sql, "Source Added Successfully...");
          out.println(result);
          
           resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='clothes_pickup.jsp';");
           out.println("</script>");
      
      }
            
           if(button.equals("Update"))
      {
          String sql="update pickup_clothes set fullname='"+name+"',dat='"+date+"',tim='"+timing+"',address='"+address+"' where s_id='"+id+"'";
          String result=db.Query(sql, "Source Updated Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Pickupclothes.view.jsp';");
           out.println("</script>");
      
      }
          if(button.equals("Delete"))
      {
          String sql="delete from pickup_clothes where s_id='"+id+"'";
          String result=db.Query(sql, "Source Deleted Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Pickupclothes.view.jsp';");
           out.println("</script>");
      
      }

    }
}

           
      

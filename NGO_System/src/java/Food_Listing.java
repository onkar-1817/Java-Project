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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Onkar
 */
public class Food_Listing extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
       
        
        String name=req.getParameter("txt_name");
        String food=req.getParameter("txt_food");
        String type=req.getParameter("checkbox");
        String quantity=req.getParameter("txt_num");
        String date=req.getParameter("txt_date");
        String button=req.getParameter("btn_save");
        String id=req.getParameter("txt_id");
        
        
        out.println(name);
        out.println(food);
        out.println(type);
        out.println(quantity);
        out.println(date);
        
         Database db=new Database();
       out.println(db.ConnectDB());
        HttpSession session=req.getSession();
      if(button.equals("Submit"))
      {
          String sql="insert into food(fullname,item,typefood,qun,expi_date,contact) values('"+name+"','"+food+"','"+type+"','"+quantity+"','"+date+"','"+session.getAttribute("contact")+"')";
          String result=db.Query(sql, "Source Added Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='pickup_food.jsp';");
           out.println("</script>");

      
      }
        if(button.equals("Update"))
      {
          String sql="update food set fullname='"+name+"',item='"+food+"',typefood='"+type+"',qun='"+quantity+"',expi_date='"+date+"' where s_id='"+id+"'";
          String result=db.Query(sql, "Source Updated Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Foodlisting_view.jsp';");
           out.println("</script>");
       
    }
        if(button.equals("Delete"))
      {
          String sql="delete from food where s_id='"+id+"'";
          String result=db.Query(sql, "Source Deleted Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Foodlisting_view.jsp';");
           out.println("</script>");
       
    }
    }
   
}

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
public class Clothes_listing extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String number=req.getParameter("txt_num");
        String name=req.getParameter("txt_name");
        String type=req.getParameter("checkbox");
        String item=req.getParameter("txt_item");
        String quantity=req.getParameter("txt_qun");
        String condition=req.getParameter("txt_check");
        String detail=req.getParameter("txt_add");
        String button=req.getParameter("btn_save");
        String id=req.getParameter("txt_id");
        
        
        out.println(number);
        out.println(name);
        out.println(type);
        out.println(item);
        out.println(quantity);
        out.println(condition);
        out.println(detail);
        
        Database db=new Database();
       out.println(db.ConnectDB());
        HttpSession session=req.getSession();
          if(button.equals("Submit"))
      {
          String sql="insert into clothes(name,typeclothes,item,condcloth,qun,detail,contact) values('"+name+"','"+type+"','"+item+"','"+condition+"','"+quantity+"','"+detail+"','"+session.getAttribute("contact")+"')";
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
          String sql="update clothes set regnumber='"+number+"',orgname='"+name+"',typeclothes='"+type+"',item='"+item+"',condcloth='"+condition+"',qun='"+quantity+"',detail='"+detail+"' where s_id='"+id+"'";
          String result=db.Query(sql, "Source Updated Successfully...");
          out.println(result);
          
           resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Clothlisting_view.jsp';");
           out.println("</script>");
      
      }
              if(button.equals("Delete"))
      {
          String sql="delete from clothes where s_id='"+id+"'";
          String result=db.Query(sql, "Source Deleted Successfully...");
          out.println(result);
          
           resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Clothlisting_view.jsp';");
           out.println("</script>");
      
      }
          
        
    }
    
}
       

       

   

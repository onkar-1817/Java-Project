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
public class Pickup_food extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
        String name=req.getParameter("txt_name");
        String date=req.getParameter("txt_date");
        String time=req.getParameter("txt_time");
        String address=req.getParameter("txt_address");
        String button=req.getParameter("btn_save");
         String id=req.getParameter("txt_id");
        
        out.println(name);
        out.println(date);
        out.println(time);
        out.println(address);
        
        Database db=new Database();
       out.println(db.ConnectDB());
       
       if(button.equals("Donate"))
      {
          String sql="insert into pickup_food(fullname,tim,dat,address) values('"+name+"','"+time+"','"+date+"','"+address+"')";
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
          String sql="update pickup_food set fullname='"+name+"',dat='"+date+"',tim='"+time+"',address='"+address+"' where s_id='"+id+"'";
          String result=db.Query(sql, "Source Updated Successfully...");
          out.println(result);
          
          resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Pickupfood.view.jsp';");
           out.println("</script>");
      
      }
          if(button.equals("Delete"))
      {
          String sql="delete from pickup_food  where s_id='"+id+"'";
          String result=db.Query(sql, "Source Deleted Successfully...");
          out.println(result);
          
           resp.setContentType("text/html;charset=UTF-8");
           out.println("<script type=\"text/javascript\">");
           out.println("alert('"+result+"');");
           out.println("location='Admin_Pickupfood.view.jsp';");
           out.println("</script>");
      
      }   
            
    }

    
}

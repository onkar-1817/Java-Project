import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out=resp.getWriter();
       
       String number=req.getParameter("txt_fnum");
       String name=req.getParameter("txt_owner");
       String organization=req.getParameter("txt_name");
       String address=req.getParameter("txt_add");
       String Dist=req.getParameter("txt_dist");
       String Tal=req.getParameter("txt_tal");
       String email=req.getParameter("txt_email");
       String phone=req.getParameter("txt_num");
       String pass=req.getParameter("txt_password");
       String button=req.getParameter("btn_save");
       String id=req.getParameter("txt_id");
       
       out.println(number);
       out.println(name);
       out.println(organization);
       out.println(address);
       out.println(Dist);
       out.println(Tal);
       out.println(email);
       out.println(phone);
       out.println(pass);
       
       Database db=new Database();
       out.println(db.ConnectDB());
       
      if(button.equals("Signup"))
      {
          String sql="insert into register(registration_number,owner_name,organization,address,district,taluka,email,phone_number,pass) values('"+number+"','"+name+"','"+organization+"','"+address+"','"+Dist+"','"+Tal+"','"+email+"','"+phone+"','"+pass+"')";
          String result=db.Query(sql, "Source Added Successfully...");
          out.println(result);
          
           resp.setContentType("text/html;charset=UTF-8");
                            out.println("<script type=\"text/javascript\">");
                             out.println("alert('Registration Successfully');");
                           out.println("location='User_login.jsp';");
                               out.println("</script>");
      
      }
              
     }

   
}

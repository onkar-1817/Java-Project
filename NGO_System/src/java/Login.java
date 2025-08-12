import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {

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
           if(email.equals("admin@gmail.com")&&password.equals("1234"))
           {
               resp.sendRedirect("Admin_Foodlisting_view.jsp");
           }
           else
           {
               out.println("Enter Correct Email and Password");
           }
       }

    }
    
       
    }

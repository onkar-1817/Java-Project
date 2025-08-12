import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Database {
    Connection cn=null;
    Statement st=null;
    
    public String ConnectDB()
    {
        try
           
            
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/NGO_system","root","root");
            return("Database Connected");
        }catch(Exception ex)
        {
            return(ex.toString());
        }
    }
    public String Query(String sql,String msg)
     {
       try
       {
          st=cn.createStatement();
          st.executeUpdate(sql);
          return(msg);
       }catch(Exception ex)
       {
         return(ex.toString());
       }
     }
    }

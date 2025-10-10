package jdbcprograms;
import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception  {
        
        
        String URL = "jdbc:mysql://localhost:3306/studentdb";
        String USER = "root";
        String PASSWORD = "root"; 
        
        // Step-1: Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("The Driver is loaded successfully");
        
        // Step-2: Establishing the connection
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connection Established");
        
        // Step-3: statement creation
        Statement st = con.createStatement();
        
        // Step-4: execute a query
        st.executeUpdate("CREATE TABLE student2(sid int, sname varchar(20))");
        System.out.println("Table created");
        
        st.close();
        con.close();
    }
}
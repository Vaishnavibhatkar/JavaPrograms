package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select_Demo
{

	public static void main(String[] args) throws Exception 
	{
	
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
               
               PreparedStatement ps = con.prepareStatement("Select * from register");
               ResultSet rs = ps.executeQuery();
               
               while(rs.next())
               {
            	   String name =rs.getString("name");
            	   System.out.println("name : "+ name);
            	   
            	   String email =rs.getString("email");
            	   System.out.println("email : "+ email);
            	   
            	   String password =rs.getString("password");
            	   System.out.println("password : "+ password);
            	   
            	   String gender =rs.getString("gender");
            	   System.out.println("gender : "+ gender);
            	   
            	   String city =rs.getString("city");
            	   System.out.println("city : "+ city);
            	   
            	   System.out.println("---------------------------------------------------------------");
               }
               con.close();
               
	}

}

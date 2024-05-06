package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_Delete 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String name ="Pooja";
		 String email = "shraddhabhatkar@gmail.com";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("Update register set name=?  where email=? ");
        ps.setString(1,name);
        ps.setString(2,email);
        
        int count = ps.executeUpdate();
        if(count > 0)
        {
        	System.out.println("Updated Successfully");
        }
        else
        {
        	System.out.println("Updation Fail");
        }
        con.close();
	}
	

}

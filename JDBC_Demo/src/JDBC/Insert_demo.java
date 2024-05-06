package JDBC;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Insert_demo
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println(" Enter the email ");
		String email = sc.nextLine();
		
		System.out.println(" Enter the password ");
		String password = sc.nextLine();
		
		System.out.println(" Enter the gender ");
		String gender = sc.nextLine();
		
		System.out.println(" Enter the city ");
		String city = sc.nextLine();
		
		
		
//		String name = "Ram";
//        String email = "Ram@123";
//        String password = "Ram123";
//        String gender = "male";
//        String city = "Nashik";
        
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
        
       // PreparedStatement ps = con.prepareStatement("insert into register value('Vaishnavi', 'vaishnavibhatkar433@gmail.com','V@ishu221','Female','Jalgaonjamod')");

     //   PreparedStatement ps = con.prepareStatement("insert into register values('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"')");

        PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
        
        
        ps.setString(1, name) ;
        ps.setString(2, email);
        ps.setString(3, password);
        ps.setString(4, gender);
        ps.setString(5, city);
        
        int i = ps.executeUpdate();
       
        if(i > 0)
        {
        	System.out.println("Success");
        }
        else
        {
        	System.out.println("Fail");
        }
        		
        

	}


	



}

package HelloJava;
import java.util.*;

public class UserInput {

	public static void main(String[] args) 
	{
	  Scanner Sc = new Scanner (System.in);
	  System.out.println(" Enter The Full Name:");
	  String FullName =Sc.next();
	  System.out.println("Enter The Age :");
	  int age=Sc.nextInt();
	  System.out.println("Enter The Phone No :");
	  long phoneNo=Sc.nextLong();
	  System.out.println("Enter The city :");
	  String city=Sc.next();
	  System.out.println("--------------------------------------");
	  System.out.println("FullName:"+FullName );
	  System.out.println("age:"+age );
	  System.out.println("phone No:"+phoneNo );
	  System.out.println("city:"+city );


	}

}
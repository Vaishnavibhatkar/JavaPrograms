package HelloJava;
import java.util.*;
public class Calculator {

	public static void main(String[] args)
	{
	String yn;
	do
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the No 1");
		int no1 = Sc.nextInt();
		System.out.println(" Enter The No 2");
		int no2 = Sc.nextInt();
		System.out.println( " Select Symbol ( + , - , / , %");
		String symbol=Sc.next();
		int res;
		switch(symbol)
		{
			
			case"+": res=no1+no2 ;
			         System.out.println("Addition of Two NO is:" +res);
			         break;
			case"-": res=no1-no2 ;
	                 System.out.println("Substraction of Two NO is:" +res);
	                 break;
			case"/": res=no1/no2 ;
	                 System.out.println("Division of Two NO is:" +res);
	                 break;
			case"%": res=no1%no2 ;
	                 System.out.println("Percentage  of Two NO is:" +res);
	                 break;
	        default: System.out.println("Invaid Symbol");
	                 break;
		}
		  System.out.println( "Do you want to continue(Pass y for yes and n for No)");
		  yn=Sc.next();
	}
	 while ( yn.equals("y")|| yn.equals("Y"));
}
}

				
	     
	        
	         

	         

	         

			         
			
			
			
		
		

	



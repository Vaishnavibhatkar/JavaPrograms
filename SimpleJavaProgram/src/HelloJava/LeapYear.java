package HelloJava;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter A Year:");
		int year=Sc.nextInt();
		if  ((year%4==0) || (year%100==0) || (year%400==0))
		{
			System.out.println(" The year is Leap");
		}
		else
		{
			System.out.println(" the year is not Leap");
		}

	}

}

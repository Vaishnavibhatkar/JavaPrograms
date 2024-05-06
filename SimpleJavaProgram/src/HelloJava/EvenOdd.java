package HelloJava;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sc.nextInt();
		if( a%2==0)
		{
			System.out.println(" a is even no");
		}
		else
		{
			System.out.println(" a is odd no ");
		}

	}

}

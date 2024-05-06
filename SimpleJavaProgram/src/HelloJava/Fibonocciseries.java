package HelloJava;
import java.util.*;
public class Fibonocciseries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int no=sc.nextInt();
		int a=0 ,b=1 ;
		System.out.println(a+" "+b);
		int c ;
		for(int i=1; i<=no;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	

	}

}

package HelloJava;
import java.util.*;
public class FactorialusingRecursion {
    static int fact=1  ;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no :");
		int no= sc.nextInt();
	    FactorialusingRecursion obj=new FactorialusingRecursion();
	    obj.calfact(no);
	    System.out.print("the factorial of "+no+" is "+fact);
	}
	 void calfact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			calfact(no-1);
		}
		
	}

}

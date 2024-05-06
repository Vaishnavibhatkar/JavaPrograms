package HelloJava;
import java.util.*;
public class FibonacciSeriesUsingRec {
	/* static int a=0 , b=1 ,c ;
	public static void main(String[] args)
	{
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter any NO: ");
	  int no=sc.nextInt();
	  System.out.println(a+" "+b);
	  FibonacciSeriesUsingRec Obj = new FibonacciSeriesUsingRec();
	  Obj=printFib(no);
	}
	  static FibonacciSeriesUsingRec printFib(int i)
	  {
		  if(i>=1)
		  {
			  c=a+b;
			  System.out.println(" "+c);
			  a=b;
			  b=c;
			  printFib(i-1);
		  }
		return null;
	  }
	 */
	public static void main(String[] args) {
		FibonacciSeriesUsingRec obj=new FibonacciSeriesUsingRec();
		System.out.println(obj.printno(15));
	}
	public static int printno(int no) 
	{
		int a=0 , b=1 ,c=0;
		System.out.println(a+""+b); 
	    for(int i=1; i<=no; i++)
	    {
	    	c=a+b;
	    	System.out.println(""+c);
	    	a=b;
	    	b=c;
	    }
		return c;
	
	}
}



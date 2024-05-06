package HelloJava;

public class FactorialNo 
{
	public static void main(String arg[])
	{
		int no = 5;
		int fact=1;
		for(int i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		System.out.println(" the factorial no is:" +fact);
	}

}

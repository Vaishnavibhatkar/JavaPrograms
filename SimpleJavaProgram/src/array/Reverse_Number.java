//Write a java program and reverse a number 2546
package array;

public class Reverse_Number {

	public static void main(String[] args)
	{
		int no = 2546;
		int rev=0,rem=0;
		while(no!=0)
		{
		
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		 System.out.println(" the reverse number is : "+rev);
		

	}

}

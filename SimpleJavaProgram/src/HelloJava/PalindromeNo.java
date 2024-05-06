package HelloJava;

public class PalindromeNo {

	public static void main(String[] args)
	{
		int no = 6754;
		int temp=no;
		int rem,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			

		}
		if(no==rev)
		{
			System.out.println("The no is palindrome :" +rev);
		}
		else
		{
			System.out.println("The no is not palindrome :" +rev);
		}

	}

}

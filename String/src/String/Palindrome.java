package String;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s = "Madam";
		String rev = " ";
		
		for(int i=s.length()-1; i>=0;  i--)
		{
			rev= rev + s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("  Palindrome String");
		}
	
		else
		{
			System.out.println(" not a Palindrome String ");
		}
	}
}
	
				

	



package array;

public class Palindrome_String
{

	public static void main(String[] args) 
	{
		String s="nitingfh";
		String s1="";
		String temp=s;
		
		for (int i =s.length()-1; i >=0 ;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		if(temp.equals(s1)) 
		{
			System.out.println(temp+" is Palindrome String");
		}
		else 
		{
			System.out.println(temp+" is not Palindrome String");
		}
	}
}

package Program;
import java.util.*;
public class Functionn 
{
	public static int Multiply(int a , int b)
	{
		return a*b;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a & b ");
			int a = sc.nextInt();
		    int b = sc.nextInt();
		    int result = Multiply( a,b);
		    System.out.println(result);
				

	}

}

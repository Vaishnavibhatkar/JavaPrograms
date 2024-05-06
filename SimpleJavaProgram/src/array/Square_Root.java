package array;
import java.util.*;

public class Square_Root
{

	public static int main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Number :");
			int no=sc.nextInt();
			try
			{
				System.out.println(Math.sqrt(no));
				{
					if(no>0)
					{
					   return 0;
					}
					
					 throw new Exception();
				 } 
			}
			catch( Exception e)
			{
				System.out.println(e);
			}
			return no;
		}

	}

}

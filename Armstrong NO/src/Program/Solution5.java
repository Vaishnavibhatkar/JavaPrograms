package Program;

public class Solution5 {

	public static void main(String[] args) 
	{
	  int n = 5;
	  //Upper Part
	  for(int i=1; i<=n; i++)
	  {
		  for(int j=1; j<=n-i; j++)
		  {
			  System.out.print(" ");
		  }
		  for (int j=2; j<=2*i-1; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  // Lower Part
	  for(int i=n; i>=1; i--)
	  {
		  for(int j=1; j<=n-i; j++)
		  {
			  System.out.print(" ");
		  }
		  for (int j=2; j<=2*i-1; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  }


	}

}

package Pattern1;

public class star7 {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=0;i<n;i++)
		
		{
			for(int j=0;j<n;j++)
			{
				if(j+i>=3) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	}




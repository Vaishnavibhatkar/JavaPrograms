package Arrayprogram;

public class array3d {

	public static void main(String[] args)
	{
		int[][][] a= { {{10,20},{30,40,50},{60,70,80,90}}};
		for(int i=0; i<a.length;i++)
		{
		  for(int j=0; i<a[i].length; j++)
			{
			   for(int k=0; k<a[i][j].length;k++)
			      { 
					System.out.print(a[i][j][k]+" ");
			      }
			       System.out.println();
			}
		}
	}
}

					
			
		//	 System.out.println(a);
		//	System.out.println(a.length);
			
		//	System.out.println(a[0]);
		//	System.out.println(a[0].length);
			
		//	System.out.println(a[0][0]);
		//	System.out.println(a[0][0].length);
			
		//	System.out.println(a[0][0][0]);
		//	System.out.println(a[0][0][0].length);
			
		

	


	

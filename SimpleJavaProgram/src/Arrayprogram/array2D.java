package Arrayprogram;

public class array2D {

	public static void main(String[] args) 
	{
		int[][] a= {{10,20,30},{40,50,60,70},{80,90,100}};
		for(int i=0;i<a.length;i++)
		{
			//for( int j=0; j<=a[i].length; j++)
			{
				//for( int k=0; k<=a[k].length;k++)
				{
					System.out.println(a+" ");   //array class
				    System.out.println(a[0]+" ");   //index array class
				    System.out.println(a[1][2]+" "); // element on 0 index
					System.out.println(a.length+" "); //length of Array
					System.out.println(a[1].length); //length of 0 index
					//System.out.println(a[0][0].length); // Error
			    }
			}

	}

	}
}


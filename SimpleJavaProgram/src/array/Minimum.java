package array;

public class Minimum {

	public static void main(String[] args) 
	{
		int[] a= {500,300,1000,700};
		int min=a[0];
		for(int i=1; i< a.length ; i++)
		{ if(min>a[i]) {
			min=a[i];
		}
			//min = Math.min( min ,a[i]);
		}
		System.out.println("Minimum of number is : "+min);
			
		}

	

}

package array;

public class Maximum_Element 
{

	public static void main(String[] args) 
	
	{
		int[] a= {100,200,300,400,500};
		int max = a[0]; // Assume the first element is the maximum
        for (int i = 1; i < a.length; i++)
        {
        	if(max<a[i]) {
        		max=a[i];
        	}
               // max = Math.max(max, a[i]);
        }
                System.out.println(" maximum element in an array is :" + max);
		

	  }
}

       

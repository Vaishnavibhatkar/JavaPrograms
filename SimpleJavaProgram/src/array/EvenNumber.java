package array;

public class EvenNumber 
{

	public static void main(String[] args) 
	{ 
		int sum=0;
		int[] a= { 10,20,30,40,55};
		for(int no:a) {
		if( no %2 ==0)
		{
			sum=sum+no;
			System.out.println(" the sum of all even no is "+sum);
		}
		
	}
	}
}
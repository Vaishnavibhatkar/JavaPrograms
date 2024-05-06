package HelloJava;
import java.util.*;
public class ArmstrongNo {

	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:");
		int no= sc.nextInt();
		int temp=no;
		int length=0;

		while(temp!=0)
		{
			temp=temp/10;
			length=length+1;
		}
		int temp2=no;
		int arm=0;
		while(temp2!=0)
		{
		 int rem;
		 int mul=1;
		 rem=temp2%10;
		 for(int i=1; i<=length; i++)
		{
			mul=mul*rem;
			
		}
		arm=arm+mul;
		temp2=temp2/10;
		}
		if(arm==no)
	
		{
			System.out.println("The no is Armstrong : "+no);
		}
		else
		{
			System.out.println("The no is not Armstrong : "+no);

		}
		
		
		

	}
}

	


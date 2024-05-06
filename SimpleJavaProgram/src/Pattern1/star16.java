package Pattern1;

public class star16 {

	public static void main(String[] args) 
	{
	        int a=1 , b=8;
	        for(int i=0; i<11; i++)
	        {
	        	for(int j=0; j<6; j++)
	        	{
	        		if(j-i>=0 || j+i>=10)
	        		{
	        			if(a<=9)
	        			{
	        				System.out.print(a+" ");
	        			}
	        			else if (a>33)
	        			{
	        				System.out.print(b+" ");
	        				b--;
	        			}
	        			else if(a%2==0 && a>9)
	        			{
	        				System.out.print("0 ");
	        			}
	        			else
	        			{
	        				System.out.print("9 ");
	        			}
	        			a++;
	        			
	        		}
	        		else
	        		{
	        			System.out.print(" ");
	        		}
	        	}
	        	System.out.println( );
	        }

	}

}

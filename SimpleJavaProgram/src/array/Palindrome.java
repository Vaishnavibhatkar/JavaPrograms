//check for palindrome: Write a java program to check if the elements of an array form a palindrome.
package array;

import java.util.ArrayList;
import java.util.Iterator;

public class Palindrome 
{
		 public static void main(String a[]) {
			 int arr[]= {121,153,212};
			 ArrayList al=new ArrayList();
			 for(int a1:arr) 
			 {
				 int rev=0;
				 int temp=a1;
				 while(a1>0) 
				 {
					int rem=a1%10;//reminder
					 rev=rev*10+rem;//reverse
					 a1=a1/10;//delete
				 }
				 if(rev==temp) 
				 {
					al.add(rev);
			     }
				
		 }
			 Iterator iter = al.iterator();
				while(iter.hasNext())
				{
					System.out.println(iter.next());
				}
		 }
}


package array;

public class Vowels_ConsonentCounts 
{
   public static void main(String arg[])
  {
	  String s =" Anand";
	  int vovelcount=0;
	  int consonantcount=0;
	  String s1=s.toLowerCase();//anand
	  for(int i=0; i<s.length(); i++)
	  {
		  char ch = s1.charAt(i);
	      if(Character.isLetter(ch))
	      {
		     if( ch == 'a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
	          {
		           vovelcount++;
		      }
	         else
	          {
		               consonantcount++;
		      }
          }
	  }
          System.out.println(" Number of vovels is :"+vovelcount++);
          System.out.println(" Number of consonantcount is :" + consonantcount++);
     
     
     
}
}

	
package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_demo
{

	public static void main(String[] args) 
	{
	    Vector v =new Vector();
	    v.add("vaishu");
	    v.add("Mahi");
	    System.out.println(v);
	    
	    System.out.println("----------------------------------------------");
	    
	    Enumeration e = v.elements();
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }

	}

}

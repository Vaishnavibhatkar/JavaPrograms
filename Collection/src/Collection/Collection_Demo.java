package Collection;

import java.util.ArrayList;

public class Collection_Demo 
{

	public static void main(String[] args)
	{
		        ArrayList al= new ArrayList();
		        al.add("aaa");
		        al.add("bbb");
		        al.add("ccc");
		        al.add("ddd");
		        System.out.println(al);
		       // System.out.println(al.contains(400));
		        
		       // System.out.println(al.isEmpty());
		        
		       //  System.out.println(al.size());
		        
		       //  al.remove(1);
		       //  System.out.println(al);
		        
		        System.out.println(al.containsAll(al));
		        System.out.println(al);
		        
		        al.clear();
		        System.out.println(al);
		       
		        
		        
		        ArrayList al2 = new ArrayList();
		        al2.add("aaa");
		        al2.add("fff");
		        
		        
		        al2.clear();
		        System.out.println(al2);
		        
		       // al.removeAll(al2);
		      //  System.out.println(al);
		      //  System.out.println(al2);
		        
		        // System.out.println(al.addAll(al2));
		       //  System.out.println(al);
		        
		       //  System.out.println(al.add("Vaishnavi"));
		       //  System.out.println(al);
		        
		        
		  
		        
		        

	  }

}
package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo 
{

	

	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm = new HashMap();
		 hm.put(101, "Vaishu");
		 hm.put(102, "Shraddha");
		 hm.put(104, "Pranita");
		 hm.put(103, "Shraddha");
		 hm.put(null, "Pankaj");
		 hm.put(null, "Abhi");
		 hm.put(106, null);
		 hm.put(109, null);
		 
		 System.out.println(hm);
		 
	//	 hm.remove(103);
		 System.out.println(hm);
		 
		 System.out.println(hm.containsKey(101));
		 System.out.println(hm.containsValue("Abhi"));
		 
	//	 hm.clear();
		 System.out.println(hm);
		 
		 System.out.println(hm.get(104));
		 
		 System.out.println(hm.isEmpty());
		 
		 System.out.println(hm.size());
		 
		 hm.replace(103, "Ram");
		 System.out.println(hm);
		 
		 
	    for(Map.Entry me : hm.entrySet());
		 {
	//		System.out.println(me.getKey() +" -> "+ me.getValue());
		 }
		 
		// Set set = hm.entrySet();
		// System.out.println(set);
		 
		// Iterator iter = set.iterator();
	   //   while(iter.hasNext())
		  {
			 // System.out.println(iter.next());
		 //     Map.Entry entry = (Map.Entry) iter.next();
		   //   System.out.println(entry.getKey()+"->"+ entry.getValue());
		  }
		  
	}

}

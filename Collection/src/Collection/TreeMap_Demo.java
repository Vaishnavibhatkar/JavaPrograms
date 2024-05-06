package Collection;
import java.util.TreeMap;

public class TreeMap_Demo 
{
	public static void main(String arg[])
	{
		TreeMap map = new TreeMap();
		map.put(104, "Ram");
		map.put(106, "Shyam");
		map.put(103, "shreya");
		map.put(105, "geeta");
		map.put(102, "Shalini");
		map.put(101, "Nmarata");
		map.put(108,"null");
		
		System.out.println(map);
		
		 
		  System.out.println(map.ceilingEntry(104));
		  System.out.println(map.ceilingKey(101));
		  
		  System.out.println(map.floorEntry(102));
		  
		   map.clear(); System.out.println(map);
		  
		  System.out.println(map.containsKey(104));
		  System.out.println(map.containsValue("geeta"));
		  
		  System.out.println(map.firstKey());
		  
		  System.out.println(map.get(106));
		  
		  System.out.println(map.headMap(104));
		  
		  System.out.println(map.higherEntry(105));
		  
		  System.out.println(map.keySet());
		  
		  System.out.println(map.pollFirstEntry());
		  
		  System.out.println(map.pollLastEntry());
		  
		  System.out.println(map.remove(104));
		 
		
		   map.replace(102, "rahul");
		   System.out.println(map);
		   
		   System.out.println(map.size());
		   
		   	   
		   System.out.println(map.subMap(101, 106));
	}
	
    
}

package Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Map_HashMap 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		System.out.println("-------------------------------------------");
		
		Map map = new HashMap();
		map.put(101 , "Vaishu");
		map.put(102, "Dnyau");
		map.put(103,"Shraddha");
		map.put(104, "Pranita");
		map.put(102, "Mahi");
		map.put(null, "yogita");
		map.put(null,"pooja");
		map.put(105, null);
		map.put(106, null);
		
		System.out.println(map);
		
	//	map.clear();
		
	//	System.out.println(map);
		
	//	System.out.println(map.containsKey(102));
	//	System.out.println(map.containsValue("Vaishu"));
		
	//	System.out.println(map.get(105));
		
	//	map.remove(101);
	//	System.out.println(map);
		
	//	map.replace(106, "Kanchan");
	//	System.out.println(map);
		
	//	System.out.println(map.size());

	}

}

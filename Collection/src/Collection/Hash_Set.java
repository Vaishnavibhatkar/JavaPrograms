package Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Hash_Set 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
	
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		hs.add("null");
		hs.add("null");
		hs.add("Vaishu");
		hs.add("Mahi");
		
		System.out.println(hs);
		hs.addAll(al);
		System.out.println(hs);
		
		System.out.println(hs.contains(100));
		System.out.println(hs.remove(400));
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.clear();
		System.out.println(hs);
		
		System.out.println("--------------------------------------------------------------");
		
		Iterator iter = hs.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
}
	}
			

}

package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Demo 
{

	public static void main(String[] args)
	{
		Set s= new HashSet();
		s.add("Vaishu");
		s.add("Mahi");
		s.add("Shraddha");
		s.add("Pooja");
		s.add(20);
		s.add("vaishu");
		s.add("null");
		s.add("null");
		
		
		//System.out.println(s);
		
		Iterator itr= s.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		
	

	}

}
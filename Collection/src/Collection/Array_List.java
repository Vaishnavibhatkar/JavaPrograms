package Collection;
import java.util.ArrayList;
import java.util.Iterator;
class Array_List 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Vaishu");
		al.add('A');
		al.add(1000);
		
	//	System.out.println(al);
		
	//	al.remove(0);
	//	System.out.println(al);
		
	//	al.removeAll(al);
	//	System.out.println(al);
		
	//	al.clear();
	//	System.out.println(al);
		
	
	//	System.out.println(al.get(0));
		
		al.set(0, 400);
		System.out.println(al);
		
	//	System.out.println(al.indexOf("Vaishu"));
		


		System.out.println(al.contains(4000));
		
	
	//	System.out.println(al.size());
		
		ArrayList al1 = new ArrayList();
		al1.add(200);
		al1.add("Mahi");
		al1.add('A');
		al1.add(2000);
		
		al.addAll(al1);
		
	//	System.out.println(al);
		
		
		
	//	Iterator iter = al.iterator();
	//	while(iter.hasNext())
	//	{
	//		System.out.println(iter.next());
		}
		
		
		
		

	}



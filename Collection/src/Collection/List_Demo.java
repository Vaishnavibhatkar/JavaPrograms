package Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Demo 
{

	public static void main(String[] args)
	{
		List l1= new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(0,40);
	    l1.add("Vaishu");
	    l1.add("null");
		l1.add(1,100);
	//	System.out.println(l1);
		
	//	Iterator itr= l1.iterator();
	//	while(itr.hasNext())
	//	System.out.println(itr.next());
		
		ListIterator litr = l1.listIterator();
		while(litr.hasNext())
			System.out.println(litr.next());

	}
}

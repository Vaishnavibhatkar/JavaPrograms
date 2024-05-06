package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Iter_demo 
{

	public static void main(String[] args)
	{
		List l =new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		ListIterator li = l.listIterator();
		while(li.hasNext() )
		{
			System.out.println(li.next());
		}
		//l.remove(2);
		//System.out.println(l);
		
		System.out.println("----------------------------------------------");
		
	
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	       l.add(50);
		   l.remove(2);
         //  l.set(3,200);
		   System.out.println(l);
		
	
	}

}

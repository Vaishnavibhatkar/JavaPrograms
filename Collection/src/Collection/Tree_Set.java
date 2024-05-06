package Collection;
import java.util.TreeSet;

public class Tree_Set 
{

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(40);
		ts.add(50);
		ts.add(10);
		ts.add(100);
		ts.add("null");
		
		System.out.println(ts);

		ts.remove(40);
		System.out.println(ts);
		
		ts.clear();
		System.out.println(ts);
		
		
	}

}

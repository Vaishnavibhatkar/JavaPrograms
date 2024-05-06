package Collection;
import java.util.Vector;

public class Vector_Demo 
{

	public static void main(String[] args) 
	{
		Vector v =new Vector(5);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		v.addElement(50);
		System.out.println(v);
		
//		v.remove(2);
	//	System.out.println(v);
		
		//v.removeAll(v);
	//	System.out.println(v.removeAll(v));
		
	//	v.removeAllElements();
	//  System.out.println(v);
		
	//	v.removeElementAt(0);
	//	System.out.println(v);
		
	//	v.removeElement(20);
	//	System.out.println(v.removeElement(20));
		
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	//	v.setElementAt("aaa", 0);
	//	System.out.println(v);
		
	//	v.set(1, "hgjhgjd");
	//	System.out.println(v);
		
	
		System.out.println(v.isEmpty());

	}

}

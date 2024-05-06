package Collection;
import java.util.Stack;

public class Stack_Demo
{

	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(10);
		s.push("Vaishu");
		s.push("Mahi");
		s.push(100);
		
		System.out.println(s);
		
	//	System.out.println(s.pop());
	//	System.out.println(s);
	//	System.out.println(s.pop());
	//	System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search("Vaishu"));
		
		System.out.println(s.empty());
		
		
		

	}

}

package Collection;
import java.util.LinkedList;
import java.util.ArrayList;

public class Linked_List
{

	public static void main(String[] args) 
	{
		
	       ArrayList al = new ArrayList();
	       al.add(10);
	       al.add(20);
	       al.add(30);
	       al.add(40);
	       
           LinkedList l = new LinkedList(al);
           l.add(0,"Vaishu");
           l.add(1,"mahi");
           l.add(2,100);
           l.add(3,1000);
      //     l.add("null");
       //    l.add("null"); 
           
           System.out.println(l);
           
        //     l.addAll(l);
      //     l.addFirst("mahi");
       //    l.addLast(2000);
           
      //     l.remove("mahi");
      //     l.removeAll(l);
           
      //     System.out.println(l.removeFirst());
       //    System.out.println(l.removeLast());
             
        //    System.out.println(l.contains(100));
        //    System.out.println(l.containsAll(l));
        //    System.out.println(l.size());
        //    System.out.println(l.isEmpty());
        //    System.out.println(l.indexOf(100));
        //    System.out.println(l.getFirst());
        //   System.out.println(l.getLast());
        //  System.out.println(l.lastIndexOf(100));
       //     System.out.println(l.set(3,"Dnyau"));
            
            
	}

}

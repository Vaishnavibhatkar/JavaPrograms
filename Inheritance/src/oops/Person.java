package oops;
public class Person 
{
	void age()
	{
		System.out.println("age of the Person");
	}

}
  class Student extends Person
{
   void name()
    {
			System.out.println(" Name of the Student");
	}
}

 class Teacher extends Student
{
  void faulty()
 {
      System.out.println("Faulty of Teacher");
 }
 
	

	public static void main(String[] args)
	{
		Teacher t = new Teacher();
		t.age();
		t.name();
		t.faulty();
		

	}


}




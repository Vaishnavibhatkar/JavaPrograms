public class Student_ByUsingMethod

{
	String name;
	int std;
	int age;  
	String SchoolName;
	public static void main(String[] args)
	{
		Student_ByUsingMethod s = new Student_ByUsingMethod();
		s.name="Vaishu";
		s.std= 10;
		s.age= 16;
		s.SchoolName= "The New Era High School";
		System.out.println("Name : "+s.name);
		System.out.println("Std : "+s.std);
		System.out.println("age: "+s.age);
		System.out.println("SchoolName : "+s.SchoolName);
	}

}

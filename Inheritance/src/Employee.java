public class Employee 
{
	int id;
	int age;
	String name;
    String jobtitle;
	public void Employee(int id, int age, String name, String jobtitle)
	{
			this.id = id;
			this.age=age;
			this.name=name;
			this.jobtitle=jobtitle;
			
	}
	 public void display()
	{
		System.out.println("id :"+ this.id );
		System.out.println("age :"+this.age);
		System.out.println("name :"+this.name);
		System.out.println("jobtitle :"+this.jobtitle);
	}
	 public static void main(String[] args) 
	 {
		Employee e1=new Employee();
		e1.Employee(101, 24, "Vaishnavi", "Java Developer");
		e1.display();
		
		Employee e2=new Employee();
		e2.Employee(102, 22, "Pankaj", "Java Developer");
		e2.display();
	 }

}

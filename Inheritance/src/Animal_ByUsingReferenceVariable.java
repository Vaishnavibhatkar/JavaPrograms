public class Animal_ByUsingReferenceVariable 
{
	int age;
	String color;
	String name;
	public void animal(int age,String color,String name) {
		this.age=age;
		this.color=color;
		this.name=name;
	}
	public void display() {
		System.out.println("Age :"+this.age);
		System.out.println("Color :"+this.color);
		System.out.println("Name :"+this.name);
	}
    public static void main(String[] args) 
    {
		Animal_ByUsingReferenceVariable  dog = new Animal_ByUsingReferenceVariable();
		dog.animal(18, "black", "Dog");
		dog.display();
		dog.animal(5, "Brown", "Moti");
		dog.display();
	}

}

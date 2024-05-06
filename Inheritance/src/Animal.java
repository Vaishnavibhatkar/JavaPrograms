
public class Animal
{
	public void eat()
	{
		System.out.println(" i am eating ");
	}

	public static void main(String[] args)
	{
		System.out.println();
		Animal cat = new Animal();
		cat.eat();
		cat.run();
	}
	public void run()
	{
		System.out.println(" i am running");
	}

}

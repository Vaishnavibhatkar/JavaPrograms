package oops;

public class Client extends Employee {
	void Project()
	{
		System.out.println("The Name of the Project");
	}

	public static void main(String[] args) 
	{
		Client c = new Client();
		c.name();
		c.Project();

	}

}

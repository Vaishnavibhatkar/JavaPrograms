package oops;
class Bird {
 void fly() {
	 System.out.println("I am Flying");
 }
}
class Parrot extends Bird
{
	void  eat()
	{
		System.out.println("Parrot eat chilli");
	}
 }
 public class Hello
 {
	
	public static void main(String[] args) {
	 Parrot p = new Parrot();
		p.fly();
		p.eat();
	}
 }
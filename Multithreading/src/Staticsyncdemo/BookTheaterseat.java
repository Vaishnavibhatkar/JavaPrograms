package Staticsyncdemo;

class BookTheaterseat 
{
  static int total_seats=20;
   
   static synchronized void bookseat(int seats)
   {
	   if(total_seats>=seats)
	   {
		   System.out.println("seats booked successfully");
		   total_seats=total_seats-seats;
		   System.out.println("seats left : " +total_seats);
	   }
	   else
	   {
		   System.out.println("seats cannot be booked");
		   System.out.println("seats left :" +total_seats );
	   }
   }
   class MyThread1 extends Thread
   {
	   BookTheaterseat b;
	   int seats;
	   MyThread1(BookTheaterseat b,int seats)
	   {
		   this.b=b;
		   this.seats=seats;
	   }
	   public void run()
	   {
		   b.bookseat(seats);
	   }
   }
   class MyThread2 extends Thread
   {
	   BookTheaterseat b;
	   int seats;
	   MyThread2(BookTheaterseat b, int seats)
	   {
		   this.b=b;
		   this.seats=seats;
	   }
	   public void run()
	   {
		   b.bookseat(seats);
	   }
   }

public class MovieBookApp
{
	
	public static void main(String[] args)
	{
//		BookTheaterseat b1=new BookTheaterseat();
//		
//		MyThread1 t1=new MyThread1 (b1,7);
//		t1.start();
//		
//		MyThread2 t2=new MyThread2(b1,6);
//		t2.start();
//		
//		
//		
	}

}
}

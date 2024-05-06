package Moviebookapp;

public class BookTheaterSeat 
{
	int total_seats=10;
	synchronized void bookseat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println(seats+"seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println("seats Left :"+total_seats);
		}
		else
		{
			System.out.println("sorry seats cannot be booked....!!");
		    System.out.println("Seats Left : "+total_seats);
		}
	}


public class MovieBookApp extends Thread
{
	static BookTheaterSeat b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}
	
	public static void main(String[] args)
	{
           b= new BookTheaterSeat();
           
//           MovieBookApp Vaishnavi = new MovieBookApp();
//           Vaishnavi.seats=7;
//           Vaishnavi.start();
//           
//           MovieBookApp Mahi =new MovieBookApp();
//           Mahi.seats=6;
//           Mahi.start();
//           
//
//           

	}

}
}

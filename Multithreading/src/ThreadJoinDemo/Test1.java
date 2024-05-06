package ThreadJoinDemo;


public class Test1 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		
		try
		{
			mainthread.join();
			for(int i=1; i<=5; i++)
			{
				System.out.println("child thread : " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
	}

	public static void main(String[] args) throws InterruptedException
	{ 
		mainthread = Thread.currentThread();
		Test1 t = new Test1();
		t.start();
		//t.join();
		try
		{
			for(int i=1 ; i<=5; i++)
			{
				System.out.println("main thread:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}

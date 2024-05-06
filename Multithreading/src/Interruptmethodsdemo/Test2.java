package Interruptmethodsdemo;

public class Test2 extends Thread
{
	
	public void run()
	{
		System.out.println("A : "+Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());
		try                    //try catch is used for sleep(
		{
			for(int i=1; i<=5; i++)
			{
				
				System.out.println(i);
				Thread.sleep(1000);
				//System.out.println("B : "+Thread.interrupted());
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrrupted:" +e);
		}
	}

	public static void main(String[] args) 
	{
		Test2 t2 = new Test2();
		t2.start();
		t2.interrupt();
	

	}

}

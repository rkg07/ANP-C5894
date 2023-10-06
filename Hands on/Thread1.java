package String;

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		
		}
		
	}
	
}

class Thread2 extends Thread
{
	public void run()        // running state
	{
		for(int i=101; i<=200; i++)
		{
			System.out.println(Thread.currentThread().getName() +" : " +i);
		
		}
		
	}
	
}


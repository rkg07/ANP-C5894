package String;


public class ThreadInJava
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread1 t1=new Thread1();  //new thread  // new state
		t1.setName("Thread1");
		
		try
		{
			int newPrioriy=12;
		
			t1.setPriority(12);
		
		}
		
		catch(Exception ex)
		{
			System.out.println("argument galat hai");
		}
		
		t1.start();                // thread start hua//  runnable state
		t1.sleep(500);  // blocked state
		t1.stop();  // thread terminate/dead/ end
		//stop method is deprected
		System.out.println(t1.isAlive());
		
		System.out.println("ye main thread ka task hai");
		Thread2 t2=new Thread2();
		t2.setName("Thread2");
		t2.setPriority(1);
		t2.start();
		
	}

}
public class ThreadAndRunnable
{
    public static void main(String args[])
    {
		System.out.println("void main is beginning");
		new newThread();
		new baruThread();
		System.out.println("Returning to void main");

		for (int i=0;i<5;i++)
			System.out.println("Main Thread  : " + i);

		System.out.println("Exiting Main Thread");
    }
}

class newThread implements Runnable
{
	private Thread t;

	newThread()
	{
		t = new Thread(this);
		t.start();
		for(int i=0;i<5;i++)
			System.out.println("newThread (main) : "+i);
	}

	public void run()
	{
		for (int i=0;i<5;i++)
			System.out.println("newThread (submain) : " + i);
	}
}

class baruThread extends Thread
{
	baruThread()
	{
		start();
		for(int i=0;i<5;i++)
			System.out.println("baruThread (main) : "+i);
	}

	public void run()
	{
		for (int i=0;i<5;i++)
			System.out.println("baruThread (submain) : " + i);
	}
}

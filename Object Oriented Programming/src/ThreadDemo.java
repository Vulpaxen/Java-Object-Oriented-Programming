import java.util.*;

public class ThreadDemo extends Thread
{
	private static int times;

	public ThreadDemo()
	{
		times = 0;
		testThreadDemo();
	}

	public /*synchronized*/ void printThread()
	{
		System.out.println("Thread "+times+" runs");
		times++;
	}

	public /*synchronized*/ void run()
	{
		//synchronized(this) {
		printThread();
		//}
	}

	public void testThreadDemo()
	{
		Thread [] obj = new Thread[100];

		for(int i=0; i<obj.length; i++)
		{
			obj[i] = new Thread(this);
			obj[i].start();
			//new Thread(this).start();
		}
	}

	public static void main(String[]args)
	{
		new ThreadDemo();
	}
}

import java.util.Random;

public class Multithreading extends Thread {
	private static int count;
	private int threadId;

	public Multithreading(int threadId) {
		this.threadId = threadId;
		count = 0;
	}

	public void run() {
		while (count < 10) {
			count++;
			System.out.println("Thread " + threadId + ": " + count);
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		Multithreading[] threads = { 
				new Multithreading(1), 
				new Multithreading(2),
				new Multithreading(3) 
		};

		while (true) {
			int num = rand.nextInt(4);
			if (num == 1) {
				threads[0].start();
			} else if (num == 2) {
				threads[1].start();
			} else if (num == 3) {
				threads[2].start();
			}
			
		}

	}
}

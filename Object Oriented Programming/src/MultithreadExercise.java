import java.util.Random;

public class MultithreadExercise extends Thread {
	private int threadId;
	private String name;
	private int count;

	public MultithreadExercise(int threadId, String name) {
		this.threadId = threadId;
		this.name = name;
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
		MultithreadExercise[] threads = { 
				new MultithreadExercise(1, "1"), 
				new MultithreadExercise(2, "2"),
				new MultithreadExercise(3, "3") 
		};

		while (true) {
			int num = rand.nextInt(3);
			threads[num].start();
			if (threads[0].count == 10 || threads[1].count == 10 || threads[2].count == 10) {
				break;
			}
		}
	}
}

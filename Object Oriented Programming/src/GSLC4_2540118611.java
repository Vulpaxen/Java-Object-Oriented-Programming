import java.util.*;
import java.util.Scanner;

public class GSLC4_2540118611 {
	public static void main(String[] args) {
		int choice;
		boolean flag = false;
		boolean flag1 = false;

		String wordData;
		ArrayList<String> al = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.println("Menu:");
				System.out.println("1. Add data");
				System.out.println("2. Look data");
				System.out.println("3. Game");
				System.out.println("4. Exit");
				System.out.print("Pilih Menu: ");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					do {
						System.out.print("Enter data (5 ... 50 characters): ");

						try {
							input.nextLine();
							wordData = input.nextLine();

							if (wordData.length() < 5 || wordData.length() > 50)
								System.out.println("The data entered is invalid, please try again.");
							else {
								if (al.contains(wordData))
									System.out.println("Duplicate data, please try again.");
								else {
									al.add(wordData);
									flag1 = true;
								}
							}
						} catch (Exception e) {
							System.out.println("The data must be a string");
						}
					} while (flag1 == false);

					break;
				case 2:
					Collections.sort(al);
					if (al.size() > 0)
						System.out.println("Data: " + al);
					else {
						System.out.println("There is no data");

						do {
							System.out.print("Enter data (5 ... 50 characters): ");

							try {
								input.nextLine();
								wordData = input.nextLine();

								if (wordData.length() < 5 || wordData.length() > 50)
									System.out.println("The data entered is invalid, please try again.");
								else {
									if (al.contains(wordData))
										System.out.println("Duplicate data, please try again.");
									else {
										al.add(wordData);
										flag1 = true;
									}
								}
							} catch (Exception e) {
								System.out.println("The data must be a string");
							}
						} while (flag1 == false);
					}
					break;
				case 3:
					String randomWord = al.get((int) (Math.random() * al.size()));
					ArrayList<Character> guess = new ArrayList<>();

					for (int i = 0; i < randomWord.length(); i++) {
						if (guess.contains(randomWord.charAt(i))) {
							System.out.print(randomWord.charAt(i));
						} else
							System.out.print("-");
					}
					System.out.println();

					while (true) {
						System.out.print("Tekan huruf: ");
						String answer = input.next();
						System.out.println();
						guess.add(answer.charAt(0));

						boolean guessRight = false;
						int correctCount = 0;
						for (int i = 0; i < randomWord.length(); i++) {
							if (guess.contains(randomWord.charAt(i))) {
								System.out.print(randomWord.charAt(i));
								correctCount++;
								guessRight = true;
							} else
								System.out.print("-");
						}
						System.out.println();

						if (!guessRight) {
							System.out.println("Huruf '"+answer+"' tidak ada di kata tersebut!\n");
						}

						if (randomWord.length() != correctCount)
							continue;
						else
							System.out.println("Selamat!");
						break;
					}

					if (al.size() <= 0) {
						System.out.println("There is no data");

						do {
							System.out.print("Enter data (5 ... 50 characters): ");

							try {
								input.nextLine();
								wordData = input.nextLine();

								if (wordData.length() < 5 || wordData.length() > 50)
									System.out.println("The data entered is invalid, please try again.");
								else {
									if (al.contains(wordData))
										System.out.println("Duplicate data, please try again.");
									else {
										al.add(wordData);
										flag1 = true;
									}
								}
							} catch (Exception e) {
								System.out.println("The data must be a string");
							}
						} while (flag1 == false);
					}
					break;
				case 4:
					flag = true;
				}
			} while (flag == false);
		}
	}
}

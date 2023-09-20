import java.util.*;

public class QuizOOP1 {

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	void bubbleSortReverse(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] <= arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void bubbleSortString(String[] arr) {
		int n = arr.length;
		String temp;

		for (int j = 0; j < n - 1; j++) {
			for (int i = j + 1; i < n; i++) {
				if (arr[j].compareTo(arr[i]) > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	void bubbleSortStringReverse(String[] arr) {
		int n = arr.length;
		String temp;

		for (int j = 0; j < n - 1; j++) {
			for (int i = j + 1; i < n; i++) {
				if (arr[j].compareTo(arr[i]) <= 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int jumlahPegawai, choice;
		String[] namaPegawai = new String[25];
		int[] gajiPegawai = new int[600];
		
		QuizOOP1 sort = new QuizOOP1();

		try (Scanner input = new Scanner(System.in)) {
			do {
				System.out.printf("Masukkan jumlah pegawai [3-5]: ");
				jumlahPegawai = input.nextInt();
			} while (jumlahPegawai > 5 || jumlahPegawai < 3);

			for (int i = 0; i < jumlahPegawai; i++) {
				do {
					System.out.printf("Masukkan nama pegawai [1-20 karakter] " + (i + 1) + ": ");
					namaPegawai[i] = input.next();
				} while (namaPegawai[i].length() > 20 || namaPegawai[i].length() <= 0);
				do {
					System.out.printf("Masukkan gaji pegawai [300-500] " + (i + 1) + ": ");
					gajiPegawai[i] = input.nextInt();
				} while (gajiPegawai[i] > 500 || gajiPegawai[i] < 300);
			}

			System.out.println("Daftar Nama / Gaji Pegawai:");
			for (int j = 0; j < jumlahPegawai; j++) {
				System.out.print(namaPegawai[j] + " / " + gajiPegawai[j]);
				System.out.println();
			}

			System.out.println();
			System.out.println("Menu:");
			System.out.println("1. Urut Nama Descending");
			System.out.println("2. Urut Gaji Descending");
			System.out.println("3. Exit");
			System.out.printf("Pilihan Anda [1-3]: ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				sort.bubbleSort(gajiPegawai);
//				sort.bubbleSortString(namaPegawai);

				System.out.println("Daftar Nama / Gaji Pegawai:");

				for (int j = 0; j < jumlahPegawai; j++) {
					System.out.print(namaPegawai[j] + " / " + gajiPegawai[j]);
					System.out.println();
				}

				break;
			case 2:
				sort.bubbleSortReverse(gajiPegawai);
//				sort.bubbleSortStringReverse(namaPegawai);

				System.out.println("Daftar Nama / Gaji Pegawai:");

				for (int j = 0; j < jumlahPegawai; j++) {
					System.out.print(namaPegawai[j] + " / " + gajiPegawai[j]);
					System.out.println();
				}

				break;
			case 3:
				break;
			}
		}
	}
}

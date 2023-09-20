import java.util.Scanner;

public class BandingKata
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		String nama1;
		String nama2;

		System.out.print("Masukan nama pertama : ");
		nama1 = input.nextLine();
		System.out.print("Masukan nama kedua : ");
		nama2 = input.nextLine();

		if(nama1.equals(nama2))
			System.out.println("Nama 1 dan 2 sama");
		else
			System.out.println("Nama 1 dan 2 berbeda");
	}
}
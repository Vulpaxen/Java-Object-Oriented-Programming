import java.util.Scanner;

public class SeleksiSwitch
{
	public static void main(String[] args)
	{
		int angka;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan sebuah angka: ");
		angka = input.nextInt();
		switch(angka%2)
		{
			case 0:
					System.out.println("Angka "+angka+" adalah Bilangan genap");
					break;
			case 1:
					System.out.println("Angka "+angka+" adalah Bilangan ganjil");
		}
	}
}

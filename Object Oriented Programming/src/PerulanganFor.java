import java.util.Scanner;

public class PerulanganFor
{
	public static void main(String[] args)
	{
		int angka;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Program pencetak segitiga");
		System.out.println("=========================\n");
		System.out.print("Masukan sebuah angka : ");
		angka = input.nextInt();
		for(int i=1; i<=angka; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class PerulanganDoWhile
{
	public static void main(String[] args)
	{
		int angka=0, i, j;
		boolean valid;
		Scanner input = new Scanner(System.in);

		System.out.println("Program pencetak segitiga");
		System.out.println("=========================\n");

		do
		{
			valid = true;
			System.out.print("Masukan sebuah angka : ");
			try
			{
				angka = input.nextInt();
			}
			catch(Exception e)
			{
				valid = false;
				input = new Scanner(System.in);
			}
		}
		while(!valid);

		i=1;
		while(i<=angka)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}

			i++;
			System.out.println();
		}
	}
}

import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int bilangan;

		System.out.print("Masukan bilangan : ");
		try
		{
			bilangan = input.nextInt();
		}
		catch(Exception e) // jika terjadi runtime error
		{
			bilangan = -1;
		}

		System.out.println("Bilangan yang dimasukan adalah "+bilangan);
	}
}

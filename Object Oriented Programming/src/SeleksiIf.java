import java.util.Scanner;

public class SeleksiIf
{
	public static void main(String[] args)
	{
		float nilai=0;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan sebuah nilai [0 ... 100]: ");
		try
		{
			nilai = input.nextFloat();

			if(nilai<0||nilai>100)
				System.out.println("Inputan nilai salah");
			else
				System.out.println("Inputan anda berupa bilangan : "+((int)nilai)+" dengan desimal "+((int)((nilai-(int)nilai)*1000)));
		}
		catch(Exception e)
		{
			System.out.println("Inputan harus nilai");
		}

	}
}

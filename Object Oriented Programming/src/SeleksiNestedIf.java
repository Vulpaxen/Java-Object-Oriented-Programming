import java.util.Scanner;

public class SeleksiNestedIf
{
	public static void main(String[] args)
	{
		float nilai=0;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan nilai akhir [0 ... 100]: ");
		try
		{
			nilai = input.nextFloat();

			if(nilai<0||nilai>100)
				System.out.println("Inputan nilai salah");
			else
			{
				if(nilai>=85)
					System.out.println("Grade A");
				else
				{
					if(nilai>=75)
						System.out.println("Grade B");
					else
					{
						if(nilai>=65)
							System.out.println("Grade C");
						else
						{
							if(nilai>=50)
								System.out.println("Grade D");
							else
								System.out.println("Grade E");
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Inputan harus nilai");
		}

	}
}

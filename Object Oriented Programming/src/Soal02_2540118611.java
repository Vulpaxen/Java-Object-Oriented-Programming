import java.util.Scanner;

public class Soal02_2540118611
{
	public static void main(String[] args)
	{
		int jumlahRoti;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan jumlah roti yang dibeli: ");
		try
		{
			jumlahRoti = input.nextInt();

			if(jumlahRoti<=0)
			{
				System.out.println("Inputan Anda salah");
			}
			else if(jumlahRoti>0&&jumlahRoti<=9)
			{
				System.out.println("Bonus roti: "+0);
				System.out.println("Total roti: "+jumlahRoti);
			}
			else if(jumlahRoti>=10&&jumlahRoti<=19)
			{
				System.out.println("Bonus roti: "+1);
				System.out.println("Total roti: "+(jumlahRoti+1));
			}
			else if(jumlahRoti>=20&&jumlahRoti<=29)
			{
				System.out.println("Bonus roti: "+2);
				System.out.println("Total roti: "+(jumlahRoti+2));
			}
			else if(jumlahRoti>=30)
			{
				System.out.println("Bonus roti: "+3);
				System.out.println("Total roti: "+(jumlahRoti+3));
			}
		}
		catch(Exception e)
		{
			System.out.println("Inputan harus ada!");
		}
	}
}
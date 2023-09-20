import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		int tahun;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan tahun: ");
		tahun = input.nextInt();
		System.out.println("Tahun "+tahun+" adalah "+
		((((tahun%4==0)&&(tahun%100!=0))||(tahun%400==0))?"":"bukan ")+"tahun kabisat");
	}
}

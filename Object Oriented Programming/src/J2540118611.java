import java.util.Scanner;

public class J2540118611
{
	public static void main(String[] args)
	{
		int nilaiTabungan;
		double bungaTahunan;
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan Nilai Tabungan: ");
		nilaiTabungan = input.nextInt();
		System.out.print("Masukan Bunga Tahunan: ");
		bungaTahunan = input.nextDouble();
		
		double bungaBulanan = bungaTahunan/1200;
		double saldoTabungan = nilaiTabungan;
		
		for(int i=0; i<=12; i++) 
		{
			System.out.println("Saldo tabungan bulan "+i+": "+String.format("%.2f", saldoTabungan));
			saldoTabungan*=(1+bungaBulanan);
		}
	}
}
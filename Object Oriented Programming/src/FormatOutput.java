public class FormatOutput
{
	public static void main(String[]args)
	{
		System.out.println("Tabel Poin Penjualan");
		System.out.println("    NAMA    |    POIN    ");
		System.out.printf("%-12s|%12.2f\n","ANDI",1234.5);
		System.out.printf("%-12s|%12.2f\n","BURHAN",77.55);
		System.out.printf("%-12s|%12.2f\n","CESSY",10000.);
		System.out.printf("%-12s|%12.2f\n","DONNI",13.4567);
	}
}

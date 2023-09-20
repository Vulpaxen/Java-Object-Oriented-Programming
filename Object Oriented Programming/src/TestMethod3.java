public class TestMethod3
{
	public static int max(int bil1, int bil2)
	{
		int terbesar;

		if(bil1>bil2)
			terbesar = bil1;
		else
			terbesar = bil2;

		return terbesar;
	}

	public static void main(String[] args)
	{
		int nilai;

		nilai = max(3,5);
		System.out.println("Bilangan terbesar antara 3 dan 5 adalah "+nilai);

		nilai = max(14,7);
		System.out.println("Bilangan terbesar antara 14 dan 7 adalah "+nilai);
	}
}

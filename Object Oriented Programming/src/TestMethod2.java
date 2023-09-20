public class TestMethod2
{
	public static void cetakSegitigaBintang(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Segitga bintang bernilai 4");
		cetakSegitigaBintang(4);
		System.out.println("Segitga bintang bernilai 10");
		cetakSegitigaBintang(10);
	}
}

public class Pembulatan
{
	public static void main(String[]args)
	{
		/*
		double angka1 = 3.1;
		double angka2 = 3.9;
		double angka3 = 4.4;
		double angka4 = 4.5;
		double angka5 = -3.4;

		System.out.println(Math.ceil(angka1));
		System.out.println(Math.floor(angka2));
		System.out.println(Math.rint(angka3));
		System.out.println(Math.rint(angka4));
		System.out.println(Math.round(angka3));
		System.out.println(Math.round(angka4));

		System.out.println(Math.max(angka1,angka2));
		System.out.println(Math.min(angka1,angka2));
		System.out.println(Math.abs(angka5));
		*/

		// Math.random() returns 0.00 - 0.99
		for(int i=0; i<20; i++)
			//System.out.println((int)(Math.random()*10));
			System.out.println(((int)(Math.random()*6)) * 2);
	}
}
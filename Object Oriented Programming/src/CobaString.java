public class CobaString
{
	public static void main(String[]args)
	{
		String kata1 = "Welcome";
		String kata2 = "Halo apakabar?";
		String kata3 = "Welcome#to#Java!";

		System.out.println("Panjang kata1 = "+kata1.length());
		System.out.println("Huruf ke-3 dari kata2 = "+kata2.charAt(2));
		System.out.println("Kata1 + kata2 = "+(kata1+kata2));
		System.out.println("Huruf 4-7 dari kata3 = "+kata3.substring(3,7));
		System.out.println("Huruf besar dari kata2 = "+kata2.toUpperCase());
		System.out.println("Mengganti '#' menjadi ' ' dari kata3 = "+kata3.replace('#',' '));
	}
}

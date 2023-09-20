import java.io.*;
import java.util.*;

public class ExceptionHandling
{
	public static void main(String[] args)
	{
		int hasil;
		char [] kata = {'a','b','c'};

		System.out.println("Contoh penanganan kesalahan pembagian dengan nol");
		try
		{
			hasil = 5/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Masuk ke ArithmeticException dengan pesan:");
			System.out.println(""+ae+"\n");
		}

		System.out.println("Contoh penanganan kesalahan melebihi batas index array");
		try
		{
			kata[100]='a';
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Masuk ke ArithmeticException dengan pesan:");
			System.out.println(""+ae);
		}
		catch(ArrayIndexOutOfBoundsException ie)
		{
			System.out.println("Masuk ke ArrayIndexOutOfBoundsException dengan pesan:");
			System.out.println(""+ie);
		}
		catch(Exception ex)
		{
			System.out.println("Masuk ke Exception dengan pesan:");
			System.out.println(""+ex);
		}
	}
}

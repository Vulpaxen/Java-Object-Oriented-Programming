interface Warna
{
	int x = 7;
	void setWarna();
}

interface Garis
{
	abstract public void setWarna();
}

abstract class Shape //implements Warna, Garis
{

	/*public double luas()
	{
		return 0;
	}*/

	public double keliling()
	{
		return 0;
	}

	abstract public double luas();
}

class Circle extends Shape
{
	public double luas()//overriding method
	{
		return 3.14*10*10;
	}

	public double luas(double r)//overloading method
	{
		return 3.14*r*r;
	}

	public void setWarna()
	{
		System.out.println("Warna circle: HITAM");
	}
}

class Rectangle extends Shape
{
	public double luas()
	{
		return 10*10;
	}

	public double luas(double p, double l)
	{
		return p*l;
	}

	public void setWarna()
	{
		System.out.println("Warna rectangle: BIRU");
	}
}

class Triangle extends Shape
{
	public double luas()
	{
		return 0.5*10*10;
	}

	public double luas(double a, double t)
	{
		return 0.5*a*t;
	}

	public void setWarna()
	{
		System.out.println("Warna triangle: MERAH");
	}
}

public class TestShape
{
	public static void main(String[]args)
	{

		// Trivial polymorphism (method overloading)
		/*
		Triangle t = new Triangle();
		System.out.println("Luas = "+t.luas());
		System.out.println("Luas = "+t.luas(10,20));
		*/

		// Pure polymorphism (method overriding)
		Shape s = null; //new Shape();
		int pilih;
		pilih = 3; // Ganti menjadi inputan Scanner

		if(pilih==1)
		{
			s = new Circle();
			System.out.print("Luas lingkaran: ");
		}
		else
		if(pilih==2)
		{
			s = new Rectangle();
			System.out.print("Luas segiempat: ");
		}
		else
		if(pilih==3)
		{
			s = new Triangle();
			System.out.print("Luas segitiga: ");
		}

		System.out.println(s.luas());
		//s.luas();
	}
}
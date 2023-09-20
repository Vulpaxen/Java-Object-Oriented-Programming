import java.util.Scanner;

abstract class BidangTanah {

	public static int panjang;
	public static int lebar;

	public BidangTanah() {
	}
	public void setPanjang(int a) {
		panjang = a;
	}
	public int getPanjang() {
		return panjang;
	}
	public void setLebar(int c) {
		lebar = c;
	}
	public int getLebar() {
		return lebar;
	}
	abstract public int getLuas();
	abstract public int getKeliling();
}

interface Transaksi{
	public final int harga_per_meter_persegi = 950000;
	public int getHargaJual();
}

class Properti extends BidangTanah implements Transaksi {
	Scanner input = new Scanner(System.in);

	public Properti() {
	}
	public int getLuas() {
		return panjang*lebar;
	}
	public int getKeliling() {
		return (2*panjang)+(2*lebar);
	}
	public int getHargaJual() {
		return harga_per_meter_persegi*getLuas();
	}
	public void print() {
		System.out.print("Panjang: ");
		panjang = input.nextInt();
		System.out.print("Lebar: ");
		lebar = input.nextInt();
		System.out.print("Harga Jual tanah " + panjang + "*" + lebar + " adalah " + getHargaJual());
	}
	
	public static void main(String[] args) {
		Properti p = new Properti();
		p.print();
	}
}
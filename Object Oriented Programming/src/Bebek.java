public class Bebek extends Hewan
{
	// method overriding (nama dgn jumlah/jenis param sama)
	public void cetak()
	{
		System.out.println("Ini adalah method cetak dari kelas Bebek");
	}

	public void cetakParent()
	{
		super.cetak();
	}

	// method overloading (nama sama, tapi jmlh/jenis param beda)
	public void tampilNama(String nama)
	{
		System.out.println("Nama bebek: "+nama);
	}

	public static void main(String [] args){
		Hewan objH = new Hewan();
		Bebek objB = new Bebek();

		objH.cetak();
		objB.cetak();
		objB.tampilNama(); // panggil punya induk (Hewan)
		objB.tampilNama("Duck"); // panggil punya diri sendiri (Bebek)
		objB.cetakParent(); // method cetak inudk (Hewan) masih tetap ada dan dipanggil dengan keyword 'super'
	}
}

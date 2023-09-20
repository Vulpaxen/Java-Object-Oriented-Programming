public class Hitung<T extends Comparable<T>>{
	
	private T [] nilai;
	public Hitung(T [] value) {
		nilai = value;
	}
	
	public T getMax() {
		T max = nilai[0];
		
		for(int i=1; i<nilai.length; i++) {
			if(max.compareTo(nilai[i]) < 0)
				max = nilai[i];
		}
		
		return max;
	}
	
//	public static void main(String[] args) {
//		Double [] nilaiD = {1.1, 2.2, 3.3};
//		Integer [] nilaiI = {1,2,3};
//
//		Hitung<Double>hitungD = new Hitung<Double>(nilaiD);
//		Hitung<Integer>hitungI = new Hitung<Integer>(nilaiI);
//
//		System.out.println(hitungD.getMax());
//		System.out.println(hitungI.getMax());
//	}
}
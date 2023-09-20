public class getMax<T>{
	
	public static <T extends Comparable<T>> T getMax(T [] nilai) {
		T max = nilai[0];
		
		for(int i=1; i<nilai.length; i++) {
			if(max.compareTo(nilai[i]) < 0)
				max = nilai[i];
		}
		
		return max;
	}
	
//	public static void main(String [] args) {
//		Double [] nilaiD = {1.1, 2.2, 3.3};
//		Integer [] nilaiI = {1,2,3};
//		
//		System.out.println(getMax(nilaiD));
//		System.out.println(getMax(nilaiI));
//	}
}
public class GenericMethodDemo{
	public static void main(String [] args){
		Integer[] angka = {1,2,3,4,5};
		String[] kata = {"Jakarta","Bogor","Bandung","Bekasi"};

		GenericMethodDemo.<Integer>print(angka);
		GenericMethodDemo.<String>print(kata);
	}

	public static <E> void print(E[] list){
		for(int i =0 ; i < list.length ; i++)
			System.out.print(list[i]+ " ");
		System.out.println();

	}
}
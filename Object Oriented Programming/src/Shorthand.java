public class Shorthand
{
	public static void main(String[]args)
	{
		int i=8;
		int j=3;
		
		System.out.println("Nilai i="+i+" dan j="+j);
		i+=(++j);
		System.out.println("Nilai i="+i+" dan j="+j);
		i+=(j++);
		System.out.println("Nilai i="+i+" dan j="+j);		
	}
}

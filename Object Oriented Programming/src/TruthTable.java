public class TruthTable
{
	public static void main(String[] args)
	{
		int number = 18;
		System.out.println("Is "+number+
		"\ndivisible by 2 and 3? "+((number%2==0)&&(number%3==0))+
		"\ndivisible by 2 or 3? "+((number%2==0)||(number%3==0))+
		"\ndivisible by 2 or 3, but not both? "+((number%2==0)^(number%3==0)));
	}
}

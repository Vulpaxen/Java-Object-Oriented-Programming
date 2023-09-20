public class CobaMath
{
	public static void main(String[]args)
	{
		int sudut1 = 30, sudut2 = 45, sudut3 = 60, sudut4 = 90;

		//System.out.println("Sin(30 deg) = "+Math.sin(sudut1*0.0174));
		//System.out.println("Sin(45 deg) = "+Math.sin(sudut2*0.0174));
		//System.out.println("Sin(60 deg) = "+Math.sin(sudut3*0.0174));
		//System.out.println("Sin(90 deg) = "+Math.sin(sudut4*0.0174));
		System.out.println("Sin(30 deg) = "+Math.sin(Math.toRadians(sudut1)));
		System.out.println("Sin(45 deg) = "+Math.sin(Math.toRadians(sudut2)));
		System.out.println("Sin(60 deg) = "+Math.sin(Math.toRadians(sudut3)));
		System.out.println("Sin(90 deg) = "+Math.sin(Math.toRadians(sudut4)));
	}
}
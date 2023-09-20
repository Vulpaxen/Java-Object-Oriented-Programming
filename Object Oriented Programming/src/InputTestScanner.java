import java.util.Scanner;

public class InputTestScanner
{
	public static void main(String[]args)
	{
		int intVal;
		double doubleVal;
		String stringVal;
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer \"value\" : ");
		intVal = input.nextInt();
		System.out.println("Integer value = "+intVal);

		System.out.print("Input a double value : ");
		doubleVal=input.nextDouble(); //input.nextLine();
		System.out.println("Double value = "+doubleVal);
		input.nextLine(); //fflush(stdin);

		System.out.print("Input a String value without space : ");
		stringVal=input.nextLine();
		System.out.println("String value = "+stringVal);
	}
}

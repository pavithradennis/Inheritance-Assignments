package Factorial;
import java.util.Scanner;
//main class
public class FactorialMain {

	public static void main(String[] args)
	{
	Factorial factorial = new Factorial();
	System.out.println("Enter the number");
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	try
	{
		int fact = factorial.factorial(num);
		System.out.println("The factorial is" +fact);
	}
	catch(InvalidInputException ie)
	{
		ie.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	}

}

package Factorial;
//factorial class to calculate factorial
class InvalidInputException extends Exception
{
	public InvalidInputException()
	{
		super();
	}
}


public class Factorial
{
 int factorial(int num) throws InvalidInputException
 {
	 if(num<2) //first exception
	 {
		 throw new InvalidInputException();
	 }
	 long fact=1;
	 for(int i=1;i<=num;i++)
	 {
		 fact=fact*i; 
	 }
	 if(fact>2_147_483_647) //second exception
	 {
		 throw new InvalidInputException();
	 }
	 return (int)fact;
 }
}

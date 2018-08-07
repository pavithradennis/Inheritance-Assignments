//main class to create objects to override methods
package DynamicPolymorphism;

public class DynamicPolymorphismMain
{

	public static void main(String[] args)
	{
		Top1 bottom1 = new Bottom1(); //upcasting
		Top1 bottom2 = new Bottom2();
		Top1 bottom3 = new Bottom3();
		bottom1.disp1(); //call the methods with the three bottom classes
		bottom2.disp1();
		bottom3.disp1();
		

	}

}

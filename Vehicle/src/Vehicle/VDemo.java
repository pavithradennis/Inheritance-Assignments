//main class to create instances and implement the child classes
package Vehicle;

public class VDemo 
{
 public static void main(String[] args)
 {
	 Vehicle vehicle[] = new Vehicle[3];
	 vehicle[0] = new TwoWheeler();
	 vehicle[1] = new ThreeWheeler(); //upcasting
	 vehicle[2] = new FourWheeler();
	 for(int i=0;i<=2;i++)
	 {
		 if(i==1)
			 vehicle[i].start();
	 }
	 
	 
 }
}

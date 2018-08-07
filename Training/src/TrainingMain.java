//main class
public class TrainingMain 
{

	public static void main(String[] args) 
	{
       Training training = new PublicTraining(100,"Java",5000,50); //object for PublicTraining
       Training training1 = new CorporateTraining(200,"BigData",3500,4); //object for CorporateTraining
       
       training.getOrderValue();
       System.out.println("Cost of training for Java is:" +training.getCost());
       
       training1.getOrderValue();
       System.out.println("COst of training for Big Data is:" +training1.getCost());
       
	}

}

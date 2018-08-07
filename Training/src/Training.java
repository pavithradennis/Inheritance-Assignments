//parent class for training
abstract public class Training
{
   private int id;   //common parameters are considered here
   private String subject;
   private int fees;
   
   
public Training(int id, String subject, int fees) 
{
	super(); //constructor for parent class
	this.id = id;
	this.subject = subject;
	this.fees = fees;
}


public int getFees() //to compute the fees
{
	return fees;
}

abstract public int getCost(); //methods common to both trainings
abstract public void getOrderValue();

   
}

//PublicTraining is the class that inherits Training class
public class PublicTraining extends Training
{
 private int participants;
 private int cost;
 
public PublicTraining(int id, String subject, int fees, int participants) 
{
	super(id, subject, fees);
	this.participants = participants; 
	
}
 
public void getOrderValue()
{
	this.cost=getFees()*participants; //calculate public training costs
}
public int getCost()
{
	return cost;
}
 
}

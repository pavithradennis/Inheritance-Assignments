//CorporateTraining also inherits the Training class
public class CorporateTraining extends Training
{
	 private int days;
	 private int cost;
	 
	public CorporateTraining(int id, String subject, int fees, int days) 
	{
		super(id, subject, fees);
		this.days = days;
		
	}
	 
	public void getOrderValue()
	{
		this.cost=getFees()*days; //compute fees on the basis of number of days
	}
	public int getCost()
	{
		return cost;
	}
	 
}

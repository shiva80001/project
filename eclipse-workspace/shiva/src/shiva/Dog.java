package shiva;

public class Dog {
	double b;
	double TimeDrinking;
	public   void setDrinkTime(int a)
	{
		this. b=a;
		// return b;
		 
		
	}
	
	double getDrinkTime()
	{
		double y=4;
		
		TimeDrinking = y/b;
		return TimeDrinking;
	}
		public  boolean needsTogo()
		{
			double abc= getDrinkTime();
			if(abc<=1)
			{
				return true;
			}
			return false;
		}
	
		
}

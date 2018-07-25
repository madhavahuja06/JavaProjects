package co.deloitte.fly;

public class RiverBarge extends vehicle implements sailor {

	public void dock()
	{
		System.out.println(" Barge dock");
	}
	
	public void cruise()
	{
		System.out.println("  Barge Cruise");
	}
}

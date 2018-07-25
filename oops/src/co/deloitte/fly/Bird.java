package co.deloitte.fly;

public class Bird implements Flyer {
	@Override
	public void takeoff() {
System.out.println(" Bird taking off");
	}

	@Override
	public void land() {
		System.out.println("Bird landing");

	}

	@Override
	public void fly() {
		System.out.println("Bird flying");

	}
	public void buildNest()
	{
		System.out.println("bird building nest");
	}
	
	public void layeggs()
	{
		System.out.println("Bird laying eggs");
	}
	
	public void eat()
	{
		System.out.println("Bird eats");
	}
}


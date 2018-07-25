package co.deloitte.fly;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeoff() {
System.out.println(" Superman taking off");
	}

	@Override
	public void land() {
		System.out.println("Superman landing");

	}

	@Override
	public void fly() {
		System.out.println("Superman flying");

	}

	public void stopBullet() {
		System.out.println("Superman stoping bullet");

	}
	
	public void eat()
	{
		System.out.println("Superman eats");
	}
}	
	

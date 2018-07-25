package co.deloitte.fly;

public class AirPlane extends vehicle implements Flyer {

		
	
	@Override
	public void takeoff() {
System.out.println("taking off");
	}

	@Override
	public void land() {
		System.out.println("landing");

	}

	@Override
	public void fly() {
		System.out.println("flying");

	}
}


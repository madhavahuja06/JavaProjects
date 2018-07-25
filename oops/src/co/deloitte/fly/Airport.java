package co.deloitte.fly;

public class Airport {
	public static void main(String[] args)
	{
 Airport metropolisAirport=new Airport();
 Helicopter copter=new Helicopter();
 SeaPlane sPlane = new SeaPlane();
 

 metropolisAirport.land(copter);
 metropolisAirport.land(sPlane);
		
}

	private void land(Flyer f) {
		
		f.land();
	}
}

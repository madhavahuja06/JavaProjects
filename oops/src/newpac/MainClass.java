package newpac;

public class MainClass {

	
	public static void main(String[] args)
	{
		Ttype<Float> t2= new Ttype<Float>();
		t2.setX(5.5f);
		t2.setY(6.6f);
		
		System.out.println(t2.getX() + " " +t2.getY());
	}
}

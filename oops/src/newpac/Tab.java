package newpac;

public class Tab {

	public static void main(String[] args)
	{
		try {
		System.out.println(  args[0] + args[1]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println("index out of bound");
		}
		
	}
	
}

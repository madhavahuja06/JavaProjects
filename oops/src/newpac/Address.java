package newpac;

import java.util.AbstractList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Address1 {

	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address1(String n,String s, String c, String st, String cd )
	{
		
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}
	
	public String toString()
	{
		
		return name +"\n" +street +"\n" + city +" " + state +" " +code;
	}	
}

public class Address{
	public static void main(String[] args)
	{
		HashSet<Address1> m1= new HashSet<Address1>();
		
		m1.add(new Address1("Sherlock","baker street","London","UK","247001"));
		m1.add(new Address1("Sherlock","baker street","London","UK","247001"));
		m1.add(new Address1("Jammie","baker street","London","UK","247001"));
		
	
		Iterator<Address1> listIterator = m1.iterator();
		while (listIterator.hasNext()) {
			
			System.out.println(listIterator.next());
			System.out.println();
		}
		
	}}


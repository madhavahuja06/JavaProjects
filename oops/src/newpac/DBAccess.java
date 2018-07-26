package newpac;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

 class DB {
   
	public ArrayDeque<E> <String> getResult()
	{
		ArrayDeque<String> result =new <String>();
		
		result.push("A");
		result.push("B");
		result.push("D");
		result.push("E");
		result.push("F");
		System.out.println("poping the stack");
		
		while(result.pop()!=null)
		System.out.println(result.pop()+"  ");					
	
	
	}}

public class DBAccess
{

	public static void main(String[] args)
	{
		DB dba= new DB();
		
		System.out.println(dba.getResult());
	}
}
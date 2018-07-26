package newpac;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NewClass 
{
  public static void main(String[] args) 
  {
	List<String> names = new LinkedList<>();
	names.add("c");
	names.add("A");
	names.add("B");
	names.add("D");
	names.add("E");
	names.add("F");
	
	Iterator<String> namesIterator = names.iterator();
		
	
	while(namesIterator.hasNext()){
		System.out.println(namesIterator.next());			
	}	
	
  }
}
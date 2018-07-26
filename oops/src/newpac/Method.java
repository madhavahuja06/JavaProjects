package newpac;

class New
{
public int x;
public int y;

public New(int x,int y)
{
this.x=x;
this.y=y;
}


public boolean equals(New obj)
{
	if(obj!=null)
	{
	   if(obj instanceof New)
		{
		   New point=(New)obj;
	    if(x==point.x  && y==point.y)
	    {  return true; }
		}
	}
	
	return false;
     }

}

public class Method 
{
public static void main(String[] args)
{
	New n1=  new New(4,5);
	New n2=  new New(4,5);

 	System.out.println(n1.equals(n2));
}
	
}

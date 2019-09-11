//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		count=0;
		thing=null;
	}
	
	public ThingCount(Object thang, int cnt)
	{
		count=cnt;
		thing=thang;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count=cnt;
	}

	public void setThing(Object obj)
	{
		thing=obj;
	}
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if(other!=null)
		{
		   if(getThing().equals(other.getThing())&&
		       getCount()==other.getCount())	
		      return true;
		}
		return false;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if(other!=null)
		{
		   return ((Comparable)getThing()).compareTo(other.getThing());
		}
		return -1;		
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}
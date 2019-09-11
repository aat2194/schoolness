//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -   
//Lab  -

public class Word
{
	private String theValue;
	
	public Word(String value)
	{
		theValue=value;
	}	
	
	public String getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		String loc = ((Word)obj).theValue;
		return theValue.compareTo(loc)==0;
	} 
	
	public int hashCode()
	{
		int count=0;
		for(char c : theValue.toCharArray())
		{
			if("aeiouAEIOU".indexOf(c)>-1)
			   count++;
		}
		return (theValue.length()*count)%10;
	}

	public String toString()
	{
		return ""+theValue;
	}	
}
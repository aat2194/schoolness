//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
		replace();
	}

	public void setEmAll(String line, String rem, String rep)
	{
		new IteratorReplacer(line, rem, rep);
	}

	public void replace()
	{
		ListIterator<String> pie = list.listIterator();
		while(pie.hasNext()) {
			if(pie.next().equals(toRemove))
				pie.set(replaceWith);
				
		}
		
		
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}
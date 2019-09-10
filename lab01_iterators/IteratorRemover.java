//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private static final String arg1 = null;
	private static final String arg0 = null;
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		String[] a = line.split(" ");
		list = new ArrayList<>(Arrays.asList(a));
		toRemove = rem;
		
		
	}

	public void setTest(String line, String rem)
	{
		String[] a = line.split(" ");
		list = new ArrayList<>(Arrays.asList(a));
		toRemove = rem;
	}

	public void remove()
	{
		Iterator<String> a = list.listIterator();
		while(a.hasNext()) {
			if(a.next().equals(toRemove)) a.remove();
		}
		
	}

	public String toString()
	{
		return list.toString().replaceAll(arg0, arg1);
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean yahOrNay;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<String, TreeSet<String>>();
		Scanner chopper = new Scanner(line);		
		while(chopper.hasNext())
		{
			String first = chopper.next();
			String second = chopper.next();

			if(map.get(first)==null)
			{
				map.put(first, new TreeSet<String>());
			}
			map.get(first).add(second);

			if(map.get(second)==null)
			{
				map.put(second, new TreeSet<String>());
			}
			map.get(second).add(first);
		}
		yahOrNay = false;
	}

	public boolean contains(String name)
	{
		if(map.get(name)==null)
			return false;
		return true;
	}

	public void check(String first, String second, TreeSet<String> placedUsed)
	{
		if(first.equals(second))
		{
			yahOrNay = true;
		}
		else
		{
			TreeSet<String> conSet = map.get(first);
			for(String name : conSet)
			{
				if(placedUsed.contains(name)==false)
				{
					placedUsed.add(name);
				   check(name, second, placedUsed);
					placedUsed.remove(name);
				}
			}
		}
	}

	public String toString()
	{
		if(yahOrNay)
		   return "CONNECTIION EXISTS";
		return "NO CONNECTION EXISTS";
	}
}
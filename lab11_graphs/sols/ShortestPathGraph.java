//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, String> map;
	private boolean found;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<String, String>();
		shortest=Integer.MAX_VALUE;
		String[] list = line.split(" ");
		for(String section : list)
		{
			String first = section.substring(0,1);
			String second = section.substring(1,2);
			
			if(map.get(first)==null)
				map.put(first, "");
			if(map.get(second)==null)
				map.put(second, "");
				
			map.put(first, map.get(first)+second);
			map.put(second, map.get(second)+first);
		}
		found = false;
	}

	public boolean contains(String letter)
	{
		if(map.get(letter)==null)
		   return false;
		return true;
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		if(first.equals(second)&&steps<shortest)
		{
			found = true;
			shortest=steps;
		}
		else
		{
			String conList = map.get(first);
			for(int i=0; i<conList.length(); i++)
				if(placesUsed.indexOf(conList.substring(i,i+1))<0)
					check(conList.substring(i,i+1), second, placesUsed+first, steps+1);
		}
	}

	public String toString()
	{
		if(found) 
			return "yes in " + shortest + " steps";
		return "no";
	}
}
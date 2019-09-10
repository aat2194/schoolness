//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
	 	odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		this();
		Scanner chop = new Scanner(line);
		while(chop.hasNext())
		{
			int n = chop.nextInt();
			if(n % 2==0)
				evens.add(n);
			else
				odds.add(n);
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
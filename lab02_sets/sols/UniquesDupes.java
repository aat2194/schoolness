//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		for(String word : new ArrayList<String>(Arrays.asList(input.split(" "))))
		{
			uniques.add(word);
		}
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		for(String word : new ArrayList<String>(Arrays.asList(input.split(" "))))
		{
			if(uniques.add(word)==false)
				dupes.add(word);
		}
		return dupes;
	}
}
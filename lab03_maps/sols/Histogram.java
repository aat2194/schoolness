//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		setSentence("");
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		String[] stuff = sent.split(" ");
		for(int x=0; x<stuff.length; x++)
		{
			if(histogram.get(stuff[x]) == null)
				histogram.put(stuff[x], 0);
			histogram.put(stuff[x],histogram.get(stuff[x])+1);
		}
	}

	public String toString()
	{
		String output="";
		output+="char\t1---5----01---5\n";
		for(String s : histogram.keySet())
		{
			output+=s+"\t";
			String allStars = "";
			for(int x =0; x< histogram.get(s); x++)
			{
				allStars = allStars + "*";
			}
			output += allStars+"\n";
		}
		return output+"\n\n";
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
	   acronymTable = new TreeMap<String, String>();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" \\- ");
		String key = list[0];
		String value = list[1];
		acronymTable.put(key, value);
	}

	public String convert(String sent)
	{
		Scanner chopper = new Scanner(sent);
		String output ="";
		while(chopper.hasNext())
		{
		   String word=chopper.next();
		   String noPunct=word.replaceAll("\\p{Punct}","");
		   if(acronymTable.get(noPunct)==null)
			   output+=word + " ";
			else if(word.compareTo(noPunct)!=0)
			   output+=acronymTable.get(noPunct) + ". ";
			else
			   output+=acronymTable.get(word) + " ";
		}
		return output;
	}

	public String toString()
	{
		return acronymTable.toString().replaceAll("\\,","\n");
	}
}
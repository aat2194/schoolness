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

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddevendata.dat"));
		while(file.hasNext())
		{
			String sent = file.nextLine();
			OddEvenSets test = new OddEvenSets(sent);
			out.println(test);
		}
	}
}
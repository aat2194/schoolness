//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		String list = "a b c d e f g h a b c d e f g h i j k"; 
		System.out.println("Original List : " + list);
		out.println("Uniques : " + UniquesDupes.getUniques(list));
		out.println("Dupes : " + UniquesDupes.getDupes(list) + "\n\n");
		
		list = "one two three one two three six seven one two";
		System.out.println("Original List : " + list);
		out.println("Uniques : " + UniquesDupes.getUniques(list));
		out.println("Dupes : " + UniquesDupes.getDupes(list) + "\n\n");
		
		list = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		System.out.println("Original List : " + list);
		out.println("Uniques : " + UniquesDupes.getUniques(list));
		out.println("Dupes : " + UniquesDupes.getDupes(list) + "\n\n");	
	}
}
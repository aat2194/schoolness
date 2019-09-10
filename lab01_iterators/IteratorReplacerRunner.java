//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		IteratorReplacer a = new IteratorReplacer("a b c a b c","a","+");
		System.out.println(a);
		a.setEmAll("a b c d e f g h i j x x x x","x","7");
		System.out.println(a);
		a.setEmAll("1 2 3 4 5 6 a b c a b c","b","#");
		System.out.println(a);		
	}
}
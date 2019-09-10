//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		ListIteratorTest test = new ListIteratorTest("a b c a b c","a","+");
		test.replace();
		out.println(test);

		test.setTest("a b c d e f g h i j x x x x","x","7");
		test.replace();
		out.println(test);

		test.setTest("1 2 3 4 5 6 a b c a b c","b","#");
		test.replace();
		out.println(test);
	}
}
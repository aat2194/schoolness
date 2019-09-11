//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -  

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class HashTableRunner2
{
  public static void main ( String[] args ) throws Exception
  {
		try{
			HashTable table = new HashTable();
			Scanner file = new Scanner(new File("words.dat"));
			
			int runCount=file.nextInt();
			for(int i=0; i<runCount; i++)
			{
				Word word = new Word(file.next());
				table.add(word);
			}
			out.println(table);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}
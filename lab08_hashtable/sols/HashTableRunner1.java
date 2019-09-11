//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class HashTableRunner1
{
  public static void main ( String[] args )
  {
		try{
			HashTable table = new HashTable();
			Scanner file = new Scanner(new File("numbers.dat"));
			
			int runCount=file.nextInt();
			for(int i=0; i<runCount; i++)
			{
				Number num = new Number(file.nextInt());
				table.add(num);
			}
			out.println(table);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}
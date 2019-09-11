//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class HashTableRunner1_LN
{
  public static void main ( String[] args )
  {
		try{
			HashTableTwo table = new HashTableTwo();
			Scanner file = new Scanner(new File("lab16a.dat"));
			
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
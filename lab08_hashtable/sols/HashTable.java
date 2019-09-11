//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -   
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		this(10);
	}

	public HashTable(int size)
	{
		table = new LinkedList[size];
		for(int i=0; i<table.length; i++)
		{
			table[i] = new LinkedList();
		}
	}

	public void add(Object obj)
	{
		int i = obj.hashCode();
		if(table[i].contains(obj)==false)
		{
			table[i].add(obj);
		}
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for ( int i =0; i<table.length; i++ )
		{
			output+="bucket " +i+" ";
			LinkedList current = table[i];
			if(current!=null)
			{
				for(Object s : current)
				{
					output+=s + " " ;
				}
				output+="\n";
			}
			else
			   output+="\n";
		}
		output+="\n";
		return output;
	}
}
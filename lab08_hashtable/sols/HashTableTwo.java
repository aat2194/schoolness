//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTableTwo
{
	private ListNode[] table;

	public HashTableTwo( )
	{
		this(10);
	}

	public HashTableTwo(int size)
	{
		table = new ListNode[size];
	}

	public void add(Object obj)
	{
		int i = obj.hashCode();
		if(contains(obj, i)==false)
		{
			table[i] = new ListNode(obj, table[i]);
		}
	}
	
	private boolean contains(Object obj, int i)
	{
		ListNode current = table[i];
		while(current != null)
		{
			if(current.getValue().equals(obj))
				return true;
			current = current.getNext();
		}
		return false;
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for ( int i =0; i<table.length; i++ )
		{
			output+="bucket " +i+" ";
			ListNode current = table[i];
			while(current!=null)
			{
				output+=current.getValue() + " " ;
				current = current.getNext();
			}
			output+="\n";
		}
		output+="\n";
		return output;
	}
}
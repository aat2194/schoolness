//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList<String>();
		stack = new Stack<String>();

		for(String s : list.split(" "))
		{
			queue.add(s);
			stack.push(s);
		}
	}

	public boolean isPalin()
	{
		while(queue.isEmpty()!=true && stack.isEmpty()!=true)
		{
		   if(queue.remove().equals(stack.pop())==false)
		      return false;
		}
		return true;
	}


	public String toString()
	{
		return ""+queue;
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;

	public StackTester()
	{
		setStack("");
	}

	public StackTester(String line)
	{
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack = new Stack<String>();
		for(String s : line.split(" "))
		{
			stack.push(s);
		}		
	}

	public void popEmAll()
	{
		out.println("popping all items from the stack");
		while(stack.isEmpty()!=true)
		{
			out.print(stack.pop()+ " ");
		}
		out.println("\n\n\n");
	}

	public String toString()
	{
		return ""+stack+"\n";
	}
}
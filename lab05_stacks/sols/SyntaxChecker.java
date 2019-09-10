//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Stack;
import java.util.Arrays;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<String> symbols;

	public SyntaxChecker()
	{
		setExpression("");
	}

	public SyntaxChecker(String s)
	{
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp=s;
		symbols = new Stack<String>();
	}

	public boolean checkExpression()
	{
		String open = "{(<[";
		String close = "})>]";
		String[] list = exp.split("");
		for(int i=1; i<list.length;i++)
		{
			String s = list[i];
			if(open.indexOf(s)>-1)
				symbols.push(s);
			else if(close.indexOf(s)>-1)
			{
				if(symbols.isEmpty()==true)
					return false;
				String op = symbols.pop();
				if(close.indexOf(s)!=open.indexOf(op))
					return false;
			}
		}
		return symbols.isEmpty();
	}

	public String toString()
	{
		if(checkExpression())
			return exp+" is correct.\n\n";
		return exp + "is incorrect.\n\n";
	}
}
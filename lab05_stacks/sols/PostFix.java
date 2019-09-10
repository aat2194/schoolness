//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		setExpression("");
	}

	public PostFix(String exp)
	{
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		stack=new Stack<Double>();
		expression=exp;
	}

	public double calc(double one, double two, char op)
	{
		switch(op)
		{
			case '+': return one+two;
			case '-': return one-two;
			case '*': return one*two;
			default : return one/two;
		}
	}

	public void solve()
	{
		Scanner chop = new Scanner(expression);
		while(chop.hasNext())
		{
			String loc = chop.next();
			char value = loc.charAt(0);

			if(Character.isDigit(value))
			{
				stack.push( (double)(value - '0') );
			}
			else
			{
				double two, one;
				two = stack.pop();
				one = stack.pop();
				stack.push( calc(one, two, value) );
			}
		}
	}

	public String toString()
	{
		return expression + " = " + stack.pop();
	}
}
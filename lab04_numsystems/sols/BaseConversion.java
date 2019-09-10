//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class BaseConversion
{
	private String number;
	private int base;

	public BaseConversion(String num, int b)
	{
		number=num;
		base=b;
	}

	public void setNumBase(String num, int b)
	{
		number=num;
		base=b;
	}

	private int convertToTen( )
	{
		int q=number.length();
		int base10=0;
		for(int x=0;x<q;x++)
		{
			int dig = number.charAt(q-x-1)-48;
			if(dig<10)
				base10=base10+(dig)*(int)(Math.pow(base, x));
			else
				base10=base10+(dig-7)*(int)(Math.pow(base, x));
		}
		return base10;
	}

	public String getNum(int newBase)
	{
	   int base10 = convertToTen();
		String newNum="";
		while(base10>0)
		{
			if(base10%newBase>9)
			{
				int rem=base10%newBase;
				newNum=""+(char)(rem+55)+newNum;
				base10 = base10/newBase;
			}
			else
			{
				newNum=""+base10%newBase+newNum;
				base10 = base10/newBase;
			}
		}
		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}
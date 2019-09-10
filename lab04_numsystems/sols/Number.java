//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Number implements Comparable<Number>
{
	private String number;
	private int base;
	private Integer base10;
	private String binary;
	
	public Number(String num, int b)
	{
		number=num;
		base=b;
		base10 = Integer.parseInt(number,base);
		binary = Integer.toString(base10,2);
	}
	
	private int countOnes()
	{
		String bin = binary;
		bin=bin.replaceAll("0","");
	   return bin.length();	
	}
	
	public int compareTo(Number param)
	{
      if(countOnes()>param.countOnes())
         return 1;
      if(countOnes()<param.countOnes())
	      return -1;
	   if (base10.compareTo(param.base10)==0)
	      return number.compareTo(param.number);
	   return base10.compareTo(param.base10);
	}
	
	public String toString( )
	{
	  return number + " " + + base10 + " " + binary;
	}
}
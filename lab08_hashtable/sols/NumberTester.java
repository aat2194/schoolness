//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class - 
//Lab  -

public class NumberTester
{
	public static void main(String[] args)
	{
		Number one = new Number(45);
		System.out.println(one.hashCode());		//should out 5
		
		Number two = new Number(107);
		System.out.println(two.hashCode());		//should out 7
		
		Number three = new Number(213);
		System.out.println(three.hashCode());	//should out 3		
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Convert
{
	private String sentence;
	private String binary;

	public Convert()
	{
		sentence="";
		binary="";
	}

	public Convert(String sentence)
	{
		this.sentence=sentence;
		binary="";
	}

	public void convert()
	{
		binary = "";
		int colCheck=0;
		for(int a : sentence.toCharArray())
		{
			String num = Integer.toString(a, 2);
			for(int j=0; j<8-num.length(); j++)
				binary += "0";
			binary += num + " ";
			
			colCheck++;
			if(colCheck>6)
			{
				binary+="\n";
				colCheck=0;
			}
		}
	}

	public String toString()
	{
		return sentence + "\n" + binary + "\n\n";
	}
}
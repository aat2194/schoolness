//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Part implements Comparable<Part>
{
	private String make, mode, leftOver;
	private int year;

	public Part(String line) 
	{
		String[] partPieces = line.split(" ");
		int end = partPieces.length;
		leftOver ="";
		for(int i = 0; i < partPieces.length - 3; i++)
		{
			leftOver += " " + partPieces[i];
		}
		make = partPieces[end-3];
		mode = partPieces[end-2];
		String y = partPieces[end-1];
		year = Integer.parseInt(y);
	}

	//have to have compareTo if this class implements Comparable
	public int compareTo( Part other )
	{
		if(make.equals(other.make))
		{
			if(mode.equals(other.mode))
			{
				if(year==other.year)
				{
					return leftOver.compareTo(other.leftOver);
				}
				else if(year > other.year)
					return 1;
				return -1;
			}
			return mode.compareTo(other.mode);
		}
		return make.compareTo(other.make);
	}

	public String toString()  {
		return "" + make + " " + mode + " " + year + " " + leftOver;
	}
}
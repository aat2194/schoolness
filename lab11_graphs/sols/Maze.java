//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;

	public Maze()
	{
		exitFound = false;
		maze = new int[0][0];
	}

	public Maze(int[][] m)
	{
		exitFound=false;
		maze = new int[m.length][m[0].length];
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				maze[r][c]=m[r][c];
			}
		}
	}


	public boolean checkForExitPath(int r, int c)
	{
		if(r < maze.length && r >= 0 && c < maze.length && c >= 0 && maze[r][c]==1)
		{
			if( c==maze.length-1)
			{
				return true;
			}
			else
			{
				maze[r][c] = 0;			//mark the spot as visited
				return (checkForExitPath(r + 1, c) ||
						checkForExitPath(r - 1, c) ||
							checkForExitPath(r, c + 1)||
							checkForExitPath(r, c - 1));
			}
		}
		return false;
	}

	public String toString()
	{
		String output="";
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				output+=maze[r][c]+" ";
			}
			output+="\n";
		}
		return output;
	}
}
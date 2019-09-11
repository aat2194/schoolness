//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathMaze
{
   private int[][] maze;
   private int shortest;

	public ShortestPathMaze()
	{
		shortest=Integer.MAX_VALUE;
		maze = new int[0][0];
	}

	public ShortestPathMaze(int[][] m)
	{
		shortest=Integer.MAX_VALUE;
		maze = new int[m.length][m[0].length];
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				maze[r][c]=m[r][c];
			}
		}
	}


	public void checkForExitPath(int r, int c, int path)
	{
		if(r < maze.length && r >= 0 && c < maze.length && c >= 0 && maze[r][c]==1 && path<shortest)
		{
			if(c==maze.length-1)
			{
				if(path<shortest)
				   shortest=path;
			}
			else
			{
				maze[r][c] = 0;			//mark the spot as visited
				checkForExitPath(r + 1, c, path+1);
				checkForExitPath(r - 1, c, path+1);
				checkForExitPath(r, c + 1, path+1);
				checkForExitPath(r, c - 1, path+1);
				maze[r][c] = 1;			//mark the spot as visited				
			}
		}
	}
	
	public int getShortestPath()
	{
		return shortest;
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
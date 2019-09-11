//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class HeapSort
{
	private ArrayList<Integer> list;

	public HeapSort()
	{
		list = new ArrayList<Integer>();
	}

   public void swapUp(int index)
   {
   	int bot = index;
		while(bot>0)
		{
			int parent = (bot-1)/2;
			if(list.get(parent) < list.get(bot))
			{
				swap(parent, bot);
				bot=parent;
			}
			else{
				break;
			}
		}
	}

	public void swapDown(int index)
	{
		int root=0;
		while(root<index)
		{
			int max=0;
		   int left = root * 2 + 1;
		   int right = root * 2 + 2;

    		if(left < index)
			{
				if(right < index)
				{
					if (list.get(left) <= list.get(right))
					{
						max = right;
					}
					else{
						max = left;
					}
				}
				else
					max = left;
			}
			else break;

			if (list.get(root) < list.get(max))
			{
				swap(root, max);
				root=max;
			}
			else break;
		}
	}

   public void heapSort(int[] nums)
   {
   	for(int item : nums)
   	{
   		list.add(item);
   	}
   	for(int i = 1; i<nums.length; i++)
   	{
   		swapUp(i);
   	}
   	for(int i=list.size()-1; i>=1; i--)
   	{
   		swap(0, i);
   		swapDown(i-1);   		
   	}   	
   }
   
   private void swap(int first, int last)
   {
   	Integer temp = list.get(first);
   	list.set(first, list.get(last));
   	list.set(last, temp);
   }

	public String toString()
	{
		return list.toString();
	}
}
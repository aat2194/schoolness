//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class HistoList
{
	private ListNode front;

	public HistoList( )
	{
		front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
		if(indexOf(obj)==-1)
		   front = new ListNode(new ThingCount(obj,1),front);
		else{
			ListNode current = nodeAt(indexOf(obj));
			((ThingCount)current.getValue()).setCount(((ThingCount)current.getValue()).getCount()+1);
		}
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		int spot=-1;
		ListNode current = front;
		while(current!=null)
		{
			spot++;
			ThingCount temp=(ThingCount)current.getValue();
			if(temp.compareTo(new ThingCount(obj,0))==0)
			   return spot;
			current = current.getNext();
		}
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode current=front;
		for(int i=0; i<spot; i++)
		{
			current=current.getNext();
		}
		return current;
	}

	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = "";
		ListNode current = front;

		while(current != null)
		{
			output = output + current.getValue() + "  ";
			current = current.getNext();
		}
		return output;
	}
}
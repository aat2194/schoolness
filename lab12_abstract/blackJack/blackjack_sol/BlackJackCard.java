//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

package BlackJack;

public class BlackJackCard extends Card
{
  	public BlackJackCard()
  	{
  		super();
   }

  	public BlackJackCard(int f, String s)
  	{
  	   super(f,s);
  	}

  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
  		if(getFace()==1)
  		   return 11;
  		if(getFace()>9)
  		   return 10;
  		return getFace();
  	}
 }
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

package BlackJack;

public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	public Card()
  	{
  		face=0;
  		suit="";
   }

  	public Card(int f, String s)
  	{
  	   face = f;
  	   suit = s;
  	}

	// modifiers
  	public void setFace(int f)
  	{
  	   face = f;
  	}

  	public void setSuit(String s)
  	{
  	   suit = s;
  	}

  	//accessors
  	public int getFace()
  	{
  	   return face;
  	}

  	public String getSuit ()
  	{
  		return suit;
  	}

  	public abstract int getValue();

	public boolean equals(Object obj)
	{
		Card other = (Card)obj;
		if(face==other.face&&suit.equals(other.suit))
		   return true;
		return false;
	}

  	public String toString()
  	{
  	   return FACES[face] + " of " + getSuit() + " | value = " + getValue();
  	}
 }
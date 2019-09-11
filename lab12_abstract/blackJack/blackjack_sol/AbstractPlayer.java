//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

package BlackJack;

import java.util.ArrayList;
import BlackJack.Card;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand;
   private int winCount;

   public AbstractPlayer ()
   {
      winCount=0;
      hand = new ArrayList<Card>();
   }

   public AbstractPlayer (int score)
   {
      winCount=score;
      hand=new ArrayList<Card>();
   }

   public void addCardToHand( Card temp )
   {
      hand.add(temp);
   }

   public  void resetHand( )
   {
      hand.clear();
   }

   public  void setWinCount( int numwins )
   {
      winCount=numwins;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
      int total=0;
      for(Card card : hand)
      {
      	 total=total+card.getValue();
      }
      return total;
   }

   public String toString()
   {
      return "hand = " + hand.toString().replaceAll(",","\n") + " - " + getHandValue();
   }
}
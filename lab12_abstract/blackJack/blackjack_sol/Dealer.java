//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

package BlackJack;

import BlackJack.Card;
import BlackJack.AbstractPlayer;
import BlackJack.Deck;

public class Dealer extends AbstractPlayer
{
	private Deck deckOfCards;

	public Dealer() {
	   deckOfCards = new Deck();
	}

	public void  shuffle()
	{
	   deckOfCards.shuffle();
	}

	public Card  deal(){
	   return deckOfCards.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deckOfCards.numCardsLeft();
	}

	public boolean hit()
	{
	   if(getHandValue()<17){
	      addCardToHand(deal());
	      return true;
	   }
	   return false;
    }
}









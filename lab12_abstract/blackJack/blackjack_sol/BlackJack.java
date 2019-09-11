//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import BlackJack.Card;
import BlackJack.BlackJackCard;
import BlackJack.Deck;
import BlackJack.Player;
import BlackJack.Dealer;

public class BlackJack
{
	private Dealer dealer;
	private Player player;

	public BlackJack()
	{
		dealer = new Dealer();
		player = new Player();
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		char choice = 0;
		dealer.shuffle();
		do
		{
			dealer.resetHand();
			player.resetHand();
			
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
			player.addCardToHand(dealer.deal());
			dealer.addCardToHand(dealer.deal());
	
			while(player.hit())
			{
				player.addCardToHand(dealer.deal());
			}
	
			while(dealer.hit())
			{
			}

			out.println("\nPLAYER ");
			out.println("Hand Value :: " + player.getHandValue());
			out.println("Hand Size :: " + player.getHandSize());
			out.println("Cards in Hand :: " + player.toString());

			out.println("\nDEALER ");
			out.println("Hand Value :: " + dealer.getHandValue());
			out.println("Hand Size :: " + dealer.getHandSize());
			out.println("Cards in Hand :: " + dealer.toString());
	
			
			if(player.getHandValue()>21&&dealer.getHandValue()<=21)
			{
				out.println("\nDealer wins - Player busted!");
				dealer.setWinCount(dealer.getWinCount()+1);
			}
			else if(player.getHandValue()<=21&&dealer.getHandValue()>21)
			{
				out.println("\nPlayer wins - Dealer busted!");
				player.setWinCount(player.getWinCount()+1);				
			}
			else if(player.getHandValue()>21&&dealer.getHandValue()>21){
				out.println("Both players bust!");
			}
			else if(player.getHandValue()<dealer.getHandValue()){
				out.println("\nDealer has bigger hand value!");
				dealer.setWinCount(dealer.getWinCount()+1);				
			}
			else if(player.getHandValue()==dealer.getHandValue()){
				out.println("\nTie game!");
			}
			else{
				out.println("\nPlayer has bigger hand value!");
				player.setWinCount(player.getWinCount()+1);				
			}
			
			out.println("\nDealer has won "+dealer.getWinCount()+" times.");
			out.println("Player has won "+player.getWinCount()+" times.\n");
			
			if(dealer.numCardsLeftInDeck()<10)
			{
				dealer.shuffle();
			}

			out.print("Do you want to play again? [Y,y,N,n] :: ");
			choice = keyboard.next().charAt(0);
		}while(choice=='y'||choice=='Y');
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

package BlackJack;

import BlackJack.AbstractPlayer;
import java.util.Scanner;
import static java.lang.System.*;

public class Player extends AbstractPlayer
{
   public Player()
   {
		super();
   }
   public Player(int score) {

      super(score);
   }

   public  boolean  hit( )
   {
      Scanner keyboard = new Scanner(in);

      out.print("\nCurrent hand "+super.toString());
      out.print("\nDo you want to hit? [Y/N] ");
      String answer = keyboard.next();

      if(answer.equals("Y")||answer.equals("y"))
         return true;
      return false;
   }

   //why do you not need to write a toString()?????



}








package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
  */

import java.util.*;
/**

 *@author Jasvir Kaur
 * @Date  02-10-2020
 */


 public class CardTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random()* 13+1));   
            c.setSuit(Card.SUITS[(int) (Math.random()*4)]); 
            magicHand[i] = c;
            
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
          }
        int value;
        String suit;
        System.out.println();
        value = in.nextInt();
        System.out.println("Enter the Suit:");
        suit = in.nextLine();
       // System.out.println("This is in array list");
         System.out.println("This is Lucky Cards list");
        }
 }

        




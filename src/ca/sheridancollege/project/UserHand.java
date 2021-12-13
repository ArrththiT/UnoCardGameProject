/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author BingChen Sun
 */
public class UserHand extends GroupOfCards
{
   protected ArrayList<Card> userHand = new ArrayList<Card>();
//   int rn = (int) Math.random() * 2;

   public void addUserCards (Card cardsToAdd)
   {
      this.userHand.add(cardsToAdd);
//      super.cards.remove(0);
   }

   public Card getUserCards (int bus2)
   {
      return this.userHand.get(bus2);
   }

   public int getUserSize ()
   {
      return this.userHand.size();
   }

    void addCards() {
        //please add something here whoever is working on it
    }
}

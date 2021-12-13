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
    public class GamePile extends GroupOfCards
{
   protected ArrayList<Card> gamePile = new ArrayList<Card>();

   public void dropACard (Card cardsToAdd)
   {
      this.gamePile.add(cardsToAdd);

   }

   public Card getGamePile (int gameBus)
   {
      return this.gamePile.get(gameBus);
   }

   public int getGamePileSize ()
   {
      return this.gamePile.size();
   }
}

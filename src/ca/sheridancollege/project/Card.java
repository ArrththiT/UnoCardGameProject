/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes
    private Cards cards;
    private Color color;

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    public Card (Cards cards, Color color)
   {
      this.cards = cards;
      this.color = color;
   }

   public Cards getCardNumber ()
   {
      return this.cards;
   }

   public Color getCardColor ()
   {
      return this.color;
   }

   public void setCardColor (Color color)
   {
      this.color = color;
   }
}

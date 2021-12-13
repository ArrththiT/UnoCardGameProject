/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList<Card>();
    //private int size;//the size of the grouping

    //public GroupOfCards(int size) {
    //    this.size = size;
    //}

    //   public void addCards (Cards card)
//   {
//      this.cards.add(card);
//   }
   public void addCards (Card card)
   {
      this.cards.add(card);
//      this.cards.add(Cards.TWO);
//      this.cards.add(Cards.THREE);
//      this.cards.add(Cards.FOUR);
   }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
     public Card getCards (int bus)
   {
//      if (this.cards.isEmpty()) {
//         throw new Exception("No cards here.");
//      }
//      for (int i = 0; i < this.getSize() - 1; i++) {
//
//      }
      return this.cards.get(bus);
   }
     
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
   public int getSize ()
   {
      return this.cards.size();
   }

    /**
     * @param size the max size for the group of cards
     */
   // public void setSize(int size) {
   //     this.size = size;
   //}

}//end class

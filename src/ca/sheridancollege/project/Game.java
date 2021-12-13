/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {
    

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    


    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game.This might be one method or many method calls depending on your game.
     * @param cardH
     * @param ch
     * @param us
     */
    public void ComputerDrawFour(ArrayList<Card> cardH, ComputerHand ch, UserHand us){
        for(int i = 0; i<cardH.size(); i++){
            if (cardH.get(i).getCardNumber()==Cards.DRAWFOUR){
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to user hand
                

            }
      
        }
 
    }
    
    
    public void userDrawFour(ArrayList<Card> cardH, ComputerHand ch, UserHand us ){
        for(int i = 0; i<cardH.size(); i++){
            if (cardH.get(i).getCardNumber()==Cards.DRAWFOUR){
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to computer hand
                us.getSize();

            }
      
        }
    }
    
    
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner(); 

}//end class

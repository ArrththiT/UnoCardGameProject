/*
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
     * Play the game.This might be one method or many method calls depending on
     * your game.
     *
     * @param cardH
     * @param ch
     * @param us
     */
    //COMPUTER DRAW FOUR
    public void ComputerDrawFour(ArrayList<Card> cardH, ComputerHand ch, UserHand us) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.DRAWFOUR) {
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to user hand
                ch.addCards();
                /*
                whoever is working on computer and userhand please fill this!
                 */

            }

        }

    }

    //USER DRAW FOUR
    public void userDrawFour(ArrayList<Card> cardH, ComputerHand ch, UserHand us) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.DRAWFOUR) {
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to computer hand
                us.addCards(); ///who ever is working on adding cards please fill this

            }

        }
    }

    //SHOW LAST CARD
    public void showLastCard(ArrayList<GamePile> pile) {
        for (int i = 0; i < pile.size(); i++) {
            System.out.println("last card will be the the "
                    + "latest card" + pile.get(i));

        }

    }

    //DRAW TWO FOR USER
    public void userDrawTwo(ArrayList<Card> cardH, ComputerHand ch, UserHand us) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.DRAWTWO) {
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to computer hand
                us.addCards(); ///who ever is working on adding cards please fill this

            }

        }
    }
    //COMPUTER DRAW TWO

    public void ComputerDrawTwo(ArrayList<Card> cardH, ComputerHand ch, UserHand us) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.DRAWTWO) {
                System.out.println("Opponent will pick up 4 cards");
                //adding cards to user hand
                ch.addCards();
                /*
                whoever is working on computer and userhand please fill this!
                 */

            }

        }

    }

    //COMPUTER WILD
    public void ComputerWild(ArrayList<Card> cardH, ComputerHand ch) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.WILD) {
                System.out.println("Computer user will now choose a color");
                Scanner input = new Scanner(System.in);
                System.out.println("Please choose between the following: RED, "
                        + "BLUE, YELLOW, OR GREEN.");
                String c = input.nextLine();
                //for red
                if (c.equalsIgnoreCase(Color.RED.name())) {
                    System.out.println("Color will now be red");
                    //for blue
                }
                if (c.equalsIgnoreCase(Color.BLUE.name())) {
                    System.out.println("Color will now be blue");
                    //for green
                }
                if (c.equalsIgnoreCase(Color.GREEN.name())) {
                    System.out.println("Color will now be green");
                    //for yellow
                }
                if (c.equalsIgnoreCase(Color.YELLOW.name())) {
                    System.out.println("Color will now be yellow");

                }

            }

        }

    }
    //COMPUTER WILD

    public void UserWild(ArrayList<Card> cardH, UserHand us) {
        for (int i = 0; i < cardH.size(); i++) {
            if (cardH.get(i).getCardNumber() == Cards.WILD) {
                System.out.println("Computer user will now choose a color");
                Scanner input = new Scanner(System.in);
                System.out.println("Please choose between the following: RED, "
                        + "BLUE, YELLOW, OR GREEN.");
                String c = input.nextLine();
                //for red
                if (c.equalsIgnoreCase(Color.RED.name())) {
                    System.out.println("Color will now be red");
                    //for blue
                }
                if (c.equalsIgnoreCase(Color.BLUE.name())) {
                    System.out.println("Color will now be blue");
                    //for green
                }
                if (c.equalsIgnoreCase(Color.GREEN.name())) {
                    System.out.println("Color will now be green");
                    //for yellow
                }
                if (c.equalsIgnoreCase(Color.YELLOW.name())) {
                    System.out.println("Color will now be yellow");

                }

            }

        }

    }

    
    
    
public void play(Card c) {
        UserHand firstCom = null;
        UserHand secondCom = null;
        UserHand thirdCom = null;
        UserHand user = null;

UserHand [] players = {user, firstCom, secondCom, thirdCom};
String [] names = {"You", "Janet", "Bender", "Dolores"};

// a computer player plays a card, which is passed to the GUI for display;
 int turn = 0;
setLastCardPlayed (players[turn].comPlay(this, discarded));

// if no card is left in the player's hand, end the game
if (players[turn].getCards().size()<=0 || players[turn].getNumberOfCards() <= 0) {
c.setWinner(names[turn]);
endGame();
}

// determine next turn, which depends on the current game direction and number of skip
turn += currentDirection;
if (this.currentSkip == 1) {
turn += currentDirection;
this.setCurrentSkip(0);
}
// if turn is out of bound, change accordingly
if (turn == -1) {
turn = 3;
} else if (turn == -2) {
turn = 2;
} else if (turn == 4) {
turn = 0;
} else if (turn == 5) {
turn = 1;
}
}
    public abstract void declareWinner(); 

public void endGame() {
        boolean gameOver = true;
}

/** Get whether the game is over.
*
* @ return a boolean
**/
public boolean getGameOver() {
        boolean gameOver = false;
return gameOver;
}
}//end class

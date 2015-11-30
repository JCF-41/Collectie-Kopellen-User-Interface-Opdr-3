package Client.Domain;

import java.util.ArrayList;
import java.util.Random;

/**
 * An class containin info about an Hero and metods what he can do
 */
public class Hero {

    private final Match match;
    private int hitPoints = 50;
    private boolean finished;
    private Deck deck;
    private final Player player;
    
    private ArrayList<Minion> minions;
    private ArrayList<Card> cardsInHand;
    private Card cardPlayed;
    private final Random randomCard = new Random();

    /**
     * Create an new intace of Hero
     * @param match the match in which he exists
     * @param player the player he represents
     * @param deck the deck the player wants to play with
     */
    public Hero(Match match, Player player, Deck deck) {
        // TODO - implement Hero.Hero
        this.match = match;
        this.player = player;
        this.deck = deck;
        
        this.minions = new ArrayList<>();
        this.cardsInHand = new ArrayList<>();
    }

    /**
     * sets if the player is finished
     *
     * @param finished
     */
    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    /**
     * sets the minions of the player
     *
     * @param minions
     */
    public void setMinions(ArrayList<Minion> minions) {
        this.minions = minions;
    }

    /**
     * sets the hand of the player
     *
     * @param inHand
     */
    public void setNewHand(ArrayList<Card> inHand) {
        this.cardsInHand = inHand;
    }

    /**
     * sets the card played by the Hero
     *
     * @param cardPlayed
     */
    public void setCardPlayed(Card cardPlayed) {
        this.cardPlayed = cardPlayed;
    }

    /**
     * tries to play the card the Player selected
     *
     * @param card
     * @return boolean if the method succeeded
     */
    public boolean playCard(Card card) {
        if (this.getMinions().size() >= 2) {
            if (card instanceof MinionCard) {
                return false;
            } else{
                this.setCardPlayed(card);
                return true;
            }
        } else{
            this.setCardPlayed(card);
            return true;
        }
    }

    /**
     * removes the minions from the ArrayList of minions
     *
     * @param minion
     */
    public void removeMinion(Minion minion) {
        minions.remove(minion);
    }
}

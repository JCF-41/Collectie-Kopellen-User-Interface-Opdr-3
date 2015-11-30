package Server.Domain;

import java.util.ArrayList;
import java.util.Random;
import Shared.Domain.Card;

/**
 * An class containin info about an Hero and metods what he can do
 */
public class Hero implements ITarget {

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
     * Gets the deck of the player
     *
     * @return deck of type Deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * Sets the deck of the player
     *
     * @param deck
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     * returns if the player is finished with his turn
     *
     * @return if player is finished with boolean
     */
    public boolean getFinished() {
        return this.finished;
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
     * returns the minions of the player
     *
     * @return the minions of the Hero in an ArrayList&lt;Minion&gt;
     */
    public ArrayList<Minion> getMinions() {
        return minions;
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
     * returns the cards of the player
     *
     * @return the cards of the Hero in an ArrayList&lt;Card&gt;
     */
    public ArrayList<Card> getInHand() {
        return cardsInHand;
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
     * returns the card played by the player
     *
     * @return the card played by the Hero as Card
     */
    public Card getCardPlayed() {
        return cardPlayed;
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
     * grabs cards from the deck and sets the cards in hand. 
     * it uses the setNewHand method
     */
    public void pullCards() {
        ArrayList<Card> cards = deck.getCards();
        ArrayList<Card> cardsInHand = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            int cardPosition = randomCard.nextInt(29);
            cardsInHand.add(cards.get(cardPosition));
            cards.remove(cardPosition);
        }

        this.setNewHand(cardsInHand);
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

    /**
     * returns the current hitPoints of the Hero
     *
     * @return the hitPoints of the Hero
     */
    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * sets the hitPoints of the Hero
     *
     * @param hitPoints
     */
    @Override
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}

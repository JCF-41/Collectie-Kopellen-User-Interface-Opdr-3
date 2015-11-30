package Client.Domain;

import java.util.ArrayList;

/**
 * An class for storing info about the current game instance
 */
public class Game {

    private static Game instance;
    private ArrayList<Icon> icons;
    private ArrayList<Card> cards;
    private Player player;
    private Match match;

    /**
     * Initialise the game instace
     */
    public Game() {
        // Exists only to defeat instantiation.        
    }

    /**
     * get the icons the game knows of
     * @return the list of icons
     * @deprecated moved to Controller.PlayerIconController
     */
    public ArrayList<Icon> getIcon() {
        return this.icons;
    }

    /**
     * return instance??instance=new game();
     *
     * @return this game instance
     */
    public synchronized static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     *
     * @param username the player username
     * @param password the player password
     * @return player returns the player that gets logged in
     */
    public Player login(String username, String password) {
        this.player = new Player(0, username, 0, 0, 0, 0, 0); //TODO!!!
        return this.player;
    }

    /**
     * Get all the cards the game knows off
     * @return the list of 30 cards
     * @deprecated moved to Controller.CardDeckController
     */
    public ArrayList<Card> getCards() {
        return this.cards;
    }

    /**
     *
     * @param username the player username
     * @param password the player password
     * @return boolean returns true when the signUp has succeded and false
 when the username already exist
     */
    public boolean signUp(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }
        Player newplayer = new Player(0, username, 0, 0, 0, 0, 0); //TODO!!!
        return true;
    }

    /**
     *
     * @param player
     * @return match creates a match with the param player
     */
    public Match startMatch() {//TODO
        this.match = new Match(player);
        return this.match;
    }

}

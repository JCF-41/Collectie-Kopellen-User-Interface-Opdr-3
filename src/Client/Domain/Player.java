package Client.Domain;

/**
 * An class containing attributes of an player
 */
public class Player {

    private int id;
    private final String username;
    private int iconId;
    private int rating;
    private int matches;
    private int wins;
    private int losses;
/*
     Moet er een methode komen die het wachtwoord wegschrijft naar de database? 
     Of willen we het wachtwoord opslaan op de player?
     */
    /**
     * creates an new instace of player
     * @param id the player id
     * @param username the payers username
     * @param iconId the players icon
     * @param rating the players rating
     * @param wins the players wins
     * @param losses the players losses
     * @param matches the players matches
     */
    public Player(int id, String username, int iconId, int rating, int wins, int losses, int matches) /* throws UnkownUsername, IncorrectPassword */ {
        this.id = id;
        this.username = username;
        this.iconId = iconId;
        this.wins = wins;
        this.losses = losses;
        this.matches = matches;
        this.rating = rating;
    }

    /**
     * Returns the username of the player
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the IconID of the player
     * @return get the icon id
     */
    public int getIconId() {
        return this.iconId;
    }


    /**
     * Returns the Rating of the player
     * @return the rating
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * Returns the number of matches the player has played
     * @return the amount of matches played
     */
    public int getMatches() {
        return this.matches;
    }

    /**
     * Returns the number of wins te player has made in the past
     * @return the amount of wins
     */
    public int getWins() {
        return this.wins;
    }

    /**
     * Gets the number of losses the player has made
     * @return the amount of losses
     */
    public int getLosses() {
        return this.losses;
    }
}

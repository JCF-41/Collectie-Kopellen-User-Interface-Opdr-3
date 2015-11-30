package Client.Domain;

/**
 * The Possible gamestates
 */
public enum GameState {
    /**
     * The game is in progress
     */
    Active, 
    /**
     * The game is finished and both players died
     */
    Tie, 
    /**
     * The game is finished and one player has died or conseided
     */
    Defined, 
    /**
     * Only one player in the match waiting for another player
     */
    Waiting
}
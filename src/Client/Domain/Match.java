package Client.Domain;

import java.util.ArrayList;
import java.util.Timer;
//import java.util.TimerTask;
import java.util.logging.Logger;

/**
 * Controller for an match between two players
 */
public class Match {

        private static final Logger log = Logger.getLogger(Match.class.getName());;
    
	private int turns;
	private GameState gameState;

        private final Player player1;
        private Player player2;
        
        private final Hero hero1;
        private Hero hero2;
        
        Timer timer;

	/**
	 * Create a new instance of match with P1 as the first player/hero
	 * @param P1 The first player
	 */
	public Match(String token1) {
            player1 = P1;
            hero1 = new Hero(this,player1,new Deck());//todo deck
            determineGameState();
            //gameState = GameState.Waiting;
            //Matthijs
//            timer = new Timer();
//            timer.schedule(new TimerTask(){
//                @Override
//                public void run() {
//                    if(gameState != GameState.Active){
//                        if(gameState == GameState.Defined || gameState == GameState.Tie){
//                            timer.cancel();//quit if the game has finished
//                            return;
//                        }
//                    }
//                    if(hero1.getFinished() && hero2.getFinished()){
//                        processTurn();
//                    }
//                }
//            }, 0, 100);
	}

        /**
         * Get the current gamestate
         * @return the current game state
         */
	public GameState getGameState() {
            return this.gameState;
	}

	/**
	 * Concede a match, this will make a player force lose
	 * @param hero The hero that concedes
	 */
	public void concede(Hero hero) {
            //gameState = GameState.Defined;
            hero.setHitPoints(0);
            determineGameState();
	}

        public void setITarget(int source, int target, ITarget iTarget){
            
        }
}

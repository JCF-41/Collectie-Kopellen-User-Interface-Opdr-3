package Server.Domain;

import java.util.ArrayList;
import java.util.Timer;
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
         * check's the players health and updates the gamestate according to their health
         */
	private void determineGameState() {
            if(player2 == null){
                gameState = GameState.Waiting;
                return;
            }
            if(hero1.getHitPoints()<=0 ^ hero2.getHitPoints() <= 0){//^= XOR true+false = true, false+false = false and true+true=false
                gameState = GameState.Defined;
                return;
            }
            if(hero1.getHitPoints()>0 && hero2.getHitPoints()>0){
                gameState = GameState.Active;
                return;
            }
            gameState = GameState.Tie;
	}

        /**
         * Processes one turn. (card's played, minion attacks and gamestate update)
         */
	private void processTurn() {
            //log.info(String.format("Processing turn %d of player '%s' and '%s'.",turns,player1.getUsername(),player2.getUsername()));
            Card p1 = hero1.getCardPlayed();
            Card p2 = hero2.getCardPlayed();
            
            //check minion card
            //create new minions
            if(p1 instanceof MinionCard){
                //log.info(String.format("Adding minion %s to %s",p1.getName(),player1.getUsername()));
                Minion m = new Minion((MinionCard)p1);
                hero1.getMinions().add(m);
                //hero1.addMinion(m);
                //todo set target somhow?
            }
            if(p2 instanceof MinionCard){
                //log.info(String.format("Adding minion %s to %s",p2.getName(),player2.getUsername()));
                Minion m = new Minion((MinionCard)p2);
                hero2.getMinions().add(m);
                //hero2.addMinion(m);
                //todo set target somhow?
            }
            
            //log.info("Processing minion attacks. Obtaining minions");
            //get all active minions
            ArrayList<Minion> p1min = hero1.getMinions();
            ArrayList<Minion> p2min = hero2.getMinions();
            
            //log.info("Filter non hero attack, attack minions");
            //all not player attacks            
            p1min.stream().filter((m)->m.getITarget()!=hero2).forEach((m)->m.attack());//attack all not players
            p2min.stream().filter((m)->m.getITarget()!=hero1).forEach((m)->m.attack());//attack all not players
            
            //log.info("Remove dead minions");
            //remove dead minions
            p1min.removeIf((m)->m.getHitPoints()<=0);
            p2min.removeIf((m)->m.getHitPoints()<=0);
            
            //log.info("Filter hero attacks, attack hero");
            //all minion to player attacks
            p1min.stream().filter((m)->m.getITarget()==hero2).forEach((m)->m.attack());//attack hero2
            p2min.stream().filter((m)->m.getITarget()==hero1).forEach((m)->m.attack());//attack hero1
            
            //log.info("Process HeroCard attacks");
            //attack using cards
            //attack player card
            if(p1 instanceof HeroCard){
                //log.info(String.format("%s attacks %s with %s",player1.getUsername(),player2.getUsername(),p1.getName()));
                HeroCard p1h = (HeroCard)p1;
                
                int hp = hero2.getHitPoints();
                //Matthijs
                int pSchield = 0, mSchield=0, healing = 0, physicalDamageDone, magicalDamageDone, totalValue;
                if(p2 instanceof HeroCard){
                    //log.info(String.format("%s blocks %s with %s",player2.getUsername(),player1.getUsername(),p2.getName()));
                    HeroCard p2h = (HeroCard)p2;
                    pSchield = p2h.getPhysicalBlock();
                    mSchield = p2h.getMagicalBlock();
                    healing = p2h.getHealValue();
                }
                physicalDamageDone = p1h.getPhysicalDamage() - pSchield;
                if(physicalDamageDone < 0){
                    physicalDamageDone = 0;
                }
                magicalDamageDone = p1h.getMagicalDamage() - mSchield;
                if(magicalDamageDone < 0){
                    magicalDamageDone = 0;
                }
                totalValue = (physicalDamageDone + magicalDamageDone) - healing;
                if(hp - totalValue > 50){
                    hero2.setHitPoints(50);
                }
                else{
                    hero2.setHitPoints(hp - totalValue);
                }
                
                log.info(String.format("hero 2 heeft %s hp over",hero2.getHitPoints()));
                //Matthijs
            }
            if(p2 instanceof HeroCard){
                //log.info(String.format("%s attacks %s with %s",player2.getUsername(),player1.getUsername(),p2.getName()));
                HeroCard p2h = (HeroCard)p2;
                int hp = hero1.getHitPoints();
                //Matthijs
                int pSchield = 0, mSchield=0, healing = 0, physicalDamageDone, magicalDamageDone, totalValue;
                if(p1 instanceof HeroCard){
                    //log.info(String.format("%s blocks %s with %s",player1.getUsername(),player2.getUsername(),p1.getName()));
                    HeroCard p1h = (HeroCard)p1;
                    pSchield = p1h.getPhysicalBlock();
                    mSchield = p1h.getMagicalBlock();
                    healing = p1h.getHealValue();
                }
                physicalDamageDone = p2h.getPhysicalDamage() - pSchield;
                if(physicalDamageDone < 0){
                    physicalDamageDone = 0;
                }
                magicalDamageDone = p2h.getMagicalDamage() - mSchield;
                if(magicalDamageDone < 0){
                    magicalDamageDone = 0;
                }
                totalValue = (physicalDamageDone + magicalDamageDone) - healing;
                if(hp - totalValue > 50){
                    hero1.setHitPoints(50);
                }
                else{
                    hero1.setHitPoints(hp - totalValue);
                }
                log.info(String.format("hero 1 heeft %s hp over",hero1.getHitPoints()));
                //Matthijs
            }
            log.info("Turn finished");
            //todo here or somwere else?
            determineGameState();
            //Matthijs
            hero1.setFinished(false);
            hero2.setFinished(false);
            //Matthijs
            turns++;
	}

	/**
	 * Create a new instance of match with P1 as the first player/hero
	 * @param P1 The first player
	 */
	public Match(Player P1) {
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
            //Matthijs
	}

	/**
	 * Adds a second player as hero 2
	 * @param P2 the second player
	 */
	public void addPlayer2(Player P2) {
            player2 = P2;
            hero2 = new Hero(this,P2,new Deck());
            determineGameState();
            //gameState = GameState.Active;
	}

        /**
         * Get the amount of turns passed
         * @return The amount of turns
         */
	public int getTurns() {
            return this.turns;
	}

        /**
         * Get the first hero
         * @return the first hero object
         */
        public Hero getHero1() {
            return hero1;
	}

        /**
         * Get the second hero
         * @return the second hero object
         */
	public Hero getHero2() {
            return hero2;
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
        
        /**
         * Checks the match state and both players states and processes the turn.
         */
        public void startTurn(){
            determineGameState();
            if(gameState != GameState.Active){
                if(gameState == GameState.Defined || gameState == GameState.Tie){
                    // TODO
                }
            }
            if(hero1.getFinished() && hero2.getFinished()){
                processTurn();
            }
        }
}

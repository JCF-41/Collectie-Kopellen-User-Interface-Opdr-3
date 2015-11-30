package Server.Domain;

import Shared.Domain.MinionCard;
/**
 * An class containing info about an minion, its attributes and its actions
 */
public class Minion implements ITarget {

	private final int physicalDamage;
	private final int magicalDamage;
	private final int maxHitPoints;
	private int hitPoints;
        private ITarget target;
        
	/**
	 * Create an new instance of minion and set its attributes according to the minionCard
	 * @param minionCard the minion card
	 */
	public Minion(MinionCard minionCard) {
		this.physicalDamage = minionCard.getPhysicalDamage();
                this.magicalDamage = minionCard.getMagicalDamage();
                this.maxHitPoints = minionCard.getHitPoints();
                this.hitPoints = maxHitPoints;
	}

        /**
         * Attack the stored target
         */
	public void attack() {
		ITarget target = this.getITarget();
                target.setHitPoints(target.getHitPoints() - this.getPhysicalDamage() - this.getMagicalDamage());
	}

        /**
         * Get the physical damage of the minion
         * @return the amount of damage
         */
	public int getPhysicalDamage() {
		return this.physicalDamage;
	}

        /**
         * Get the magical damage of the minion
         * @return the amount of damage
         */
	public int getMagicalDamage() {
		return this.magicalDamage;
	}

        /**
         * Get maximum amount of hitpoints
         * @return the amount max amount of hitpoints
         */
	public int getMaxHitPoints() {
		return this.maxHitPoints;
	}

        /**
         * get the current target
         * @return the target
         */
	public ITarget getITarget() {
            return target;
	}

	/**
	 * set the current target
	 * @param iTarget the target
	 */
	public void setITarget(ITarget iTarget) {
            this.target = iTarget;    
	}

        /**
         * get the current amount of hitpoints
         * @return the amount of hitpoins
         */
        @Override
        public int getHitPoints(){
            return hitPoints;
        }
        
        /**
         * set the current amount of hitpoints
         * @param hitPoints the new amount of hitpoints
         */
        @Override
        public void setHitPoints(int hitPoints){
            this.hitPoints = hitPoints;
        }
}

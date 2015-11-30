package Server.Domain;

/**
 * An interface specifieing someone that can take damage
 */
public interface ITarget {

	/**
	 * Set the hitpoints of the target
	 * @param hitPoints the new amount of hitpoints
	 */
	void setHitPoints(int hitPoints);

        /**
         * Get the amount of hitpoints the target has
         * @return the amount of hitpoints
         */
	int getHitPoints();

}
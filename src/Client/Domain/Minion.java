package Client.Domain;

/**
 * An class containing info about an minion, its attributes and its actions
 */
public class Minion {

    private final int physicalDamage;
    private final int magicalDamage;
    private final int maxHitPoints;
    private int hitPoints;

    /**
     * Create an new instance of minion and set its attributes according to the
     * minionCard
     *
     * @param minionCard the minion card
     */
    public Minion(MinionCard minionCard) {
        this.physicalDamage = minionCard.getPhysicalDamage();
        this.magicalDamage = minionCard.getMagicalDamage();
        this.maxHitPoints = minionCard.getHitPoints();
        this.hitPoints = maxHitPoints;
    }

    /**
     * Get the physical damage of the minion
     *
     * @return the amount of damage
     */
    public int getPhysicalDamage() {
        return this.physicalDamage;
    }

    /**
     * Get the magical damage of the minion
     *
     * @return the amount of damage
     */
    public int getMagicalDamage() {
        return this.magicalDamage;
    }

    /**
     * Get maximum amount of hitpoints
     *
     * @return the amount max amount of hitpoints
     */
    public int getMaxHitPoints() {
        return this.maxHitPoints;
    }
}

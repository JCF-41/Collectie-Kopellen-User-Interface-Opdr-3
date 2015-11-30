/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Domain;

/**
 *
 * @author Loek
 */
public class MinionCard extends Card {

	private final int physicalDamage;
	private final int magicalDamage;
	private final int hitPoints;

	/**
	 * Constructor
         * Check if any number that is given as a parameter is a negative value. If so throw an illegalArgumentException
         * @param name the name of the minion
         * @param filename the filename of the corrosponding image
         * @param description the description of the minion [UNUSED]
	 * @param physicalDamage The physical strength of a card
	 * @param magicalDamage The magical strength of a card
	 * @param hitPoints The amount of health a minion has 
	 */
	public MinionCard(String name, String filename, String description, int physicalDamage, int magicalDamage, int hitPoints) {
//            super(name, filename, description);
//                testForNegativeValue(physicalDamage);
//                testForNegativeValue(magicalDamage);
//                testForNegativeValue(hitPoints);
                
                this.physicalDamage = physicalDamage;    
                this.magicalDamage = magicalDamage;
		this.hitPoints = hitPoints;
	}
        
        /**
         * Get the physical strength of a card
         * @return The physical strength of a card
         */
	public int getPhysicalDamage() {
		return this.physicalDamage;
	}
        
        /**
         * Get the magical strength of a card
         * @return The magical strength of a card
         */
	public int getMagicalDamage() {
		return this.magicalDamage;
	}
        
        /**
         * Get the amount of health a minion has 
         * @return The amount of health a minion has 
         */
	public int getHitPoints() {
		return this.hitPoints;
	}


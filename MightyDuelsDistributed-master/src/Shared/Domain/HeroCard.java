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
public class HeroCard extends Card {

    private final int physicalDamage;
    private final int magicalDamage;
    private final int physicalBlock;
    private final int magicalBlock;
    private final int healValue;

    /**
     * Constructor Check if any number that is given as a parameter is a
     * negative value. If so throw an illegalArgumentException
     *
     * @param name the name of the card
     * @param filename the file containing the image
     * @param description the description of the card [UNUSED]
     * @param physicalDamage The physical strength of a card
     * @param magicalDamage The magical strength of a card
     * @param physicalBlock The physical armor that a card gives
     * @param magicalBlock The magical armor that a card gives
     * @param healValue The amount that a card heals
     */
    public HeroCard(String name, String filename, String description, int physicalDamage, int magicalDamage, int physicalBlock, int magicalBlock, int healValue) {
//		super(name, filename, description);
//                testForNegativeValue(physicalDamage);
//                testForNegativeValue(magicalDamage);
//                testForNegativeValue(physicalBlock);
//                testForNegativeValue(magicalBlock);
//                testForNegativeValue(healValue);
//                
        this.physicalDamage = physicalDamage;
        this.magicalDamage = magicalDamage;
        this.physicalBlock = physicalBlock;
        this.magicalBlock = magicalBlock;
        this.healValue = healValue;
    }

    /**
     * Get the physical strength of a card
     *
     * @return The physical strength of a card
     */
    public int getPhysicalDamage() {
        return this.physicalDamage;
    }

    /**
     * Get the magical strength of a card
     *
     * @return The magical strength of a card
     */
    public int getMagicalDamage() {
        return this.magicalDamage;
    }

    /**
     * Get the physical armor that a card gives
     *
     * @return The physical armor that a card gives
     */
    public int getPhysicalBlock() {
        return this.physicalBlock;
    }

    /**
     * Get the magical armor that a card gives
     *
     * @return The magical armor that a card gives
     */
    public int getMagicalBlock() {
        return this.magicalBlock;
    }

    /**
     * Get the amount that a card heals
     *
     * @return The amount that a card heals
     */
    public int getHealValue() {
        return this.healValue;
    }
}

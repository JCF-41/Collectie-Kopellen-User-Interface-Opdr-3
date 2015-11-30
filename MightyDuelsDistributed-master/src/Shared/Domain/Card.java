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
public abstract class Card {

    private final String name;
    private final String filename;
    private final String description;

    /**
     * Constructor
     *
     * @param name The name of the card
     * @param filename The path to the image that represents the card
     * @param description The description of the card
     */
    public Card(String name, String filename, String description) {
        this.name = name;
        this.filename = filename;
        this.description = description;
    }

    /**
     * Get the name of the card
     *
     * @return The name of the card
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the path to the image that represents the card
     *
     * @return The path to the image that represents the card
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Get the description of the card
     *
     * @return The description of the card
     */
    public String getDescription() {
        return this.description;
    }
}

/**
 * Check if given int is a negative value
 *
 * @param test The number that will be tested for a negative value
 */
//        public void testForNegativeValue(int test){
//            if(test < 0){
//                Logger.getLogger(Card.class.getName()).info(String.format("Value %s less then 0",test));
//                //Commented because we might make cards that have negative values.
//                //throw new IllegalArgumentException();
//            }
//        }

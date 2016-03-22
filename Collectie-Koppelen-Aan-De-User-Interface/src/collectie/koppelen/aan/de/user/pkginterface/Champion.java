/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectie.koppelen.aan.de.user.pkginterface;

import java.util.List;

/**
 *
 * @author Stan
 */
public class Champion {

    private String name;
    private String releaseDate;
    private int difficulty;
    private String category;
    private List<Ability> abilities;
    
    public Champion(String name, String releaseDate, int difficulty, String category) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.difficulty = difficulty;
        this.category = category;
    }
    
    public Champion(String name, String releaseDate, int difficulty, String category, List<Ability> abilities) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.difficulty = difficulty;
        this.category = category;
        this.abilities = abilities;
    }
    
    //Auto generated getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setStats(List<Ability> abilities) {
        this.abilities = abilities;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectie.koppelen.aan.de.user.pkginterface;

/**
 *
 * @author Stan
 */
public class Ability {
    
    private String keyBinding;
    private String name;
    
    public Ability(String keyBinding, String name) {
        this.keyBinding = keyBinding;
        this.name = name;
    }
    
    public String getKeyBinding() {
        return keyBinding;
    }

    public void setKeyBinding(String keyBinding) {
        this.keyBinding = keyBinding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

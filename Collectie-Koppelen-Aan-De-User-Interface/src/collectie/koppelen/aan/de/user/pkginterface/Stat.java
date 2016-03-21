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
public class Stat {

    private int baseAD;
    private int baseArmor;
    private int baseMagicResist;
    private int baseMovementSpeed;
    
    public Stat(int baseAD, int baseArmor, int baseMagicResist, int baseMovementSpeed) {
        this.baseAD = baseAD;
        this.baseArmor = baseArmor;
        this.baseMagicResist = baseMagicResist;
        this.baseMovementSpeed = baseMovementSpeed;
    }
    
    //Autogenned gets/sets
    public int getBaseAD() {
        return baseAD;
    }

    public void setBaseAD(int baseAD) {
        this.baseAD = baseAD;
    }

    public int getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(int baseArmor) {
        this.baseArmor = baseArmor;
    }

    public int getBaseMagicResist() {
        return baseMagicResist;
    }

    public void setBaseMagicResist(int baseMagicResist) {
        this.baseMagicResist = baseMagicResist;
    }

    public int getBaseMovementSpeed() {
        return baseMovementSpeed;
    }

    public void setBaseMovementSpeed(int baseMovementSpeed) {
        this.baseMovementSpeed = baseMovementSpeed;
    }
    
}

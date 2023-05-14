package tech.bosstop.blobtopia.core;

import java.util.List;

import tech.bosstop.commons.structures.core.Armor;
import tech.bosstop.commons.structures.core.Weapon;

import tech.bosstop.blobtopia.core.items.armor.Shirt;
import tech.bosstop.blobtopia.core.items.weapons.WoodSword;

public class ItemManager {

    List<Weapon> weapons;

    List<Armor> armor;

    public void enable() {


        // WEAPONS
        this.weapons.add(new WoodSword());

        // ARMOR
        this.armor.add(new Shirt());
    }


    public List<Weapon> getWeapons() {
        return this.weapons;
    }

    public List<Armor> getArmor() {
        return this.armor;
    }

    public Weapon getWeapon(int id) {
        for (Weapon weapon : this.weapons) {
            if (weapon.getId() == id) {
                return weapon;
            }
        }
        return null;
    }

    public Armor getArmor(int id) {
        for (Armor armor : this.armor) {
            if (armor.getId() == id) {
                return armor;
            }
        }
        return null;
    }

}
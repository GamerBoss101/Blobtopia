package tech.bosstop.blobtopia.core;

import java.util.List;

import tech.bosstop.commons.structures.Item;
import tech.bosstop.blobtopia.core.items.armor.Shirt;
import tech.bosstop.blobtopia.core.items.weapons.WoodSword;

public class ItemManager {

    List<Item> weapons;

    List<Item> armor;

    public void enable() {
        this.weapons.add(new WoodSword());

        this.armor.add(new Shirt());
    }
}
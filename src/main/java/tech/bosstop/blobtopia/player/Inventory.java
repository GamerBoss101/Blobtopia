package tech.bosstop.blobtopia.player;

import java.util.ArrayList;
import java.util.List;

import tech.bosstop.blobtopia.core.items.weapons.WoodSword;
import tech.bosstop.commons.structures.core.Item;
import tech.bosstop.commons.structures.core.Weapon;

public class Inventory {

    private Item head;
    private Item chest;
    private Item legs;
    private Item feet;

    private Weapon weapon;

    private List<Item> items = new ArrayList<Item>();

    Inventory() {
        this.weapon = new WoodSword();
    }

    public Item getHead() {
        return head;
    }

    public Item getChest() {
        return chest;
    }

    public Item getLegs() {
        return legs;
    }

    public Item getFeet() {
        return feet;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public void setChest(Item chest) {
        this.chest = chest;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }

    public void setFeet(Item feet) {
        this.feet = feet;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void removeItem(int index) {
        this.items.remove(index);
    }

    public void removeItem(String name) {
        for (Item item : this.items) {
            if (item.getName().equalsIgnoreCase(name)) {
                this.items.remove(item);
            }
        }
    }
}

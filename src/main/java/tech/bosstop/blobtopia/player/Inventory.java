package tech.bosstop.blobtopia.player;

import java.util.List;

import tech.bosstop.commons.structures.Item;

public class Inventory {

    private Item head;
    private Item chest;
    private Item legs;
    private Item feet;

    private Item weapon;

    private List<Item> items = new ArrayList<Item>();

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

    public Item getWeapon() {
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

    public void setWeapon(Item weapon) {
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

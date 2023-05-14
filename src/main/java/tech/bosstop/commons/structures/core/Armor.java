package tech.bosstop.commons.structures.core;

public class Armor extends Item {

    private int level = 0;

    private int defense;

    public Armor(String name, int id, int level, int defense) {
        super(name, id, ItemType.ARMOR);
        this.level = level;
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDefense() {
        return (this.level * 5) + this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

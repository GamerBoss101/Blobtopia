package tech.bosstop.commons.structures.core;

public class Weapon extends Item {

    private int level = 0; 

    private int damage;

    public Weapon(String name, int id, int level, int damage) {
        super(name, id, ItemType.WEAPON);
        this.level = level;
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return (this.level * 5) + this.damage;
    }
}

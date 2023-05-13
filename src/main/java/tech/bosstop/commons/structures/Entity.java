package tech.bosstop.commons.structures;

public class Entity {
    protected int health = 100;
    protected int defense = 50;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDefense() {
        return this.defense;
    }
}

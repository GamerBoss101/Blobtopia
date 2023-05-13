package tech.bosstop.blobtopia.player;

import tech.bosstop.commons.structures.Entity;
import tech.bosstop.commons.structures.PlayerClass;

public class Player extends Entity {

    private boolean isAlive = false;

    private String name;

    private int level = 0;

    private int xp = 0;

    private PlayerClass playerClass;

    private Inventory inventory;
    
    public Player() {
        super();
        this.inventory = new Inventory();
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void levelUp() {
        this.level++;
        this.health = (this.level * 20) + 50;
        this.defense = (this.level * 10) + 50;
    }

    public void addXP(int xp) {
        this.xp += xp;

        if(this.xp >= (this.level * 100)) {
            this.xp = 0;
            this.levelUp();
        }
    }

    public int getLevel() {
        return this.level;
    }

    public int getXP() {
        return this.xp;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }

    public PlayerClass getPlayerClass() {
        return this.playerClass;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public int getDamage() {
        if (this.inventory.getWeapon() == null) {
            return 10;
        }

        return this.inventory.getWeapon().getDamage() + (this.level * 2);
    }

}

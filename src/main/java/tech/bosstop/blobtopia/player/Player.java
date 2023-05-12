package tech.bosstop.blobtopia.player;

import tech.bosstop.commons.structures.Entity;

public class Player extends Entity {

    private boolean isAlive = false;
    private String name;
    
    public Player() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

}

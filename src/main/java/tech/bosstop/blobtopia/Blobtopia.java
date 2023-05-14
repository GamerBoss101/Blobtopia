package tech.bosstop.blobtopia;

import java.io.IOException;

import tech.bosstop.blobtopia.core.ItemManager;
import tech.bosstop.blobtopia.player.Player;
import tech.bosstop.blobtopia.stories.Journey;
import tech.bosstop.blobtopia.util.Console;
import tech.bosstop.commons.storage.Store;
import tech.bosstop.commons.structures.core.PlayerClass;

public class Blobtopia {

    private static Blobtopia instance = new Blobtopia();

    private Console console = new Console();

    private ItemManager itemManager = new ItemManager();

    private Player player = new Player();

    private void createPlayer() {
        String name = this.console.ask("Enter your name:");

        this.player.setName(name);

        PlayerClass[] playerClasses = PlayerClass.values();

        PlayerClass selected = this.console.options("Choose your class: ", playerClasses);

        player.setPlayerClass(selected);

        //this.console.clear();

        System.out.println("Welcome, " + this.player.getName() + "!");
        System.out.println("You have " + this.player.getHealth() + " health!");
        System.out.println("You are a " + this.player.getPlayerClass() + "!");
    }

    public static void main( String[] args ) throws IOException {

        try {
            if(!Store.enable()) return;
        } catch (IOException e) {
            e.printStackTrace();
        }

        instance.createPlayer();

        Journey.start();

    }

    public Console getConsole() {
        return this.console;
    }
    
    public Player getPlayer() {
        return this.player;
    }

    public ItemManager getItemManager() {
        return this.itemManager;
    }

    public static Blobtopia getInstance() {
        return instance;
    }
}

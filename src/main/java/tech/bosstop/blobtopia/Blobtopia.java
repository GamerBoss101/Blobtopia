package tech.bosstop.blobtopia;

import java.io.IOException;
import java.util.Scanner;

import tech.bosstop.blobtopia.core.ItemManager;
import tech.bosstop.blobtopia.player.Player;
import tech.bosstop.blobtopia.stories.Journey;
import tech.bosstop.commons.storage.Store;
import tech.bosstop.commons.structures.PlayerClass;

public class Blobtopia {

    private static Blobtopia instance = new Blobtopia();

    private ItemManager itemManager = new ItemManager();

    private Player player = new Player();

    private void createPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        this.player.setName(name);

        // Choose your player's class 

        System.out.println("Choose your class: ");

        PlayerClass[] playerClasses = PlayerClass.values();

        for(int i = 0; i < playerClasses.length; i++) {
            System.out.println(i + ". " + playerClasses[i].getName());
        }

        System.out.println("Welcome, " + this.player.getName() + "!");
        System.out.println("Your health is " + this.player.getHealth() + " and your defense is " + this.player.getDefense() + ".");

        scanner.close();
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

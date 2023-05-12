package tech.bosstop.blobtopia;

import java.io.IOException;
import java.util.Scanner;

import tech.bosstop.blobtopia.player.Player;
import tech.bosstop.commons.storage.Store;

public class Blobtopia {

    private static Blobtopia instance = new Blobtopia();

    private Player player = new Player();

    private void createPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        this.player.setName(name);

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

    }
    

    public Player getPlayer() {
        return this.player;
    }

    public static Blobtopia getInstance() {
        return instance;
    }
}

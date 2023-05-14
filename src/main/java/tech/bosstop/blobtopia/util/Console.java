package tech.bosstop.blobtopia.util;

import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);
    
    public void voice(String message) {
        System.out.println(message);
    }

    public String ask(String prompt) {
        
        System.out.print(prompt + " ");

        String input = scanner.nextLine();

        return input;
    }

    public int askInt(String prompt) {
        
        System.out.print(prompt + " ");

        int input = scanner.nextInt();

        return input;
    }

    public <T> T options(String prompt, T[] options) {

        System.out.println(prompt);

        for(int i = 0; i < options.length; i++) {
            System.out.println("[" + (i+1)  + "] " + options[i]);
        }

        System.out.print("Enter your choice: ");

        int input = scanner.nextInt();

        return options[input - 1];
    }

    /*
    public void clear() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }  
    */

}

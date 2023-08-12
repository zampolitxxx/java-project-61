package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void greeting() {
        String playerName;
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        playerName = sc.nextLine();
        sc.close();
        System.out.println("Hello, " + playerName + "!");
    }
}

package hexlet.code;

import java.util.Scanner;

class Cli {
    static void greeting() {
        String name = "";
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        App.user = sc.nextLine();
        System.out.println("Hello, " + App.user + "!");
    }
}

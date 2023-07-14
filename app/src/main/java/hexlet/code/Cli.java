package hexlet.code;

import java.util.Scanner;

class Cli {
    static void greeting() {
        String name = "";
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = sc.nextLine();
        sc.close();
        System.out.println("Hello, " + name + "!");
    }
}

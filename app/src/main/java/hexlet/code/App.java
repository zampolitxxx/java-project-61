package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static int userChoice = 0;
    private static final int SWITCH_KEY_GREET = 1;
    private static final int SWITCH_KEY_EVEN = 2;
    private static final int SWITCH_KEY_CALC = 3;
    private static final int SWITCH_KEY_GCD = 4;
    private static final int SWITCH_KEY_PROGRESSION = 5;
    private static final int SWITCH_KEY_PRIME = 6;
    public static void main(String[] args) {
        String[] games = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        System.out.println("Please enter the game number and press Enter.");
        //show list of the games
        for (int i = 1; i < games.length; i++) {
            System.out.printf("%d - %s\n", i, games[i]);
        }
        System.out.println("0 - Exit");
        //end section of list games
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        userChoice = sc.nextInt();
        //
        if (userChoice >= SWITCH_KEY_GREET & userChoice < games.length) {
            Cli.greeting();
            switch (userChoice) {
                case SWITCH_KEY_GREET: break;
                case SWITCH_KEY_EVEN: Even.playEven(); break;
                case SWITCH_KEY_CALC: Calc.playCalc(); break;
                case SWITCH_KEY_GCD: GCD.playGCD(); break;
                case SWITCH_KEY_PROGRESSION: Progression.playProgression(); break;
                case SWITCH_KEY_PRIME: Prime.playPrime(); break;
                default: System.out.println("Your choice is not correct");
            }
        }
    }
}

package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.\s
                 1 - Greet
                 2 - Even
                 3 - Calc
                 4 - GCD
                 5 - Progression
                 6 - Prime
                 0 - Exit""");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String userChoice;
        userChoice = sc.next();
        switch (userChoice) {
            case "0":
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.playCalc();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            default:
                System.out.println("Your choice is not correct");
        }
    }
}

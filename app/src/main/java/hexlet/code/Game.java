package hexlet.code;
import java.lang.Math;
import java.util.Scanner;

public class Game {
    public static void gameParityNumber() {
        int numberOfQuestions = 3;
        int score = 0;
        int mimRandom = 1;
        int maxRandom = 10;
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i <numberOfQuestions; i++) {
            int randomNumber = 1 + (int) (Math.random() * (maxRandom - mimRandom) + mimRandom);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ((answer.equals("yes") && (randomNumber % 2) == 0) || (answer.equals("no") && (randomNumber % 2) != 0)) {
                System.out.println("Correct!");
                score++;
            } else {
                if ((randomNumber % 2) != 0 & !answer.equals("no")) {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                }
                System.out.println("Let's try again, " + App.user + "!");
                break;
            }
        }
        if (score == numberOfQuestions) {
            System.out.println("Congratulations, " + App.user + "!");
        }
    }
}

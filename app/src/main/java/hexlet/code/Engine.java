package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static void startGame(String rules, String[][] data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Welcome to the Brain Games!
                May I have your name?""");
        String playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(rules);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String question = data[i][0];
            String correctAnswer = data[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = sc.next().toLowerCase();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.print("Let's try again, " + playerName + "!");
                sc.close();
                return;
            }
        }
        System.out.print("Congratulations, " + playerName + "!");
        sc.close();
    }
}

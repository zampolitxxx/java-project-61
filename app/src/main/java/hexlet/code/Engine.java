package hexlet.code;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Engine {

    public static final int INDEX_OF_QESTION = 0;   //in the data array [["Qustion, ...] => index=0;
    public static final int INDEX_OF_ANSWER = 1;   //in the data array [["..., "Answer"],  => index=1;
    public static final int MAX_RANDOM = 20;
    public static final int MIN_RANDOM = 1;
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int NUM_OF_ELEM = 2; // Number of elements in array [["Qestion", "Answer"]... => 1+1=2
    private static int score = 0;

    public static void startGame(String rules, String[][] data) {
        System.out.println(rules);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + data[i][INDEX_OF_QESTION]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine();
//            sc.close();
            if (data[i][INDEX_OF_ANSWER].equals(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + data[i][INDEX_OF_ANSWER] + "'.");
                System.out.print("Let's try again, " + Cli.name + "!");
                break;
            }
            if (score == 3) {
                System.out.print("Congratulations, " + Cli.name + "!");
            }
        }
    }
}
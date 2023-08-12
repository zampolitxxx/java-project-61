package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 1;
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
    private static String correctAnswer = "";
    public static void playEven() {
        for (int i = 0; i < data.length; i++) {
            int randomNumber = 1 + (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM);
            data[i][0] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            data[i][1] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
}

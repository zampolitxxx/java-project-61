package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][Engine.NUM_OF_ELEM];
    private static String correctAnswer = "";
    public static void playEven() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumber = 1 + (int) (Math.random() * (Engine.MAX_RANDOM - Engine.MIN_RANDOM) + Engine.MIN_RANDOM);
            data[i][Engine.INDEX_OF_QESTION] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            data[i][Engine.INDEX_OF_ANSWER] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
}

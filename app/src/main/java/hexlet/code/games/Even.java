package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 1;

    public static void playEven() {
        final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < data.length; i++) {
            data[i] = getRoundData();
        }
        Engine.startGame(RULES, data);
    }

    private static String[] getRoundData() {
        int randomNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        String correctAnswer = isEven(randomNumber) ? "yes" : "no";
        String question = Integer.toString(randomNumber);
        return new String[] {question, correctAnswer};
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

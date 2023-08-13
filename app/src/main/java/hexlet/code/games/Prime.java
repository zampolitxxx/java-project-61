package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 2;

    public static void playPrime() {
        final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            data[i] = getRoundData();
        }
        Engine.startGame(RULES, data);
    }

    private static String[] getRoundData() {
        int randomNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        String question = Integer.toString(randomNumber);
        String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[] {question, correctAnswer};
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

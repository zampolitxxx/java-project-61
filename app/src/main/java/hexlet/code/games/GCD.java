package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 1;

    public static void playGCD() {
        final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < data.length; i++) {
            data[i] = getRoundData();
        }
        Engine.startGame(RULES, data);
    }

    private static String[] getRoundData() {
        int firstNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        int secondNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        String correctAnswer = Integer.toString(getGCD(firstNumber, secondNumber));
        String question = firstNumber + " " + secondNumber;
        return new String[] {question, correctAnswer};
    }

    private static int getGCD(int a, int b) {
        int remainder;
        int smallerNumber = a;
        int largerNumber = b;
        if (a >= b) {
            smallerNumber = b;
            largerNumber = a;
        }
        do {
            remainder = largerNumber % smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = remainder;
        } while (remainder != 0);
        return largerNumber;
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM = 20;
    private static final String[][] DATA = new String[Engine.NUMBER_OF_ROUNDS][2];

    public static void playGCD() {
        for (int i = 0; i < DATA.length; i++) {
            DATA[i] = getRoundData();
        }
        Engine.startGame(RULES, DATA);
    }

    private static String[] getRoundData(){
        int firstNumber = Util.getRandom(MAX_RANDOM);
        int secondNumber = Util.getRandom(MAX_RANDOM);
        String correctAnswer = Integer.toString(getGCD(firstNumber, secondNumber));
        String question = firstNumber + " " + secondNumber;
        return new String[] {question, correctAnswer};
    }

    private static int getGCD(int a, int b) {
        int remainder = 0;
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

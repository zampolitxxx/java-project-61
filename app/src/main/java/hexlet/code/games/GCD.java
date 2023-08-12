package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 1;
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
    private static int correctResult = 0;
    private static String correctAnswer = "";
    public static void playGCD() {
        for (int i = 0; i < data.length; i++) {
            int firstNumber = 1 + (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM);
            int secondNumber = 1 + (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM);
            correctResult = getGCD(firstNumber, secondNumber);
            correctAnswer = Integer.toString(correctResult);
            data[i][0] = firstNumber + " " + secondNumber;
            data[i][1] = correctAnswer;
        }
        Engine.startGame(RULES, data);
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

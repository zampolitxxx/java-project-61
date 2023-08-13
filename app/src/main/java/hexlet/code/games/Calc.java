package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 1;
    private static final char[] SIGN = {'+', '-', '*'};

    public static void playCalc() {
        final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < data.length; i++) {
            data[i] = getRoundData();
        }
        Engine.startGame(RULES, data);
    }

    private static String[] getRoundData() {
        int firstNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        int secondNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        char signInExpression = SIGN[Util.getRandom(SIGN.length)];
        int correctResult;
        switch (signInExpression) {
            case '-': correctResult = firstNumber - secondNumber; break;
            case '+': correctResult = firstNumber + secondNumber; break;
            case '*': correctResult = firstNumber * secondNumber; break;
            default: correctResult = 0;
        }
        String correctAnswer = Integer.toString(correctResult);
        String question = firstNumber + " " + signInExpression + " " + secondNumber;
        return new String[] {question, correctAnswer};
    }
}

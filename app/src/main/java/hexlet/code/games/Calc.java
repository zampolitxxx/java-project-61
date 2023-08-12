package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    public static final int MAX_RANDOM = 20;
    public static final int MIN_RANDOM = 1;
    private static final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
    private int userResult = 0;
    private static final char[] SIGN = {'+', '-', '*'};
    public static void playCalc() {
        for (int i = 0; i < data.length; i++) {
            int firstNumber = 1 + (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM);
            int secondNumber = 1 + (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM) + MIN_RANDOM);
            char signInExpression = SIGN[((int) (Math.random() * (SIGN.length)))];
            int correctResult = 0;
            switch (signInExpression) {
                case '-': correctResult = firstNumber - secondNumber; break;
                case '+': correctResult = firstNumber + secondNumber; break;
                case '*': correctResult = firstNumber * secondNumber; break;
                default: correctResult = 0;
            }
            String correctAnswer = Integer.toString(correctResult);
            data[i][0] = firstNumber + " " + signInExpression + " " + secondNumber;
            data[i][1] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
}

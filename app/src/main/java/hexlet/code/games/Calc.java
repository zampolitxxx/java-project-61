package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][Engine.NUM_OF_ELEM];
    private static String correctAnswer = "";
    private int userResult = 0;
    private static int correctResult = 0;
    private static final char[] SIGN = {'+', '-', '*'};
    public static void playCalc() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstNumber = 1 + (int) (Math.random() * (Engine.MAX_RANDOM - Engine.MIN_RANDOM) + Engine.MIN_RANDOM);
            int secondNumber = 1 + (int) (Math.random() * (Engine.MAX_RANDOM - Engine.MIN_RANDOM) + Engine.MIN_RANDOM);
            char signInExpression = SIGN[((int) (Math.random() * (SIGN.length)))];
            switch (signInExpression) {
                case '-': correctResult = firstNumber - secondNumber; break;
                case '+': correctResult = firstNumber + secondNumber; break;
                case '*': correctResult = firstNumber * secondNumber; break;
                default: correctResult = 0;
            }
            correctAnswer = Integer.toString(correctResult);
            data[i][Engine.INDEX_OF_QESTION] = firstNumber + " " + signInExpression + " " + secondNumber;
            data[i][Engine.INDEX_OF_ANSWER] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
}

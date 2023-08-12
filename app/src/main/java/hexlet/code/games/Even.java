package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM = 20;
    private static final String[][] DATA = new String[Engine.NUMBER_OF_ROUNDS][2];
    public static void playEven() {
        for (int i = 0; i < DATA.length; i++) {
            DATA[i] = getRoundData();
        }
        Engine.startGame(RULES, DATA);
    }

    private static String[] getRoundData(){
        int randomNumber = Util.getRandom(MAX_RANDOM);
        String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        String question = Integer.toString(randomNumber);
        return new String[] {question, correctAnswer};
    }

    private static boolean isPrime(int number) {
        return number % 2 == 0;
    }
}

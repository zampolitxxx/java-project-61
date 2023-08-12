package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM = 20;
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];

    public static void playPrime() {
        for (int i = 0; i < data.length; i++) {
            data[i] = getRoundData();
        }
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

package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][Engine.NUM_OF_ELEM];
    private static int correctResult = 0;
    private static String correctAnswer = "";
    public static void playPrime() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int shiftNumber = 1;   //avoids one in a number of random numbers
            int randomNumber = shiftNumber + (int) (Math.random() *
                    (Engine.MAX_RANDOM - Engine.MIN_RANDOM) + Engine.MIN_RANDOM);
            data[i][Engine.INDEX_OF_QESTION] = Integer.toString(randomNumber);
            if (isPrime(randomNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            data[i][Engine.INDEX_OF_ANSWER] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_RANDOM = 20;
    private static final int MIN_RANDOM = 0;

    public static void playProgression() {
        final String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < data.length; i++) {
            data[i] = getRoundData();
        }
        Engine.startGame(RULES, data);
    }

    private static String[] getRoundData() {
        int indexOfHiddenNumber = Util.getRandom(PROGRESSION_LENGTH, MIN_RANDOM);
        int firstNumber = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        int step = Util.getRandom(MAX_RANDOM, MIN_RANDOM);
        String[] arrQuestion = getProgression(PROGRESSION_LENGTH, firstNumber, step);      //["0", "1", "2", "3", ...]
        String correctAnswerStr = arrQuestion[indexOfHiddenNumber];
        arrQuestion[indexOfHiddenNumber] = "..";    //["0", "..", "2", "3", ...]
        String question = String.join(" ", arrQuestion);  //"0 .. 2 3...."
        return new String[] {question, correctAnswerStr};
    }

    private static String[] getProgression(int progressionLength, int firstNumber, int step) {
        String[] progressionNumbers = new String[progressionLength];
        int nextNumber = firstNumber;
        for (int i = 0; i < progressionLength; i++) {
            nextNumber += step;
            progressionNumbers[i] = Integer.toString(nextNumber);
        }
        return progressionNumbers;  //["0", "1", "2", "3", ...]
    }
}

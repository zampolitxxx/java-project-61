package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Arrays;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final String[][] DATA = new String[Engine.NUMBER_OF_ROUNDS][2];

    public static void playProgression() {
        for (int i = 0; i < DATA.length; i++) {
            DATA[i] = getRoundData();
        }
        Engine.startGame(RULES, DATA);
    }

    private static String[] getRoundData() {
        int indexOfHiddenNumber = Util.getRandom(PROGRESSION_LENGTH);
        String correctAnswer = Integer.toString(indexOfHiddenNumber);
        String[] arrQuestion = getProgression(PROGRESSION_LENGTH);      //["0", "1", "2", "3", ...]
        arrQuestion[indexOfHiddenNumber] = "..";    //["0", "..", "2", "3", ...]
        String question = String.join(",", arrQuestion).replace(',', ' ');  //"0 .. 2 3...."
        return new String[] {question, correctAnswer};
    }

    private static String[] getProgression(int progressionLength) {
        String[] progressionNumbers = new String[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progressionNumbers[i] = Integer.toString(i);
        }
        return progressionNumbers;  //["0", "1", "2", "3", ...]
    }
}

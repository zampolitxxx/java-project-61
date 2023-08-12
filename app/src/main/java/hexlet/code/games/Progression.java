package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int SIZE_STRINGBUFFER = 3;           // coefficient for memory allocation for StringBuffer
    public static final String RULES = "What number is missing in the progression?";
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][2];
    private static int correctResult = 0;
    private static String correctAnswer = "";
    public static void playProgression() {
        for (int i = 0; i < data.length; i++) {
            StringBuffer sb = new StringBuffer(PROGRESSION_LENGTH * SIZE_STRINGBUFFER);
            int indexOfHiddenNumber = (int) (Math.random() * PROGRESSION_LENGTH);
            correctResult = indexOfHiddenNumber;
            correctAnswer = Integer.toString(correctResult);
            int[] progressionOfNumbers = getProgression(PROGRESSION_LENGTH);
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == indexOfHiddenNumber) {
                    sb.append(".. ");
                } else {
                    sb.append(progressionOfNumbers[j] + " ");
                }
            }
            data[i][0] = sb.toString();
            data[i][1] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
    private static int[] getProgression(int progressionLength) {
        int[] progressionNumbers = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progressionNumbers[i] = i;
        }
        return progressionNumbers;
    }
}

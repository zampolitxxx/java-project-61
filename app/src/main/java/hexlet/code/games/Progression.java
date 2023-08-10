package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int progressionLength = 10;
    private static final int sizeStringbuffer = 3;           // Коэффициент для выделения памяти под stringbuffer
    public static final String RULES = "What number is missing in the progression?";
    private static String[][] data = new String[Engine.NUMBER_OF_ROUNDS][Engine.NUM_OF_ELEM];
    private static int correctResult = 0;
    private static String correctAnswer = "";
    public static void playProgression() {
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            StringBuffer sb = new StringBuffer(progressionLength * sizeStringbuffer);
            int indexOfHiddenNumber = (int) (Math.random() * progressionLength);
            correctResult = indexOfHiddenNumber;
            correctAnswer = Integer.toString(correctResult);
            int[] progressionOfNumbers = getProgression("sum", progressionLength);
            for (int j = 0; j < progressionLength; j++) {
                if (j == indexOfHiddenNumber) {
                    sb.append(".. ");
                } else {
                    sb.append(progressionOfNumbers[j] + " ");
                }
            }
            data[i][Engine.INDEX_OF_QESTION] = sb.toString();
            data[i][Engine.INDEX_OF_ANSWER] = correctAnswer;
        }
        Engine.startGame(RULES, data);
    }
    private static int[] getProgression(String mode, int progressionLength) {
        int[] progressionNumbers = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progressionNumbers[i] = i;
        }
        return progressionNumbers;
    }
}
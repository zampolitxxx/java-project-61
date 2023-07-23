package hexlet.code;
import java.lang.Math;

public class Game {
    private static final int minRandom = 1;
    private static final int maxRandom = 20;
    private static int score = 0;
    private static final int numberOfRounds = 3;

    public static boolean playParityNumber() {
        Engine.printMessage("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i <numberOfRounds; i++) {
            int randomNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            Engine.printMessage("Question: " + randomNumber);
            String answer = Engine.getStr("Your answer: ");
            if ((answer.equals("yes") && (randomNumber % 2) == 0) || (answer.equals("no") && (randomNumber % 2) != 0)) {
                Engine.printMessage("Correct!");
                score++;
            } else {
                if ((randomNumber % 2) != 0 & !answer.equals("no")) {
                    Engine.printMessage("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    Engine.printMessage("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                }
                return false;
            }
        }
        return true;
    }
    public static boolean playCalc() {
        char[] sign = {'+', '-', '*'};
        int result = 0;
        int usersResult = 0;
        Engine.printMessage("What is the result of the expression?");
        for (int i = 0; i <numberOfRounds; i++) {
            int firstNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            int secondNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            char signInExpression = sign[((int) (Math.random() * (sign.length)))];
            Engine.printMessage("Question: " + firstNumber + " " + signInExpression + " " + secondNumber);
            usersResult = Engine.getNumber("Your answer: ");
            switch(signInExpression) {
                case '-': result = firstNumber - secondNumber; break;
                case '+': result = firstNumber + secondNumber; break;
                case '*': result = firstNumber * secondNumber; break;
            }
            if (usersResult == result) {
                Engine.printMessage("Correct!");
                score++;
            }
            else {
                Engine.printMessage("'" + usersResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'." );
                return false;
            }

        }
        return true;
    }
    public static boolean playGCD() {
        Engine.printMessage("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < numberOfRounds; i++) {
            int firstNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            int secondNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            Engine.printMessage("Question: " + firstNumber + " " + secondNumber);
            int usersResult = Engine.getNumber("Your answer: ");
            int result = Engine.getGCD(firstNumber, secondNumber);
            if (usersResult == result) {
                Engine.printMessage("Correct!");
                score++;
            } else {
                Engine.printMessage("'" + usersResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'." );
                return false;
            }
        }
        return true;
    }

    public static boolean progression() {
        final int progressionLength = 10;
        int score = 0;
        int hzkaknazvat = 3;    // mnojitel dly Stringbuffer
        Engine.printMessage("What number is missing in the progression?");
        for (int i = 0; i < numberOfRounds; i++) {
            StringBuffer sb = new StringBuffer(progressionLength * hzkaknazvat);
            int indexOfHiddenNumber = (int) (Math.random() * progressionLength);
            int[] progressionOfNumbers = Engine.getProgression("sum", progressionLength);
            for (int j = 0; j < progressionLength; j++) {
                if (j == indexOfHiddenNumber) {
                    sb.append(" .. ");
                }
                else {
                    sb.append(progressionOfNumbers[j] + " ");
                }
            }
            Engine.printMessage("Question: "+ sb.toString());
            int userResult = Engine.getNumber("Your answer:");
            if (userResult == progressionOfNumbers[indexOfHiddenNumber]) {
                Engine.printMessage("Correct!");
                score++;
            } else {
                Engine.printMessage("'" + userResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + progressionOfNumbers[indexOfHiddenNumber] + "'.");
                return false;
            }
        }
        return true;
    }

    public static boolean playPrime() {
        int score = 0;
        int shiftNumber = 1;   //avoids one in a number of random numbers
        Engine.printMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < numberOfRounds; i++) {
            int randomNumber = shiftNumber + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            Engine.printMessage("Question: " + randomNumber);
            String userResponse = Engine.getStr("Your answer: ");
            if ((userResponse.equals("yes") & Engine.isPrime(randomNumber)) || (userResponse.equals("no") & !Engine.isPrime(randomNumber))) {
                Engine.printMessage("Correct!");
                score++;
            }
            else {
                if (Engine.isPrime(randomNumber)) {
                    Engine.printMessage("'" + userResponse + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    Engine.printMessage("'" + userResponse + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                }
                return false;
            }
        }
        return true;
    }
}



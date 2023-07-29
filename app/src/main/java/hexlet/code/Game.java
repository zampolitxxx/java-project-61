package hexlet.code;
import java.lang.Math;

public class Game {
    private static final int minRandom = 1;
    private static final int maxRandom = 20;


    public static String playParityNumber() {
            int randomNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
            Engine.printMessage("Question: " + randomNumber);
            String answer = Engine.getStr("Your answer: ");
            if ((answer.equals("yes") && (randomNumber % 2) == 0) || (answer.equals("no") && (randomNumber % 2) != 0)) {
                return "Correct!";
            } else {
                if ((randomNumber % 2) != 0 & !answer.equals("no")) {
                    return "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.";
                } else {
                    return "'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.";
                }
            }
    }

    public static String playCalc() {
        int usersResult = 0;
        int result = 0;
        char[] sign = {'+', '-', '*'};
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
            return "Correct!";
        }
        else {
            return "'" + usersResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.";
        }
    }
    public static String playGCD() {
        int firstNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        int secondNumber = 1 + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        Engine.printMessage("Question: " + firstNumber + " " + secondNumber);
        int usersResult = Engine.getNumber("Your answer: ");
        int result = Engine.getGCD(firstNumber, secondNumber);
        if (usersResult == result) {
            return "Correct!";
        } else {
            return "'" + usersResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.";
        }
    }

    public static String playProgression() {
        final int progressionLength = 10;
        int hzkaknazvat = 3;    // mnojitel dly Stringbuffer
        StringBuffer sb = new StringBuffer(progressionLength * hzkaknazvat);
        int indexOfHiddenNumber = (int) (Math.random() * progressionLength);
        int[] progressionOfNumbers = Engine.getProgression("sum", progressionLength);
        for (int j = 0; j < progressionLength; j++) {
            if (j == indexOfHiddenNumber) {
                sb.append(".. ");
            }
            else {
                sb.append(progressionOfNumbers[j] + " ");
            }
        }
        Engine.printMessage("Question: "+ sb.toString());
        int userResult = Engine.getNumber("Your answer: ");
        if (userResult == progressionOfNumbers[indexOfHiddenNumber]) {
            return "Correct!";
        } else {
            return "'" + userResult + "'" + " is wrong answer ;(. Correct answer was " + "'" + progressionOfNumbers[indexOfHiddenNumber] + "'.";
        }
    }

    public static String playPrime() {
        int shiftNumber = 1;   //avoids one in a number of random numbers
        int randomNumber = shiftNumber + (int) (Math.random() * (maxRandom - minRandom) + minRandom);
        Engine.printMessage("Question: " + randomNumber);
        String userResponse = Engine.getStr("Your answer: ");
        if ((userResponse.equals("yes") & Engine.isPrime(randomNumber)) || (userResponse.equals("no") & !Engine.isPrime(randomNumber))) {
            return "Correct!";
        }
        else {
            if (Engine.isPrime(randomNumber)) {
                return "'" + userResponse + "'" + " is wrong answer ;(. Correct answer was 'yes'.";
            } else {
                return "'" + userResponse + "'" + " is wrong answer ;(. Correct answer was 'no'.";
            }
        }
    }
}



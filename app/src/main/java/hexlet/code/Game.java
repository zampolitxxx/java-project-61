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
}



package hexlet.code;

//import org.apache.commons.lang3.ArrayUtils;

public class App {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static int score = 0;
    private static final int NUMBER_OF_QESTION_IN_STRUCT = 2;
    private static final String CORRECT_ANSWER = "Correct!";
    private static final int SWITCH_KEY_GREET = 1;
    private static final int SWITCH_KEY_EVEN = 2;
    private static final int SWITCH_KEY_CALC = 3;
    private static final int SWITCH_KEY_GCD = 4;
    private static final int SWITCH_KEY_PROGRESSION = 5;
    private static final int SWITCH_KEY_PRIME = 6;
    public static void main(String[] args) {
        String[][] games = {
                {"0", "Exit", ""},
                {"1", "Greet", ""},
                {"2", "Even", "Answer 'yes' if the number is even, otherwise answer 'no'."},
                {"3", "Calc", "What is the result of the expression?"},
                {"4", "GCD", "Find the greatest common divisor of given numbers."},
                {"5", "Progression", "What number is missing in the progression?"},
                {"6", "Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'."}
        };
        int choice = Engine.getGameNumber(games);
        /*
            If the player has won the round, the string "Correct!" is returned,
            otherwise we output the string with the correct answer and offer to play again
         */
        String result = "";

        if (choice == SWITCH_KEY_GREET) {
            Cli.greeting();
        }

        if (choice > 1 & choice < games.length) {
            Cli.greeting();
            Engine.printMessage(games[choice][NUMBER_OF_QESTION_IN_STRUCT]);
            do {
                switch (choice) {
                    case SWITCH_KEY_EVEN: result = Game.playParityNumber(); break;
                    case SWITCH_KEY_CALC: result = Game.playCalc(); break;
                    case SWITCH_KEY_GCD: result = Game.playGCD(); break;
                    case SWITCH_KEY_PROGRESSION: result = Game.playProgression(); break;
                    case SWITCH_KEY_PRIME: result = Game.playPrime(); break;
                    default: result = "Your choice is not correct";
                }
                if (result.equals(CORRECT_ANSWER)) {
                    Engine.printMessage(CORRECT_ANSWER);
                    score++;
                } else {
                    Engine.printMessage(result);
                    Engine.printMessage("Let's try again, " + Cli.getName() + "!");
                    break;
                }
            } while (score < NUMBER_OF_ROUNDS);
        }
        if (score == NUMBER_OF_ROUNDS) {
            Engine.printMessage("Congratulations, " + Cli.getName() + "!");
        }
    }
}

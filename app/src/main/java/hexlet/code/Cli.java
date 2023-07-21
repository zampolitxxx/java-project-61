package hexlet.code;

class Cli {
    public static String name = "";
    static void greeting() {
        Engine.printMessage("Welcome to the Brain Games!");
        Cli.name = Engine.getName("May I have your name? ");
        Engine.printMessage("Hello, " + name + "!");
    }
}

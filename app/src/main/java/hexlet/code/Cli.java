package hexlet.code;

class Cli {
    private static String name = "";

    public static String getName() {
        return name;
    }
    public static void greeting() {
        Engine.printMessage("Welcome to the Brain Games!");
        name = Engine.getName("May I have your name? ");
        Engine.printMessage("Hello, " + name + "!");
    }
}

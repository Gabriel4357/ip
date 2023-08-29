package duke;

import java.util.Scanner;

/**
 * This class is in charge of the user interface.
 *
 * It is in charge responding to the user.
 */
public class UI {
    private static String name;

    /**
     * Constructs a UI which has a name.
     *
     * @param name The name of the assistant.
     */
    public UI(String name){
        UI.name = name;
    }

    /**
     * Prints a long line.
     * This acts as a separator between commands typed in by the user
     * and responses from the assistant bot.
     */
    public static void printline() {
        System.out.println("____________________________________________________________");
    }

    /**
     * Prints a welcome message.
     * This is the first message the user will receive upon
     * using the program.
     */
    public void welcomeMessage() {
        printline();
        System.out.println(String.format("Hello I'm %s, your personal assistant.", UI.name));
        System.out.println("What can I do for you today, sir?");
        printline();
    }

    /**
     * Reads the input from the user and saves it as a string.
     *
     * @return The command keyed in by the user that will be passed
     * into the parser.
     */
    public String readCommand() {
        Scanner scanIn = new Scanner(System.in);
        String text = scanIn.nextLine();
        return text;
    }

    /**
     * Sends a message to the user.
     * Based on the parameter, a message will be
     * sent to the user.
     *
     * @param message The message that it to be sent to the user.
     */
    public void sendMessage(String message) {
        System.out.println(message);
    }

}

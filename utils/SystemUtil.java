package utils;

import java.io.IOException;

public class SystemUtil {

    public static final String ANSI_STRIKEOUT_BLACK = "\u001B[30;9m";
    public static final String ANSI_STRIKEOUT_RED = "\u001B[31;9m";
    public static final String ANSI_STRIKEOUT_GREEN = "\u001B[32;9m";
    public static final String ANSI_STRIKEOUT_YELLOW = "\u001B[33;9m";
    public static final String ANSI_STRIKEOUT_BLUE = "\u001B[34;9m";
    public static final String ANSI_STRIKEOUT_PURPLE = "\u001B[35;9m";
    public static final String ANSI_STRIKEOUT_CYAN = "\u001B[36;9m";
    public static final String ANSI_STRIKEOUT_WHITE = "\u001B[37;9m";

    public static void println(String color, String msg) {
        System.out.println(color + msg + color);
        System.out.println(ANSI_STRIKEOUT_WHITE);
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}

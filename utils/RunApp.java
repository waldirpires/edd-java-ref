package utils;

class RunApp {
    public static void main(String[] args) {

        System.out.print(Color.BLACK_BOLD);
        System.out.println("Black_Bold");
        System.out.print(Color.RESET);

        System.out.print(Color.YELLOW);
        System.out.print(Color.BLUE_BACKGROUND);
        System.out.println("YELLOW & BLUE");
        System.out.print(Color.RESET);

        System.out.print(Color.YELLOW);
        System.out.println("YELLOW");
        System.out.print(Color.RESET);
    }
}
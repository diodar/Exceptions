package Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String numberInString = getData();

        try {
            Integer.parseInt(numberInString);
            System.out.println("Number was successfully parsed in Int");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Typed text is NOT A NUMBER!!!");
        }
        System.out.println("Let the program continue to run");
    }

    private static String getData() {
        System.out.println("Type a number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

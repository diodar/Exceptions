package Task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = getData();

        try {
            validate(num);
        } catch (WarningTemperatureException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Let the program continue to run......");
    }

    private static void validate(int num) throws WarningTemperatureException {

        if (num < -10 || num > 35) {
            throw new WarningTemperatureException("It is NOT A NORMAL temperature for work");
        } else {
            System.out.println("It is a NORMAL temperature for work");
        }
    }

    private static int getData() {
        System.out.println("Type a temperature: ");
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        try {
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Typed text is not a number!!! Try again pls!" + '\n');
            return getData();
        }
        return Integer.parseInt(num);
    }
}
package Task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int money = 777;
        int num = getData();

        try {
            validate(num, money);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Let the program continue to run......");
    }

    private static void validate(int num, int money) {

        if (num <= 0 || num > money) {
            throw new IllegalArgumentException("There is NOT ENOUGH money on your card or the number is NEGATIVE " + num);
        } else {
            System.out.println("There is ENOUGH money on your card. Payment was made successful");
        }
    }

    private static int getData() {
        System.out.println("Type an amount that you would like to pay from the card: ");
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
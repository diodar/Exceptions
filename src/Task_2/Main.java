package Task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] prices = new int[]{50, 48, 75, 62, 57};

        try {
            int priceInDay = getData();
            System.out.println("Price was successfully found. The price was " + prices[priceInDay - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Wrong number!!!");
        }
        System.out.println("Let the program continue to run");
    }

    private static int getData() {
        System.out.println("""
                Choose a day to see a price:
                1 - monday
                2 - tuesday
                3 - wednesday
                4 - thursday
                5 - friday""");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        try {
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Typed text is NOT A NUMBER!!! Try again pls!" + '\n');
            return getData();
        }
        return Integer.parseInt(num);
    }
}
package rasul.sda;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.println("Enter 5 positive numbers:");
        while (count < 5) {
            number = scanner.nextInt();
            if (number > 0) {
                count++;
            }
            sum += number;
        }

        System.out.println("Enter 5 negative numbers:");
        while (count < 10) {
            number = scanner.nextInt();
            if (number < 0) {
                count++;
            }

            sum += number;
        }

        System.out.println("Sum of all entered numbers equals: " + sum);

    }
}


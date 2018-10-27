package rasul.sda;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        int max = 0;

        System.out.println("Enter numbers below:");

        while (count < 5) {
            number = scanner.nextInt();
            if (number > 0) {
                count++;

                if (number > max) {
                    max = number;
                }
            }
        }

        System.out.println("Largest number = " + max);

    }
}

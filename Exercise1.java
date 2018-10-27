package rasul.sda;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Read number you want to find a factorial of");

        int num = scanner.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial equals: " + fact);
    }
}

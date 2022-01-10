package lesson1;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert your first number");
        int firstValue = scanner.nextByte();

        System.out.println("Please, insert your second number");
        int secondValue = scanner.nextByte();

        System.out.println("Swap numbers using third variable");
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;
        System.out.println("1st number is " + firstValue);
        System.out.println("2nd number is " + secondValue);

        System.out.println("Swap numbers using sum option");
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;

        System.out.println("1st number is " + firstValue);
        System.out.println("2nd number is " + secondValue);

        System.out.println("Swap numbers using sum option");
        firstValue = firstValue ^ secondValue;
        secondValue = secondValue ^ firstValue;
        firstValue = secondValue ^ firstValue;

        System.out.println("1st number is " + firstValue);
        System.out.println("2nd number is " + secondValue);
    }
}

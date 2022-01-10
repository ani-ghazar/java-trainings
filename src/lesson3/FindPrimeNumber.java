package lesson3;

import java.util.*;

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(isPrimeNumber(number)) {
            System.out.print("You've got a Prime number!");
        } else {
            System.out.print("You've got a Composite number!");
        }


    }

    public static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i =1; i<number/2; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            return true;
        }

        return false;
    }

}

package lesson3;

import java.util.*;

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert a number!");
        int number = scanner.nextInt();

        if(isPrimeNumber(number)) {
            System.out.print("You've got a Prime number!");
        } else {
            System.out.print("You've got a Composite number!");
        }


    }

    public static boolean isPrimeNumber(int number) {
        for (int i =2; i<Math.sqrt(number); i++) {
            System.out.println("I was here");
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}

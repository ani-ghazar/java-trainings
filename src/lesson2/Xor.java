package lesson2;

import java.util.*;

public class Xor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert your first number");
        int firstValue = scanner.nextByte();

        System.out.println("Please, insert your second number");
        int secondValue = scanner.nextByte();

        int i = firstValue & secondValue;


        //System.out.printf("This is it " + fs);
    }
}

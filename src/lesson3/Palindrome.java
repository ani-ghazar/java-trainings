package lesson3;

public class Palindrome {

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 3, 4};

        int length = arr.length;
        int i = 0;
        while (i != length/2) {
            if (arr[i] != arr[length-1-i]) {
                System.out.printf("Not a Poligrom");
                return;
            }
            i++;
        }

        System.out.printf("Is Poligrom");

    }
}

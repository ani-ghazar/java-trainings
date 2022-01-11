package lesson3;

public class Palindrome {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};

        int length = arr.length;
        int i = 0;
        while (i != length/2) {
            if (arr[i] != arr[length-1-i]) {
                System.out.println("The given array is not a Palindrome");
                return;
            }
            i++;
        }

        System.out.println("The given array is Palindrome");

    }
}

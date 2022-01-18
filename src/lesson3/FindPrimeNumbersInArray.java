package lesson3;

public class FindPrimeNumbersInArray {

    public static void main(String[] args) {
        int[] arr1 = {101, 12, 22, 98, 32, 23, 55, 101, 123, 45, 55, 45, 111};
        int[] arr2 = new int[arr1.length];
        int sizeOfArr2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (FindPrimeNumber.isPrimeNumber(arr1[i])) {
                arr2[sizeOfArr2] = arr1[i];
                sizeOfArr2++;
            }
        }

        System.out.println("The prime numbers in the given array is/are:");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                System.out.println(arr2[i]);
            }
        }

    }
}

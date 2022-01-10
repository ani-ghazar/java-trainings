package lesson3;

public class FindPrimeNumbersInArray {

    public static void main(String[] args) {
        int[] arr1 = {111, 12, 22, 98, 32, 23, 55, 111, 123, 45, 55, 45, 111};
        int[] arr2 = new int[arr1.length];
        int size = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (FindPrimeNumber.isPrimeNumber(arr1[i])) {
                arr2[size] = arr1[i];
                size++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}

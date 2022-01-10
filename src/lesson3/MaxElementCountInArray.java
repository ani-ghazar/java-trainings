package lesson3;

public class MaxElementCountInArray {

    public static void main(String[] args) {
        int[] arr = {111, 12, 22, 98, 32, 23, 55, 111, 123, 45, 55, 45, 111};

        if (arr.length < 1) {
            System.out.print("Array is empty");
            return;
        }
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }

        System.out.printf("Maximum element in array is " + max + ", which exists " + count + " times");
    }
}
